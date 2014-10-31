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
import java.util.Random;
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
    private int rayaV;
    private int X;
    private int Y;
    private Lista listComp;
    JLabel ands;
    private boolean press = false;
    private boolean intersecs = false;
    private boolean enter = false;
    ObtenerEntradas entrarVal;
    public boolean ingresar;
    private int numEntradas;
    
    
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
        rayaV=0;
        listComp= new Lista();
        ands= new JLabel();
        Connect = new ConecComp();
        val= new cuadroVal();
        entrarVal = new ObtenerEntradas();
        numEntradas=0;
        initComponents();
        
    }
    
    private void SetImage(int i){
        if(numEntradas != 0 && ingresar == true)
            listComp.insertHead(ands);
        if(i==0){
            and++;
            val.setTotalL("and"+ Integer.toString(and));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/and.png")));
        }else if(i==1){
             or++;
            val.setTotalL("or"+ Integer.toString(or));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/or.png")));
        }else if(i==2){
            not++;
            val.setTotalL("not"+ Integer.toString(not));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/not.png")));
        }else if(i==3){
            nand++;
            val.setTotalL("nand"+ Integer.toString(nand));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nand.png")));
        }else if(i==4){
            nor++;
            val.setTotalL("nor"+ Integer.toString(nor));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nor.png")));
        }else if(i==5){
            xor++;
            val.setTotalL("xor"+ Integer.toString(xor));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xor.png")));
        }else if(i==6){
           xnor++;
            val.setTotalL("xnor"+ Integer.toString(xnor));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Xnor.png"))); 
        }
        getContentPane().add(ands);
        fondo.add(ands);
        ands.setBounds(200, 200, 95, 73);
        numEntradas ++;
        ingresar= true;
    }
    
    private String Rndraya(int j){
        String [] arregloRnd={"/imagenes/raya1.png","/imagenes/raya2.png","/imagenes/raya3.png","/imagenes/raya4.png","/imagenes/raya5.png","/imagenes/raya6.png"};
        String [] arregloRndV={"/imagenes/raya1V.png","/imagenes/raya2V.png","/imagenes/raya3V.png","/imagenes/raya4V.png","/imagenes/raya5V.png","/imagenes/raya6V.png"};
        Random rnd = new Random();
        int i= rnd.nextInt(5);
        if (j==0){
            String temp= arregloRnd[i];
            return temp;
        }
        else{
            String temp= arregloRndV[i];
            return temp;
        }
    }

    private void CodRaya(int i){
        if(i==0){
            if(numEntradas != 0 && ingresar == true)
                listComp.insertHead(ands);
            raya++;
            val.setTotalL("raya"+ Integer.toString(raya));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource(Rndraya(0))));
            getContentPane().add(ands);
            fondo.add(ands);
            ands.setBounds(200, 200, 95, 73);
            numEntradas ++;
            ingresar =true;
        }
        else{
            if(numEntradas != 0 && ingresar == true)
                listComp.insertHead(ands);
            rayaV++;
            val.setTotalL("rayaV"+ Integer.toString(rayaV));
            ands= new JLabel(new javax.swing.ImageIcon(getClass().getResource(Rndraya(1))));
            getContentPane().add(ands);
            fondo.add(ands);
            ands.setBounds(200, 200, 95, 73);
            numEntradas ++;
            ingresar =true;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClickDer = new javax.swing.JPopupMenu();
        SetIn = new javax.swing.JMenuItem();
        Del = new javax.swing.JMenuItem();
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
        BtnrayaV = new javax.swing.JButton();
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

        SetIn.setText("Establecer entradas de compuerta");
        SetIn.setToolTipText("Establecer entradas de compuerta");
        ClickDer.add(SetIn);

        Del.setText("Borrar elemento");
        Del.setToolTipText(" Borrar elemento");
        ClickDer.add(Del);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagramador de compuertas\n");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(100, 22, 680, 520));
        setMinimumSize(new java.awt.Dimension(950, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        BtnAnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/and.jpg"))); // NOI18N
        BtnAnd.setToolTipText("And");
        BtnAnd.setBorderPainted(false);
        BtnAnd.setComponentPopupMenu(ClickDer);
        BtnAnd.setContentAreaFilled(false);
        BtnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAndActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAnd);
        BtnAnd.setBounds(0, 50, 87, 29);

        BtnOr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/or.jpg"))); // NOI18N
        BtnOr.setToolTipText("Or");
        BtnOr.setBorderPainted(false);
        BtnOr.setComponentPopupMenu(ClickDer);
        BtnOr.setContentAreaFilled(false);
        BtnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrActionPerformed(evt);
            }
        });
        jPanel1.add(BtnOr);
        BtnOr.setBounds(10, 90, 70, 29);

        BtnNot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/not.jpg"))); // NOI18N
        BtnNot.setToolTipText("Not");
        BtnNot.setBorderPainted(false);
        BtnNot.setComponentPopupMenu(ClickDer);
        BtnNot.setContentAreaFilled(false);
        BtnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNotActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNot);
        BtnNot.setBounds(10, 130, 70, 29);

        BtnNand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nand.jpg"))); // NOI18N
        BtnNand.setToolTipText("Nand");
        BtnNand.setBorderPainted(false);
        BtnNand.setComponentPopupMenu(ClickDer);
        BtnNand.setContentAreaFilled(false);
        BtnNand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNandActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNand);
        BtnNand.setBounds(10, 180, 70, 29);

        BtnNor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nor.jpg"))); // NOI18N
        BtnNor.setToolTipText("Nor");
        BtnNor.setBorderPainted(false);
        BtnNor.setComponentPopupMenu(ClickDer);
        BtnNor.setContentAreaFilled(false);
        BtnNor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnNor);
        BtnNor.setBounds(10, 230, 70, 29);

        BtnXor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xor.jpg"))); // NOI18N
        BtnXor.setToolTipText("Xor");
        BtnXor.setBorderPainted(false);
        BtnXor.setComponentPopupMenu(ClickDer);
        BtnXor.setContentAreaFilled(false);
        BtnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnXor);
        BtnXor.setBounds(10, 270, 70, 40);

        BtnXnor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/xnor.jpg"))); // NOI18N
        BtnXnor.setToolTipText("Xnor");
        BtnXnor.setBorderPainted(false);
        BtnXnor.setComponentPopupMenu(ClickDer);
        BtnXnor.setContentAreaFilled(false);
        BtnXnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXnorActionPerformed(evt);
            }
        });
        jPanel1.add(BtnXnor);
        BtnXnor.setBounds(10, 320, 70, 29);

        BtnRaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raya.jpg"))); // NOI18N
        BtnRaya.setToolTipText("Conexion");
        BtnRaya.setBorderPainted(false);
        BtnRaya.setComponentPopupMenu(ClickDer);
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
        jLabel2.setBounds(10, 10, 90, 19);

        BtnrayaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rayaV.jpg"))); // NOI18N
        BtnrayaV.setToolTipText("Conexion vertical");
        BtnrayaV.setBorderPainted(false);
        BtnrayaV.setComponentPopupMenu(ClickDer);
        BtnrayaV.setContentAreaFilled(false);
        BtnrayaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnrayaVActionPerformed(evt);
            }
        });
        jPanel1.add(BtnrayaV);
        BtnrayaV.setBounds(20, 410, 50, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 100, 990);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Kokonor", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIAGRAMADOR DE COMPUERTAS LOGICAS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 382, 24);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(100, 0, 1310, 980);

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
        SetImage(0);
    }//GEN-LAST:event_BtnAndActionPerformed

    private void BtnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrActionPerformed
        SetImage(1);
    }//GEN-LAST:event_BtnOrActionPerformed

    private void BtnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNotActionPerformed
        SetImage(2);
    }//GEN-LAST:event_BtnNotActionPerformed

    private void BtnNandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNandActionPerformed
        SetImage(3);
    }//GEN-LAST:event_BtnNandActionPerformed

    private void BtnNorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNorActionPerformed
        SetImage(4);
    }//GEN-LAST:event_BtnNorActionPerformed

    private void BtnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXorActionPerformed
        SetImage(5);
    }//GEN-LAST:event_BtnXorActionPerformed

    private void BtnXnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXnorActionPerformed
        SetImage(6);
    }//GEN-LAST:event_BtnXnorActionPerformed

    private void entradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradasActionPerformed
        // TODO add your handling code here:
       entrarVal.setVisible(true);
    }//GEN-LAST:event_entradasActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        // TODO add your handling code here:
        Connect.setVisible(true);
    }//GEN-LAST:event_connectActionPerformed

    private void BtnRayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRayaActionPerformed
        // TODO add your handling code here:
        CodRaya(0);
    }//GEN-LAST:event_BtnRayaActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(ingresar == true){
            System.out.println("ingreso a este espacio");
            listComp.insertHead(ands);
            ingresar = false;
        }
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
        System.out.println("ok");
        X=evt.getX()-108;
        Y=evt.getY()-53;
        System.out.println("X:" +X+ " Y: "+Y);
        if(press== true && intersecs == true && enter == true){
            System.out.println("saprissa");
            ands.setBounds(X-100,Y-100, 90,73);
        } 
    }//GEN-LAST:event_formMouseMoved

    private void BtnrayaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnrayaVActionPerformed
        // TODO add your handling code here:
        CodRaya(1);
    }//GEN-LAST:event_BtnrayaVActionPerformed

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
    private javax.swing.JButton BtnrayaV;
    private javax.swing.JPopupMenu ClickDer;
    private javax.swing.JMenuItem Del;
    private javax.swing.JMenuItem SetIn;
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
    private javax.swing.JMenu opciones;
    private javax.swing.JMenuItem out;
    private javax.swing.JMenuItem qwerty;
    // End of variables declaration//GEN-END:variables

}
