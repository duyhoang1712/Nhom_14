/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAOImpl.StudentDAOImpl;
import Model.Student;

/**
 *
 * @author PRINCE D. TOAD
 */
public class ViewStudent extends javax.swing.JFrame {
    private Student student;
    private boolean admin;
    /**
     * Creates new form ViewStudent
     */
    public ViewStudent(Student student, boolean admin){
        initComponents();
        this.student = student;
        this.admin = admin;
        
        txtName.setText("Thông tin sinh viên :" + student.getFullname());
        txtId.setText(String.valueOf(student.getId()));
        txtClass.setText(new StudentDAOImpl().getClassName(student.getNameClass().getId()));
        txtMath.setText(String.valueOf(student.getPointMath()));
        txtPhysical.setText(String.valueOf(student.getPointPhysical()));
        txtChemistry.setText(String.valueOf(student.getPointChemistry()));
        txtBiological.setText(String.valueOf(student.getPointBiological()));
        txtMedium.setText(String.valueOf((float)(student.getPointMath()+student.getPointPhysical()+student.getPointChemistry()+student.getPointBiological())/4));
        
        if(!admin){
            btnEdit.setVisible(false);
            btnBack.setText("Thoát");
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

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtClass = new javax.swing.JLabel();
        txtMath = new javax.swing.JLabel();
        txtPhysical = new javax.swing.JLabel();
        txtChemistry = new javax.swing.JLabel();
        txtBiological = new javax.swing.JLabel();
        txtMedium = new javax.swing.JLabel();
        txtBiological1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.setText("Ten SV");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtId.setText("Ma SV");

        txtClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClass.setText("Lớp :");

        txtMath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMath.setText("Điểm toán :");

        txtPhysical.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPhysical.setText("Điểm lý :");

        txtChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtChemistry.setText("Điểm hóa :");

        txtBiological.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBiological.setText("Diem Sinh");

        txtMedium.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMedium.setText("Diem trung binh");

        txtBiological1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBiological1.setText("Mã sinh viên :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Lớp :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Điểm toán :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Điểm lý");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Điểm hóa :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Điểm sinh :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Điểm trung bình :");

        btnEdit.setText("Sửa thông tin");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnChangePass.setText("Đổi mật khẩu");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(txtName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBiological1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedium)
                            .addComponent(txtBiological)
                            .addComponent(txtChemistry)
                            .addComponent(txtPhysical)
                            .addComponent(txtMath)
                            .addComponent(txtClass)
                            .addComponent(txtId)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnChangePass)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit)
                        .addGap(34, 34, 34)
                        .addComponent(btnBack)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtName)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId)
                    .addComponent(txtBiological1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClass)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMath)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhysical)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChemistry)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBiological, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedium)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnBack)
                    .addComponent(btnChangePass))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        FormStudent frmEditStudent = new FormStudent(student, 1);
        frmEditStudent.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        ChangePass frmChangePass = new ChangePass(student, admin);
        frmChangePass.setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtBiological;
    private javax.swing.JLabel txtBiological1;
    private javax.swing.JLabel txtChemistry;
    private javax.swing.JLabel txtClass;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtMath;
    private javax.swing.JLabel txtMedium;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPhysical;
    // End of variables declaration//GEN-END:variables
}