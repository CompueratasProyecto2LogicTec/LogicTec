/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuertas;
import java.awt.Container;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import logica.*;
/**
 *
 * @author ellioth
 */
public class Principal extends javax.swing.JFrame {
    private ConecComp Connect;
    private cuadroVal val;
    private CargarImage img;
    private Sprite cuadro;
    private PosImagen posImg;
    private BufferedImage imagen;
    private int and;
    private int or;
    private int not;
    private int xor;
    private int xnor;
    private int nor;
    private int nand;
    private int raya;
    private int X;
    private int Y;
    private Lista listComp;
    JLabel ands;
    private boolean press = false;
    private boolean intersecs = false;
    private boolean enter = false;
    ObtenerEntradas entrarVal;
    
    /**
     * Creates new form ventan1
     */
    public Principal() {
        and=0;
        or = 0;
        not = 0;
        xor = 0;
        xnor = 0;
        nor = 0;
        nand = 0;
        raya= 0;
        X=0;
        Y=0;
        listComp= new Lista();
        ands= new JLabel();
        Connect = new ConecComp();
        val= new cuadroVal();
        entrarVal = new ObtenerEntradas();
        initComponents();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        BtnAnd = new javax.swing.JButton();
        BtnOr = new javax.swing.JButton();
        BtnNot = new javax.swing.JButton();
        BtnNand = new javax.swing.JButton();
        BtnNor = new javax.swing.JButton();
        BtnXor = new javax.swing.JButton();
        BtnXnor = new javax.swing.JButton();
        BtnRaya = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        connect = new javax.swing.JMenuItem();
        entradas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        check = new javax.swing.JMenuItem();
        qwerty = new javax.swing.JMenuItem();
        out = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagramador de compuertas\n");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(100, 22, 680, 520));
        setMinimumSize(new java.awt.Dimension(680, 520));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        BtnAnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/and.jpg"))); // NOI18N
        BtnAnd.setBorderPainted(false);
        BtnAnd.setContentAreaFilled(false);
        BtnAnd.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BtnAndMouseDragged(evt);
            }
        });
        BtnAnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAndMousePressed(evt);
            }
        });
        BtnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAndActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAnd);
        BtnAnd.setBounds(10, 50, 87, 29);

        BtnOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/or.jpg"))); // NOI18N
        BtnOr.setBorderPainted(false);
        BtnOr.setContentAreaFilled(false);
        BtnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrActionPerformed(evt);
            }
        });
        jPanel1.add(BtnOr);
        BtnOr.setBounds(10, 90, 70, 29);

        BtnNot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/not.jpg"))); // NOI18N
        BtnNot.setBorderPainted(false);
        BtnNot.setContentAreaFilled(false);
        BtnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNot);
        BtnNot.setBounds(10, 130, 70, 29);

        BtnNand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nand.jpg"))); // NOI18N
        BtnNand.setBorderPainted(false);
        BtnNand.setContentAreaFilled(false);
        BtnNand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNandActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNand);
        BtnNand.setBounds(10, 180, 70, 29);

        BtnNor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nor.jpg"))); // NOI18N
        BtnNor.setBorderPainted(false);
        BtnNor.setContentAreaFilled(false);
        BtnNor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNor);
        BtnNor.setBounds(10, 230, 70, 29);

        BtnXor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xor.jpg"))); // NOI18N
        BtnXor.setBorderPainted(false);
        BtnXor.setContentAreaFilled(false);
        BtnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnXor);
        BtnXor.setBounds(10, 270, 70, 40);

        BtnXnor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xnor.jpg"))); // NOI18N
        BtnXnor.setBorderPainted(false);
        BtnXnor.setContentAreaFilled(false);
        BtnXnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXnorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnXnor);
        BtnXnor.setBounds(10, 320, 70, 29);

        BtnRaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raya.jpg"))); // NOI18N
        BtnRaya.setBorderPainted(false);
        BtnRaya.setContentAreaFilled(false);
        BtnRaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRayaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRaya);
        BtnRaya.setBounds(0, 370, 97, 29);

        jLabel2.setFont(new java.awt.Font("Kokonor", 1, 14)); // NOI18N
        jLabel2.setText("compuertas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 80, 19);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 470);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Kokonor", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIAGRAMADOR DE COMPUERTAS LOGICAS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 382, 24);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(100, 0, 550, 470);

        opciones.setText("Opciones");

        connect.setText("Conectar compuertas");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });
        opciones.add(connect);

        entradas.setText("Establecer entradas");
        entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradasActionPerformed(evt);
            }
        });
        opciones.add(entradas);

        jMenuItem1.setText("Revisar");
        opciones.add(jMenuItem1);

        check.setText("Salvar");
        opciones.add(check);

        qwerty.setText("Calcular cuadro de diagrama");
        opciones.add(qwerty);

        out.setText("Salir");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        opciones.add(out);

        jMenuBar1.add(opciones);

        jMenu2.setText("Ayuda");

        jMenuItem5.setText("Informacion");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Como usar");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_outActionPerformed

    private void BtnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAndActionPerformed
        listComp.insertHead(ands);
        and++;
        val.setTotalL("and"+ Integer.toString(and));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/and.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnAndActionPerformed

    private void BtnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrActionPerformed
        listComp.insertHead(ands);
        or++;
        val.setTotalL("or"+ Integer.toString(or));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/or.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnOrActionPerformed

    private void BtnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotActionPerformed
        listComp.insertHead(ands);
        not++;
        val.setTotalL("not"+ Integer.toString(not));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/not.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnNotActionPerformed

    private void BtnNandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNandActionPerformed
        listComp.insertHead(ands);
        nand++;
        val.setTotalL("nand"+ Integer.toString(nand));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nand.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnNandActionPerformed

    private void BtnNorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNorActionPerformed
        listComp.insertHead(ands);
        nor++;
        val.setTotalL("nor"+ Integer.toString(nor));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nor.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnNorActionPerformed

    private void BtnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXorActionPerformed
        listComp.insertHead(ands);
        xor++;
        val.setTotalL("xor"+ Integer.toString(xor));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xor.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnXorActionPerformed

    private void BtnXnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXnorActionPerformed
        listComp.insertHead(ands);
        xnor++;
        val.setTotalL("xnor"+ Integer.toString(xnor));
        ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Xnor.png")));
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
    }//GEN-LAST:event_BtnXnorActionPerformed

    private void entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradasActionPerformed
        // TODO add your handling code here:
       entrarVal.setVisible(true);
    }//GEN-LAST:event_entradasActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
        Connect.setVisible(true);
    }//GEN-LAST:event_connectActionPerformed

    private void BtnAndMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAndMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnAndMousePressed

    private void BtnRayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRayaActionPerformed
        // TODO add your handling code here:
        raya++;
        val.setTotalL("raya"+ Integer.toString(raya));
    }//GEN-LAST:event_BtnRayaActionPerformed

    private void BtnAndMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAndMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAndMouseDragged

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if ((enter == false)){
            System.out.println("entra");
            Rectangle comp = new Rectangle(X,Y,5,5);
            Node tmp= listComp.getHead();
            while (tmp!= null){
                Rectangle temp= new Rectangle(((JLabel) tmp.get_data()).getLocation().x,((JLabel) tmp.get_data()).getLocation().y,((JLabel) tmp.get_data()).getSize().width, ((JLabel) tmp.get_data()).getSize().height);
                System.out.println(temp);
                if(temp.intersects(comp)){
                    System.out.println("ES TEMP "+ temp);
                    enter = true;
                    press = true;
                        intersecs = true;
                        System.out.println("entrada");
                        listComp.insertHead(ands);
                        ands=((JLabel) tmp.get_data());
                        break;
                    }else{
                        press = false;
                        intersecs = false;
                    }
                    System.out.println(intersecs);
                    tmp= tmp.getNext();
            }
        }else
            enter = false;
    }//GEN-LAST:event_formMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        X=evt.getX()-108;
        Y=evt.getY()-53;
        System.out.println("X:" +X+ " Y: "+Y);
        if(press== true && intersecs == true && enter == true){
            System.out.println("saprissa");
            ands.setBounds(X-100,Y-100, 90,73);
        } 
    }//GEN-LAST:event_formMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnd;
    private javax.swing.JButton BtnNand;
    private javax.swing.JButton BtnNor;
    private javax.swing.JButton BtnNot;
    private javax.swing.JButton BtnOr;
    private javax.swing.JButton BtnRaya;
    private javax.swing.JButton BtnXnor;
    private javax.swing.JButton BtnXor;
    private javax.swing.JMenuItem check;
    private javax.swing.JMenuItem connect;
    private javax.swing.JMenuItem entradas;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu opciones;
    private javax.swing.JMenuItem out;
    private javax.swing.JMenuItem qwerty;
    // End of variables declaration//GEN-END:variables
}
