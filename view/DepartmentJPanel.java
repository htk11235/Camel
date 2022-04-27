/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Camel.view;

import Camel.model.Department;
import Camel.service.DepartmentService;
import Camel.view.CRUD_View.Department_Add;
import Camel.view.CRUD_View.Department_Edit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jonny Dam
 */
public class DepartmentJPanel extends javax.swing.JPanel {
    private DepartmentService departmentService;
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) jTable_12.getModel();
        return model;
    }

    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        jTable_12.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }

    DefaultTableModel defaultTableModel;

    public DepartmentJPanel() throws SQLException {
        initComponents();
        
        departmentService = new DepartmentService();

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable_12.setModel(defaultTableModel);
        defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("name");
        setTableData(departmentService.getAllDepartment());
    }

    private void setTableData(List<Department> departments) {
        for (Department department : departments) {
            defaultTableModel.addRow(new Object[]{department.getDepartment_Id(), department.getDepartment_Name()});
        }
    }

    private void refreshTableData(List<Department> departments) {
        defaultTableModel.setRowCount(0);
        setTableData(departments);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_12 = new javax.swing.JPanel();
        jLabel_img_12 = new javax.swing.JLabel();
        jLabel_DpScreen_12 = new javax.swing.JLabel();
        jPanel_Admin_12 = new javax.swing.JPanel();
        jPanel_Marketing_12 = new javax.swing.JPanel();
        jPanel_IT_12 = new javax.swing.JPanel();
        jPanel_HR_12 = new javax.swing.JPanel();
        jPanel_Security_12 = new javax.swing.JPanel();
        jLabel_Admin_12 = new javax.swing.JLabel();
        jLabel_Marketing_12 = new javax.swing.JLabel();
        jLabel_IT_12 = new javax.swing.JLabel();
        jLabel_HR_12 = new javax.swing.JLabel();
        jLabel_Security_12 = new javax.swing.JLabel();
        jLabel_nubAdmin_12 = new javax.swing.JLabel();
        jLabel_nubMarketing_12 = new javax.swing.JLabel();
        jLabel_nubIT_12 = new javax.swing.JLabel();
        jLabel_nubSecurity_12 = new javax.swing.JLabel();
        jLabel_nubHR_13 = new javax.swing.JLabel();
        jTextField_search_12 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_12 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton_Add_12 = new javax.swing.JButton();
        jButton_Del_12 = new javax.swing.JButton();
        jButton_Refresh_12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(232, 232, 232));
        setPreferredSize(new java.awt.Dimension(650, 600));

        jPanel_12.setBackground(new java.awt.Color(238, 238, 238));

        jLabel_DpScreen_12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DpScreen_12.setText("Department Screen");

        jPanel_Admin_12.setBackground(new java.awt.Color(146, 206, 188));

        javax.swing.GroupLayout jPanel_Admin_12Layout = new javax.swing.GroupLayout(jPanel_Admin_12);
        jPanel_Admin_12.setLayout(jPanel_Admin_12Layout);
        jPanel_Admin_12Layout.setHorizontalGroup(
            jPanel_Admin_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel_Admin_12Layout.setVerticalGroup(
            jPanel_Admin_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel_Marketing_12.setBackground(new java.awt.Color(146, 206, 188));

        javax.swing.GroupLayout jPanel_Marketing_12Layout = new javax.swing.GroupLayout(jPanel_Marketing_12);
        jPanel_Marketing_12.setLayout(jPanel_Marketing_12Layout);
        jPanel_Marketing_12Layout.setHorizontalGroup(
            jPanel_Marketing_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel_Marketing_12Layout.setVerticalGroup(
            jPanel_Marketing_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel_IT_12.setBackground(new java.awt.Color(146, 206, 188));

        javax.swing.GroupLayout jPanel_IT_12Layout = new javax.swing.GroupLayout(jPanel_IT_12);
        jPanel_IT_12.setLayout(jPanel_IT_12Layout);
        jPanel_IT_12Layout.setHorizontalGroup(
            jPanel_IT_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel_IT_12Layout.setVerticalGroup(
            jPanel_IT_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel_HR_12.setBackground(new java.awt.Color(146, 206, 188));

        javax.swing.GroupLayout jPanel_HR_12Layout = new javax.swing.GroupLayout(jPanel_HR_12);
        jPanel_HR_12.setLayout(jPanel_HR_12Layout);
        jPanel_HR_12Layout.setHorizontalGroup(
            jPanel_HR_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel_HR_12Layout.setVerticalGroup(
            jPanel_HR_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel_Security_12.setBackground(new java.awt.Color(146, 206, 188));

        javax.swing.GroupLayout jPanel_Security_12Layout = new javax.swing.GroupLayout(jPanel_Security_12);
        jPanel_Security_12.setLayout(jPanel_Security_12Layout);
        jPanel_Security_12Layout.setHorizontalGroup(
            jPanel_Security_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel_Security_12Layout.setVerticalGroup(
            jPanel_Security_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel_Admin_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_Admin_12.setText("Administration");

        jLabel_Marketing_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_Marketing_12.setText("Marketing");

        jLabel_IT_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_IT_12.setText("IT");

        jLabel_HR_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_HR_12.setText("HR");

        jLabel_Security_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_Security_12.setText("Security");

        jLabel_nubAdmin_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_nubAdmin_12.setText("4");

        jLabel_nubMarketing_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_nubMarketing_12.setText("6");

        jLabel_nubIT_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_nubIT_12.setText("18");

        jLabel_nubSecurity_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_nubSecurity_12.setText("3");

        jLabel_nubHR_13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel_nubHR_13.setText("6");

        jTextField_search_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_search_12ActionPerformed(evt);
            }
        });
        jTextField_search_12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_search_12KeyReleased(evt);
            }
        });

        jTable_12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_12);

        jButton2.setBackground(new java.awt.Color(25, 114, 219));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton_Add_12.setBackground(new java.awt.Color(40, 133, 55));
        jButton_Add_12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Add_12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_12.setText("ADD");
        jButton_Add_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_12ActionPerformed(evt);
            }
        });

        jButton_Del_12.setBackground(new java.awt.Color(237, 74, 74));
        jButton_Del_12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Del_12.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Del_12.setText("DELETE");
        jButton_Del_12.setPreferredSize(new java.awt.Dimension(80, 21));
        jButton_Del_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Del_12ActionPerformed(evt);
            }
        });

        jButton_Refresh_12.setText("Refresh");
        jButton_Refresh_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_12ActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel_12Layout = new javax.swing.GroupLayout(jPanel_12);
        jPanel_12.setLayout(jPanel_12Layout);
        jPanel_12Layout.setHorizontalGroup(
            jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_12Layout.createSequentialGroup()
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_12Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel_Admin_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel_12Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel_Admin_12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel_nubAdmin_12)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_Marketing_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_12Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_Marketing_12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_nubMarketing_12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel_IT_12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel_HR_12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel_Security_12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_IT_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_12Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_HR_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_12Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel_Security_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_12Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel_nubSecurity_12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel_12Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel_nubHR_13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_nubIT_12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_12Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addComponent(jLabel_DpScreen_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_img_12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_12Layout.createSequentialGroup()
                            .addComponent(jTextField_search_12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Refresh_12))
                        .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_12Layout.createSequentialGroup()
                                .addComponent(jButton_Add_12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Del_12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_12Layout.setVerticalGroup(
            jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_12Layout.createSequentialGroup()
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel_img_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_nubIT_12)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_DpScreen_12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 33, Short.MAX_VALUE)))
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addComponent(jLabel_nubHR_13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_HR_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addComponent(jLabel_nubAdmin_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel_Admin_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addComponent(jLabel_nubMarketing_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Marketing_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_IT_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_12Layout.createSequentialGroup()
                        .addComponent(jLabel_nubSecurity_12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_Security_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Admin_12)
                    .addComponent(jLabel_Marketing_12)
                    .addComponent(jLabel_IT_12)
                    .addComponent(jLabel_HR_12)
                    .addComponent(jLabel_Security_12))
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Del_12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_12ActionPerformed

        new Department_Add().setVisible(true);
    }//GEN-LAST:event_jButton_Add_12ActionPerformed

    private void jButton_Refresh_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_12ActionPerformed
        DepartmentService departmentService;
        departmentService = new DepartmentService();
        try {
            refreshTableData(departmentService.getAllDepartment());
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Refresh_12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel) jTable_12.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_12.getSelectedRow(), 0).toString());
        System.out.println(id);
        new Department_Edit(id).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_search_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_search_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_search_12ActionPerformed

    private void jTextField_search_12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_12KeyReleased
        searchTable(jTextField_search_12.getText());
    }//GEN-LAST:event_jTextField_search_12KeyReleased

    private void jButton_Del_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Del_12ActionPerformed
         DefaultTableModel tblModel = (DefaultTableModel) jTable_12.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_12.getSelectedRow(), 0).toString());
        try {
            departmentService.deleteDepartment(id);
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Del_12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Add_12;
    private javax.swing.JButton jButton_Del_12;
    private javax.swing.JButton jButton_Refresh_12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Admin_12;
    private javax.swing.JLabel jLabel_DpScreen_12;
    private javax.swing.JLabel jLabel_HR_12;
    private javax.swing.JLabel jLabel_IT_12;
    private javax.swing.JLabel jLabel_Marketing_12;
    private javax.swing.JLabel jLabel_Security_12;
    private javax.swing.JLabel jLabel_img_12;
    private javax.swing.JLabel jLabel_nubAdmin_12;
    private javax.swing.JLabel jLabel_nubHR_13;
    private javax.swing.JLabel jLabel_nubIT_12;
    private javax.swing.JLabel jLabel_nubMarketing_12;
    private javax.swing.JLabel jLabel_nubSecurity_12;
    private javax.swing.JPanel jPanel_12;
    private javax.swing.JPanel jPanel_Admin_12;
    private javax.swing.JPanel jPanel_HR_12;
    private javax.swing.JPanel jPanel_IT_12;
    private javax.swing.JPanel jPanel_Marketing_12;
    private javax.swing.JPanel jPanel_Security_12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_12;
    private javax.swing.JTextField jTextField_search_12;
    // End of variables declaration//GEN-END:variables
}
