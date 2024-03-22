/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab_ex2p2_carlosbonilla;

import com.sun.jdi.IntegerValue;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lospe
 */
public class main extends javax.swing.JFrame {
    //ASIENTO 4, FILA 2,CARLOS BONILLA
ArrayList <Carros> carros =new ArrayList();
Archivos adm=new Archivos();
    /**
     * Creates new form main
     */
    public main() throws IOException {
        initComponents();
        carros=adm.getarchivo();
          adm.setarchivo(carros);
      
        
        DefaultComboBoxModel m1=(DefaultComboBoxModel)cboxP1.getModel();
        DefaultComboBoxModel m2=(DefaultComboBoxModel)cboxP2.getModel();
        for (int i = 0; i < carros.size(); i++) {
        m1.addElement(carros.get(i).getBrand());
        m2.addElement(carros.get(i).getBrand());
        }
        cboxP1.setModel(m1);
        cboxP2.setModel(m2);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_Crear = new javax.swing.JFrame();
        jp_Crear = new javax.swing.JPanel();
        jl_modelo = new javax.swing.JLabel();
        jl_marca = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_crearModelo = new javax.swing.JTextField();
        tf_crearMarca = new javax.swing.JTextField();
        bt_CrearCarro = new javax.swing.JButton();
        sp_crearVelocidad = new javax.swing.JSpinner();
        jf_Play = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        barra1 = new javax.swing.JProgressBar();
        barra2 = new javax.swing.JProgressBar();
        jl_p1 = new javax.swing.JLabel();
        jl_p2 = new javax.swing.JLabel();
        cronometroP1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bt_crearCarros = new javax.swing.JButton();
        cboxP2 = new javax.swing.JComboBox<>();
        cboxP1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_MarcaP2 = new javax.swing.JTextField();
        tf_MarcaP1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_ModeloP2 = new javax.swing.JTextField();
        tf_ModeloP1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_VelocidadP1 = new javax.swing.JTextField();
        tf_VelocidadP2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jl_modelo.setBackground(new java.awt.Color(255, 255, 255));
        jl_modelo.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jl_modelo.setForeground(new java.awt.Color(0, 0, 0));
        jl_modelo.setText("Modelo");

        jl_marca.setBackground(new java.awt.Color(255, 255, 255));
        jl_marca.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jl_marca.setForeground(new java.awt.Color(0, 0, 0));
        jl_marca.setText("Marca");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Velocidad");

        bt_CrearCarro.setText("Crear Carro");
        bt_CrearCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearCarroActionPerformed(evt);
            }
        });

        sp_crearVelocidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 300, 1));

        javax.swing.GroupLayout jp_CrearLayout = new javax.swing.GroupLayout(jp_Crear);
        jp_Crear.setLayout(jp_CrearLayout);
        jp_CrearLayout.setHorizontalGroup(
            jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearLayout.createSequentialGroup()
                .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jl_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CrearLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(tf_crearModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_CrearLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jl_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_CrearLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_crearMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_CrearCarro))))
                .addGap(55, 55, 55)
                .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp_crearVelocidad))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jp_CrearLayout.setVerticalGroup(
            jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CrearLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_marca)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jp_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_crearModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_crearMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_crearVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(bt_CrearCarro)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jf_CrearLayout = new javax.swing.GroupLayout(jf_Crear.getContentPane());
        jf_Crear.getContentPane().setLayout(jf_CrearLayout);
        jf_CrearLayout.setHorizontalGroup(
            jf_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_CrearLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jf_CrearLayout.setVerticalGroup(
            jf_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        barra1.setMaximum(300);

        barra2.setMaximum(300);

        jl_p1.setText("Player 1");

        jl_p2.setText("Player 2");

        cronometroP1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cronometroP1.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(jl_p1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(cronometroP1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(barra1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                            .addComponent(barra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jl_p2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_p1)
                    .addComponent(cronometroP1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jl_p2)
                .addGap(39, 39, 39)
                .addComponent(barra2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout jf_PlayLayout = new javax.swing.GroupLayout(jf_Play.getContentPane());
        jf_Play.getContentPane().setLayout(jf_PlayLayout);
        jf_PlayLayout.setHorizontalGroup(
            jf_PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_PlayLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 119, Short.MAX_VALUE))
        );
        jf_PlayLayout.setVerticalGroup(
            jf_PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_PlayLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_crearCarros.setText("Crear Carros");
        bt_crearCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearCarrosMouseClicked(evt);
            }
        });

        cboxP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxP2ItemStateChanged(evt);
            }
        });

        cboxP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxP1ItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Marca");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Marca");

        tf_MarcaP2.setEditable(false);
        tf_MarcaP2.setBackground(new java.awt.Color(255, 255, 255));

        tf_MarcaP1.setEditable(false);
        tf_MarcaP1.setBackground(new java.awt.Color(255, 255, 255));
        tf_MarcaP1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Modelo");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Modelo");

        tf_ModeloP2.setEditable(false);
        tf_ModeloP2.setBackground(new java.awt.Color(255, 255, 255));
        tf_ModeloP2.setForeground(new java.awt.Color(0, 0, 0));

        tf_ModeloP1.setEditable(false);
        tf_ModeloP1.setBackground(new java.awt.Color(255, 255, 255));
        tf_ModeloP1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Velocidad");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Velocidad");

        tf_VelocidadP1.setEditable(false);
        tf_VelocidadP1.setBackground(new java.awt.Color(255, 255, 255));
        tf_VelocidadP1.setForeground(new java.awt.Color(0, 0, 0));

        tf_VelocidadP2.setEditable(false);
        tf_VelocidadP2.setBackground(new java.awt.Color(255, 255, 255));
        tf_VelocidadP2.setForeground(new java.awt.Color(0, 0, 0));
        tf_VelocidadP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_VelocidadP2ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("En sus Marcas...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(bt_crearCarros)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboxP1, 0, 135, Short.MAX_VALUE)
                    .addComponent(tf_MarcaP1)
                    .addComponent(tf_ModeloP1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_VelocidadP1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_ModeloP2)
                    .addComponent(cboxP2, 0, 137, Short.MAX_VALUE)
                    .addComponent(tf_MarcaP2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_VelocidadP2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_crearCarros)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_MarcaP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_MarcaP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_ModeloP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_ModeloP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_VelocidadP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_VelocidadP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_VelocidadP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_VelocidadP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_VelocidadP2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (cboxP1.getSelectedIndex()==cboxP2.getSelectedIndex()) {
            JOptionPane.showMessageDialog(this, "TIENES QUE ELEGIR 2 CARROS DIFERENTES");
        }else{
            jl_p1.setText(tf_ModeloP1.getText());
            jl_p2.setText(tf_ModeloP2.getText());
            jf_Play.pack();
       jf_Play.setLocationRelativeTo(this);
       jf_Play.setVisible(true);
        Carrera h=new Carrera(Integer.valueOf(tf_VelocidadP1.getText()),Integer.parseInt(tf_VelocidadP2.getText()),barra1,barra2,tf_ModeloP1.getText(),tf_ModeloP2.getText(),jf_Play,cronometroP1);
        Thread hilo1 = new Thread(h);
        hilo1.start();  
        }
   
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboxP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxP2ItemStateChanged
        
        tf_ModeloP2.setText(carros.get(cboxP2.getSelectedIndex()).getModel());
        tf_MarcaP2.setText(carros.get(cboxP2.getSelectedIndex()).getBrand());
        tf_VelocidadP2.setText(carros.get(cboxP2.getSelectedIndex()).getSpeed() + "");
    }//GEN-LAST:event_cboxP2ItemStateChanged

    private void cboxP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxP1ItemStateChanged
        tf_ModeloP1.setText(carros.get(cboxP1.getSelectedIndex()).getModel());
        tf_MarcaP1.setText(carros.get(cboxP1.getSelectedIndex()).getBrand());
        tf_VelocidadP1.setText(carros.get(cboxP1.getSelectedIndex()).getSpeed() + "");
    }//GEN-LAST:event_cboxP1ItemStateChanged

    private void bt_CrearCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearCarroActionPerformed
        if (tf_crearMarca.getText().equals("")&&tf_crearModelo.getText().equals("")&&tf_crearMarca.getText().equals("")) {
            
        }else{
            carros.add(new Carros((Integer)sp_crearVelocidad.getValue(),tf_crearMarca.getText(),tf_crearModelo.getText()));
            tf_crearMarca.setText("");
            tf_crearModelo.setText("");
           
            try {  
                adm.setarchivo(carros);
            } catch (IOException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
             DefaultComboBoxModel m1=(DefaultComboBoxModel)cboxP1.getModel();
             m1=new DefaultComboBoxModel();
        DefaultComboBoxModel m2=(DefaultComboBoxModel)cboxP2.getModel();
        m2=new DefaultComboBoxModel();
        for (int i = 0; i < carros.size(); i++) {
        m1.addElement(carros.get(i).getBrand());
        m2.addElement(carros.get(i).getBrand());
        }
        cboxP1.setModel(m1);
        cboxP2.setModel(m2);
           
    }//GEN-LAST:event_bt_CrearCarroActionPerformed
    }
    private void bt_crearCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearCarrosMouseClicked

     
		
        jf_Crear.pack();
       jf_Crear.setLocationRelativeTo(this);
       jf_Crear.setVisible(true);
    }//GEN-LAST:event_bt_crearCarrosMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra1;
    private javax.swing.JProgressBar barra2;
    private javax.swing.JButton bt_CrearCarro;
    private javax.swing.JButton bt_crearCarros;
    private javax.swing.JComboBox<String> cboxP1;
    private javax.swing.JComboBox<String> cboxP2;
    private javax.swing.JLabel cronometroP1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFrame jf_Crear;
    private javax.swing.JFrame jf_Play;
    private javax.swing.JLabel jl_marca;
    private javax.swing.JLabel jl_modelo;
    private javax.swing.JLabel jl_p1;
    private javax.swing.JLabel jl_p2;
    private javax.swing.JPanel jp_Crear;
    private javax.swing.JSpinner sp_crearVelocidad;
    private javax.swing.JTextField tf_MarcaP1;
    private javax.swing.JTextField tf_MarcaP2;
    private javax.swing.JTextField tf_ModeloP1;
    private javax.swing.JTextField tf_ModeloP2;
    private javax.swing.JTextField tf_VelocidadP1;
    private javax.swing.JTextField tf_VelocidadP2;
    private javax.swing.JTextField tf_crearMarca;
    private javax.swing.JTextField tf_crearModelo;
    // End of variables declaration//GEN-END:variables
}
