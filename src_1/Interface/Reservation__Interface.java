/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Handler.Place;
import Handler.Reservation;
import Handler.Schedule;
import Users.Professor;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author user
 */
public class Reservation__Interface extends javax.swing.JFrame {

    Interface frame;
    Place[] places = {
        new Place ("Aula", true, 1),
        new Place ("Aula", true, 2),
        new Place ("Aula", true, 3),
        new Place ("Aula", true, 4),
        new Place ("Aula", true, 5),
    };
    DefaultComboBoxModel<Place> modelClassroom = new DefaultComboBoxModel<>();
    
    Professor[] professors = {
        new Professor("Edian", "Sanchez", "Masculino", 19),
        new Professor("Christian", "Vazquez", "Masculino", 19),
        new Professor("Andrew", "Puerta", "Masculino", 19),
        new Professor("Miguel", "Nunez", "Masculino", 19),
        new Professor("Jenfer", "Martinez", "Masculino", 18),
    };
    
    DefaultComboBoxModel<Professor> modelProfessor = new DefaultComboBoxModel<>();
    /**
     * Creates new form Reservation__Interface
     */
    public Reservation__Interface(Interface panel) {
        this.frame = panel;
        for (Place place : places) {
            modelClassroom.addElement(place);
        }
        for (Professor professor : professors) {
            modelProfessor.addElement(professor);
        }
        
        initComponents();
    }
    
