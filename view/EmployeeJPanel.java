/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Camel.view;

import Camel.model.Department;
import Camel.model.Employee;
import Camel.service.DepartmentService;
import Camel.service.EmployeeService;
import Camel.service.PostionService;
import Camel.view.CRUD_View.Employee_Add;
import Camel.view.CRUD_View.Employee_Edit;
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
public class EmployeeJPanel extends javax.swing.JPanel {

    private EmployeeService employeeService;
       private DepartmentService departmentService;
    private PostionService postionService;
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) jTable_16.getModel();
        return model;
    }

    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        jTable_16.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }

    DefaultTableModel defaultTableModel;

    public EmployeeJPanel() {
         departmentService = new DepartmentService();
        postionService = new PostionService();
        initComponents();

        employeeService = new EmployeeService();

        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable_16.setModel(defaultTableModel);
        defaultTableModel.addColumn("id");
        defaultTableModel.addColumn("name");
        defaultTableModel.addColumn("department");
        defaultTableModel.addColumn("postion");
        defaultTableModel.addColumn("sex");
        defaultTableModel.addColumn("email");
        defaultTableModel.addColumn("tel");
        try {
            setTableData(employeeService.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTableData(List<Employee> Employees) {
        for (Employee Employee : Employees) {
            try {
                defaultTableModel.addRow(new Object[]{Employee.getEmployee_Id(), Employee.getEmployee_Name(),departmentService.getDepartmentById(Employee.getDepartment_Id()).getDepartment_Name(),postionService.getPostionById(Employee.getPostion_Id()).getPostion_Name(),Employee.getSex(),Employee.getEmail(),Employee.getTel()});
            } catch (SQLException ex) {
                Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void refreshTableData(List<Employee> Employees) {
        defaultTableModel.setRowCount(0);
        
        try {
            setTableData(employeeService.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jTextField_search_16 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_16 = new javax.swing.JTable();
        jButton_Refresh_16 = new javax.swing.JButton();
        jButton_Add_16 = new javax.swing.JButton();
        jButton_Edit_16 = new javax.swing.JButton();
        jButton_Del_16 = new javax.swing.JButton();
        jLabel_DpScreen_16 = new javax.swing.JLabel();

        jLabel1.setText("Search");

        jTextField_search_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_search_16ActionPerformed(evt);
            }
        });
        jTextField_search_16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_search_16KeyReleased(evt);
            }
        });

        jTable_16.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_16);

        jButton_Refresh_16.setText("Refresh");
        jButton_Refresh_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Refresh_16ActionPerformed(evt);
            }
        });

        jButton_Add_16.setBackground(new java.awt.Color(40, 133, 55));
        jButton_Add_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Add_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_16.setText("ADD");
        jButton_Add_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_16ActionPerformed(evt);
            }
        });

        jButton_Edit_16.setBackground(new java.awt.Color(25, 114, 219));
        jButton_Edit_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Edit_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_16.setText("EDIT");
        jButton_Edit_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_16ActionPerformed(evt);
            }
        });

        jButton_Del_16.setBackground(new java.awt.Color(237, 74, 74));
        jButton_Del_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Del_16.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Del_16.setText("DELETE");
        jButton_Del_16.setPreferredSize(new java.awt.Dimension(80, 21));
        jButton_Del_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Del_16ActionPerformed(evt);
            }
        });

        jLabel_DpScreen_16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DpScreen_16.setText("Employee Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_DpScreen_16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Refresh_16))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel_DpScreen_16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_search_16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Refresh_16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Del_16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_search_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_search_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_search_16ActionPerformed

    private void jTextField_search_16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_search_16KeyReleased
        searchTable(jTextField_search_16.getText());
    }//GEN-LAST:event_jTextField_search_16KeyReleased

    private void jButton_Refresh_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Refresh_16ActionPerformed

        try {
            refreshTableData(employeeService.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_Refresh_16ActionPerformed

    private void jButton_Add_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_16ActionPerformed

        new Employee_Add().setVisible(true);
    }//GEN-LAST:event_jButton_Add_16ActionPerformed

    private void jButton_Edit_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_16ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());
        System.out.println(id);
        new Employee_Edit(id).setVisible(true);
    }//GEN-LAST:event_jButton_Edit_16ActionPerformed

    private void jButton_Del_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Del_16ActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) jTable_16.getModel();
        int id = Integer.parseInt(tblModel.getValueAt(jTable_16.getSelectedRow(), 0).toString());

        try {
            employeeService.deleteEmployee(id);
            refreshTableData(employeeService.getAllEmployee());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_Del_16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_16;
    private javax.swing.JButton jButton_Del_16;
    private javax.swing.JButton jButton_Edit_16;
    private javax.swing.JButton jButton_Refresh_16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_DpScreen_16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_16;
    private javax.swing.JTextField jTextField_search_16;
    // End of variables declaration//GEN-END:variables
}
