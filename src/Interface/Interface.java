/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



package Interface;

import Handler.Reservation;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Handler.Schedule;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localTime;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class Interface extends javax.swing.JFrame {

    Schedule schedule = new Schedule();
    
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        
        TableColumn firstColumn = table.getColumnModel().getColumn(0);
        firstColumn.setPreferredWidth(1);
        
    }

    public void showReserve(Reservation reservation) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaBuscada = reservation.getBeginTime().format(formatter);

        String diaBuscado = reservation.getDay();
        String nuevoValor = reservation.toString();

        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            String horaEnTabla = (String) modelo.getValueAt(fila, 0);
            String diaEnTabla = (String) modelo.getValueAt(fila, 1); 

            if (horaEnTabla.equals(horaBuscada) && diaEnTabla.equals(diaBuscado)) {
                
                modelo.setValueAt(nuevoValor, fila, 2); 
                break;  
           }
        }
    }
    
    /**
     * This method is called from within the
     * constructor to initialize the form.
     * WARNING: Do NOT modify this code. The
     * content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Secciones = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        Semestre = new javax.swing.JComboBox<>();
        Carreras = new javax.swing.JComboBox<>();
        LapsoAcademico = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        Reservar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 71, 179));

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 71, 179));
        jButton2.setText("Iniciar Sesión");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Secciones.setBackground(java.awt.Color.white);
        Secciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Secciones.setForeground(new java.awt.Color(0, 71, 179));
        Secciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secciones" }));
        Secciones.setName("Semestres"); // NOI18N
        Secciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeccionesActionPerformed(evt);
            }
        });

        jComboBox5.setBackground(java.awt.Color.white);
        jComboBox5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 71, 179));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "semana" }));
        jComboBox5.setName("Semestres"); // NOI18N
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        Semestre.setBackground(java.awt.Color.white);
        Semestre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Semestre.setForeground(new java.awt.Color(0, 71, 179));
        Semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4" }));
        Semestre.setName("Semestres"); // NOI18N
        Semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestreActionPerformed(evt);
            }
        });

        Carreras.setBackground(java.awt.Color.white);
        Carreras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Carreras.setForeground(new java.awt.Color(0, 71, 179));
        Carreras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyecto de Carrera", "Administración De Empresas", "Administración Mención Banca Y Finanzas", "Ciencias Ambientales", "Ciencias FIscales", "Contaduría Pública", "Educación En Ciencias", "Educación Integral", "Educación. Mención Educación Física...", "Educación. Mención Lengua y Literatura...", "Educación. Mención Matemática", "Ingeniería En Informática", "Ingeniería En Materiales", "Ingeniería Industrial", "Licenciatura En Gestión De Alojamiento Turístico", "+ Añadir Proyecto de Carrera" }));
        Carreras.setName("Semestres"); // NOI18N
        Carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrerasActionPerformed(evt);
            }
        });

        LapsoAcademico.setBackground(java.awt.Color.white);
        LapsoAcademico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LapsoAcademico.setForeground(new java.awt.Color(0, 71, 179));
        LapsoAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lapso 2023-II", "+ Nuevo Lapso" }));
        LapsoAcademico.setName("Semestres"); // NOI18N
        LapsoAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LapsoAcademicoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Horarios");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UNEG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(Carreras, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LapsoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Secciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Secciones, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carreras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LapsoAcademico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1230, 110));

        jPanel1.setBackground(new java.awt.Color(0, 92, 230));

        jLabel1.setBackground(new java.awt.Color(0, 92, 230));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar Por");

        jCheckBox2.setBackground(new java.awt.Color(0, 92, 230));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Sede");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(0, 92, 230));
        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Cátedra");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(0, 92, 230));
        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Docente");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(0, 92, 230));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Aula");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 92, 230));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exportar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Reservar.setBackground(new java.awt.Color(0, 92, 230));
        Reservar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Reservar.setForeground(new java.awt.Color(255, 255, 255));
        Reservar.setText("Reservar");
        Reservar.setBorder(null);
        Reservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservarMouseClicked(evt);
            }
        });
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 100, 170, -1));

        jScrollPane1.setBackground(new java.awt.Color(150, 245, 245));
        jScrollPane1.setToolTipText("");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7:00", null, null, null, null, null},
                {"7:30", null, null, null, null, null},
                {"8:00", null, null, null, null, null},
                {"8:30", null, null, null, null, null},
                {"9:00", null, null, null, null, null},
                {"9:30", null, null, null, null, null},
                {"10:00", null, null, null, null, null},
                {"10:30", null, null, null, null, null},
                {"11:00", null, null, null, null, null},
                {"11:30", null, null, null, null, null},
                {"12:00", null, null, null, null, null},
                {"12:30", null, null, null, null, null},
                {"13:00", null, null, null, null, null},
                {"13:30", null, null, null, null, null},
                {"14:00", null, null, null, null, null},
                {"14:30", null, null, null, null, null},
                {"15:00", null, null, null, null, null},
                {"15:30", null, null, null, null, null},
                {"16:00", null, null, null, null, null},
                {"16:30", null, null, null, null, null},
                {"17:00", null, null, null, null, null},
                {"17:30", null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"
            }
        ));
        table.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(table);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 900, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestreActionPerformed
        
        try{
            if (Semestre.getSelectedItem().equals("Semestre 1"))
        {
            Secciones.removeAllItems();
            Secciones.setSelectedItem(null);
            Secciones.addItem("Seccion 1");
            Secciones.addItem("Seccion 2");
            Secciones.addItem("Seccion 3");
            Secciones.addItem("Seccion 4");
            Secciones.addItem("Seccion 5");
            Secciones.addItem("+ Añadir Sección");
        }
        else
        if (Semestre.getSelectedItem().equals("Semestre 2")){
            
            Secciones.removeAllItems();
            Secciones.setSelectedItem(null);
            Secciones.addItem("Seccion 1");
            Secciones.addItem("Seccion 2");
            Secciones.addItem("Seccion 3");
            Secciones.addItem("+ Añadir Sección");
            
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_SemestreActionPerformed

    private void CarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrerasActionPerformed
        
    }//GEN-LAST:event_CarrerasActionPerformed

    private void LapsoAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LapsoAcademicoActionPerformed
        // TODO add your handling code here:
        String selection = (String) LapsoAcademico.getSelectedItem();
        
        if ("+ Nuevo Lapso".equals(selection)){
            
            int opcion = JOptionPane.showConfirmDialog(null, """
                                                             Esta acción eliminará todos los horarios almacenados del lapso actual para crear uno nuevo.
                                                             Estás seguro que quieres continuar?""","Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.YES_OPTION){
                
                DefaultComboBoxModel<String> modeloComboBox = (DefaultComboBoxModel<String>) Secciones.getModel();
                
                for(int i = 0; i < modeloComboBox.getSize();i++){
                   Secciones.removeItemAt(i);
                }
                
                String nuevaOpcion = "Lapso "+(JOptionPane.showInputDialog(this,"Ingrese el año y número del siguiente Lapso\n\"2023-I\", \"2024-II\" "));
            
            
                if (nuevaOpcion != null && !nuevaOpcion.isEmpty()){

                    String BorrarLapso = (String) LapsoAcademico.getItemAt(0);

                    LapsoAcademico.removeItem(BorrarLapso);

                    LapsoAcademico.insertItemAt(nuevaOpcion, 0);

                    LapsoAcademico.setSelectedItem(nuevaOpcion);

                }
            
            }else{
                
            }
        }
    }//GEN-LAST:event_LapsoAcademicoActionPerformed
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void SeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeccionesActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        Reservation__Interface reservationFrame = new Reservation__Interface(this);
        reservationFrame.setVisible(true);
        
        
    }//GEN-LAST:event_ReservarActionPerformed

    private void ReservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservarMouseClicked
    }//GEN-LAST:event_ReservarMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Codigo para tomar captura de pantalla al contenido del panel del Horario:
        try{
  
            //Calcula las dimensiones del panel
            int PanelWidth = jScrollPane1.getWidth();
            int PanelHeight = jScrollPane1.getHeight();        
            
            //Crea una imagen del mismo tamanio que el panel
            BufferedImage screenshot = new BufferedImage(PanelWidth, PanelHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = screenshot.createGraphics();
            
            // dibuja la tabla en la imagen y libera recursos
            jScrollPane1.print(g2);
            g2.dispose();
            
            //Generar un nombre unico basado en la fecha y la hora actual
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyMMdd_HHmmss");
            String timestamp = dateFormat.format(new Date());
            String filename = "Schedule" + timestamp + ".png";
            
            // Guarda la imagen en un archivo con el nombre generado
            File outputFile = new File(filename);
            ImageIO.write(screenshot, "png", outputFile);
            JOptionPane.showMessageDialog(this, "El horario ha sido exportado con éxito!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JComboBox<String> Carreras;
    private javax.swing.JComboBox<String> LapsoAcademico;
    private javax.swing.JButton Reservar;
    private javax.swing.JComboBox<String> Secciones;
    private javax.swing.JComboBox<String> Semestre;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