    public Reservation__Interface() {        
        for (Place place : places) {
            modelClassroom.addElement(place);
        }
        
        for (Professor professor : professors) {
            modelProfessor.addElement(professor);
        }
        initComponents();
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

        jSlider1 = new javax.swing.JSlider();
        section_Field = new javax.swing.JComboBox<>();
        Panel = new javax.swing.JPanel();
        SaveButton = new javax.swing.JButton();
        Asignatura = new javax.swing.JLabel();
        Xbutton = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Information = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        campus_Field = new javax.swing.JComboBox<>();
        classroom_Field = new javax.swing.JComboBox<>();
        day_Field = new javax.swing.JComboBox<>();
        Information1 = new javax.swing.JLabel();
        beginHour_Field = new javax.swing.JComboBox<>();
        beginMinute_Field = new javax.swing.JComboBox<>();
        endHour_Field = new javax.swing.JComboBox<>();
        endMinute_Field = new javax.swing.JComboBox<>();
        professorName_Field = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        subjectName_Field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setLocation(new java.awt.Point(350, 100));
        setUndecorated(true);
        setResizable(false);

        section_Field.setBackground(new java.awt.Color(255, 255, 255));
        section_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        section_Field.setForeground(new java.awt.Color(0, 0, 0));
        section_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        section_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                section_FieldActionPerformed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(0, 102, 255));
        Panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMouseDragged(evt);
            }
        });
        Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMousePressed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(0, 102, 255));
        SaveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.setBorder(null);
        SaveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaveButtonMouseExited(evt);
            }
        });
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        Asignatura.setBackground(new java.awt.Color(255, 255, 255));
        Asignatura.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Asignatura.setForeground(new java.awt.Color(255, 255, 255));
        Asignatura.setText("ASIGNATURA");

        Xbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Xbutton.setForeground(new java.awt.Color(255, 255, 255));
        Xbutton.setText("X");
        Xbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Xbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XbuttonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveButton)
                .addGap(136, 136, 136)
                .addComponent(Asignatura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(Xbutton)
                .addGap(14, 14, 14))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SaveButton)
                        .addComponent(Asignatura))
                    .addComponent(Xbutton))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Fecha");

        Information.setBackground(new java.awt.Color(255, 255, 255));
        Information.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Information.setForeground(new java.awt.Color(0, 0, 0));
        Information.setText("Materia");

        to.setBackground(new java.awt.Color(255, 255, 255));
        to.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        to.setForeground(new java.awt.Color(0, 0, 0));
        to.setText("a");

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        campus_Field.setBackground(new java.awt.Color(255, 255, 255));
        campus_Field.setEditable(true);
        campus_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campus_Field.setForeground(new java.awt.Color(0, 0, 0));
        campus_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sede villa Asia", "Sede Atlantico" }));

        classroom_Field.setBackground(new java.awt.Color(255, 255, 255));
        classroom_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        classroom_Field.setForeground(new java.awt.Color(0, 0, 0));
        classroom_Field.setModel(modelClassroom);

        day_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        day_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day_FieldActionPerformed(evt);
            }
        });

        Information1.setBackground(new java.awt.Color(255, 255, 255));
        Information1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Information1.setForeground(new java.awt.Color(0, 0, 0));
        Information1.setText("Profesor");

        beginHour_Field.setBackground(new java.awt.Color(255, 255, 255));
        beginHour_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beginHour_Field.setForeground(new java.awt.Color(0, 0, 0));
        beginHour_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        beginHour_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginHour_FieldActionPerformed(evt);
            }
        });

        beginMinute_Field.setBackground(new java.awt.Color(255, 255, 255));
        beginMinute_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        beginMinute_Field.setForeground(new java.awt.Color(0, 0, 0));
        beginMinute_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] {00, 15, 30, 45}));
        beginMinute_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginMinute_FieldActionPerformed(evt);
            }
        });

        endHour_Field.setBackground(new java.awt.Color(255, 255, 255));
        endHour_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        endHour_Field.setForeground(new java.awt.Color(0, 0, 0));
        endHour_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24}));
        endHour_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endHour_FieldActionPerformed(evt);
            }
        });

        endMinute_Field.setBackground(new java.awt.Color(255, 255, 255));
        endMinute_Field.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        endMinute_Field.setForeground(new java.awt.Color(0, 0, 0));
        endMinute_Field.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] {00, 15, 30, 45}));
        endMinute_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endMinute_FieldActionPerformed(evt);
            }
        });

        professorName_Field.setModel(modelProfessor);
        professorName_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorName_FieldActionPerformed(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setText("Seccion");

        subjectName_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectName_FieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Information1)
                            .addComponent(professorName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Information)
                            .addComponent(subjectName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(beginHour_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beginMinute_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(to)
                        .addGap(18, 18, 18)
                        .addComponent(endHour_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endMinute_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(day_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(campus_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(section_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(classroom_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Information1)
                    .addComponent(Information))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(professorName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subjectName_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beginHour_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date)
                    .addComponent(to)
                    .addComponent(beginMinute_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endHour_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endMinute_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(campus_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(section_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(classroom_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(72, 72, 72)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseEntered

    }//GEN-LAST:event_SaveButtonMouseEntered

    private void SaveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMouseExited

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        int bHour = (int) beginHour_Field.getSelectedItem();
        int bMinute = (int) beginMinute_Field.getSelectedItem();
        int eHour = (int) endHour_Field.getSelectedItem();
        int eMinute = (int) endMinute_Field.getSelectedItem();
        
        Professor name = (Professor) professorName_Field.getSelectedItem();
        String subject = (String) subjectName_Field.getText();
        String day = (String) day_Field.getSelectedItem();
        String campus = (String) campus_Field.getSelectedItem();
        String section = (String) section_Field.getSelectedItem();
        Place classroom = (Place) classroom_Field.getSelectedItem();
        
        Reservation reservation = new Reservation(
            LocalTime.of(bHour, bMinute), 
            LocalTime.of(eHour, eMinute),
            classroom, name, campus, day, subject, section                
        );
        
        frame.schedule.addReservation(reservation);
<<<<<<< HEAD
        
        /*
        try{
            frame.schedule.serialize("GuardadoReservas");
            
        }catch(IOException e){
            e.printStackTrace();
        }
        */
        
        
=======
        System.out.println(reservation.toString());
        frame.showReserve(reservation);
>>>>>>> 3e382355926cf5bce371fde28d41ffe433d1116b
        this.dispose();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void PanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMouseDragged

    }//GEN-LAST:event_PanelMouseDragged

    private void PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelMouseClicked

    private void PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMousePressed
       
    }//GEN-LAST:event_PanelMousePressed

    private void section_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_section_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_section_FieldActionPerformed

    private void day_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_day_FieldActionPerformed

    private void beginHour_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginHour_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginHour_FieldActionPerformed

    private void beginMinute_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginMinute_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_beginMinute_FieldActionPerformed

    private void endHour_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endHour_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endHour_FieldActionPerformed

    private void endMinute_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endMinute_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endMinute_FieldActionPerformed

    private void professorName_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorName_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorName_FieldActionPerformed

    private void subjectName_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectName_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectName_FieldActionPerformed

    private void XbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbuttonMouseEntered

    }//GEN-LAST:event_XbuttonMouseEntered

    private void XbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XbuttonMouseClicked
        this.dispose();
    }//GEN-LAST:event_XbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(Reservation__Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation__Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation__Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation__Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation__Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asignatura;
    private javax.swing.JLabel Information;
    private javax.swing.JLabel Information1;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel Xbutton;
    private javax.swing.JComboBox<Integer> beginHour_Field;
    private javax.swing.JComboBox<Integer> beginMinute_Field;
    private javax.swing.JComboBox<String> campus_Field;
    private javax.swing.JComboBox<Place> classroom_Field;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> day_Field;
    private javax.swing.JComboBox<Integer> endHour_Field;
    private javax.swing.JComboBox<Integer> endMinute_Field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JComboBox<Professor> professorName_Field;
    private javax.swing.JComboBox<String> section_Field;
    private javax.swing.JTextField subjectName_Field;
    private javax.swing.JLabel to;
    // End of variables declaration//GEN-END:variables
}
