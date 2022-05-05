
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.controller;
import java.util.List;
import Camel.bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Camel.view.DepartmentJPanel;
import Camel.view.EmployeeJPanel;
import Camel.view.PostionJPanel;
import Camel.view.SalaryJPanel;
import Camel.view.TimekeepingJPanel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jonny Dam
 */             
        public class ChuyenManHinh {
            private JPanel jpbView;
            private String kindSelected = " ";
            List<DanhMucBean> listDanhMuc = null;
                
            public ChuyenManHinh (JPanel jpbView){
                this.jpbView = jpbView;
            }
                    
            public void setDashboard(JPanel jpnItem, JLabel jlbItem) throws SQLException {
               kindSelected = "Department";
               jpnItem.setBackground(new Color(0, 118, 104));
               jlbItem.setBackground(new Color(0, 118, 104));
               JPanel node = new DepartmentJPanel();
               jpbView.removeAll();
               jpbView.setLayout(new BorderLayout());
               jpbView.add(node);
               jpbView.validate();
               jpbView.repaint();
            }
            public void setEvent(List<DanhMucBean> listDanhMuc){
                this.listDanhMuc = listDanhMuc;
                 for(DanhMucBean item : listDanhMuc){
                        item.getJpn().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
                 }         
            }
        class LabelEvent implements MouseListener {

                private JPanel panel;
                private String kind;

                private JPanel jpnItem;
                private JLabel jlbItem;

                public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
                     this.kind = kind;
                     this.jpnItem = jpnItem;
                     this.jlbItem = jlbItem;
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                      switch (kind) {
                          case "Department":
                          {
                              try {
                                  panel = new DepartmentJPanel();
                              } catch (SQLException ex) {
                                  Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          }
                              break;

                          case "Employee":
                              panel = new EmployeeJPanel();
                              break;
                          case "Timekeeping":
                              panel = new TimekeepingJPanel();
                              break;
                          case "Postion":
                          {
                              try {
                                  panel = new PostionJPanel();
                              } catch (SQLException ex) {
                                  Logger.getLogger(ChuyenManHinh.class.getName()).log(Level.SEVERE, null, ex);
                              }
                          }
                              break;

                          case "Salary":
                              panel = new SalaryJPanel();
                              break;
                          // more
                          default:
                              break;
                     }
                     jpbView.removeAll();
                     jpbView.setLayout(new BorderLayout());
                     jpbView.add(panel);
                     jpbView.validate();
                     jpbView.repaint();
                     setChangeBackground(kind);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                     kindSelected = kind;
                     jpnItem.setBackground(new Color(0, 118, 104));
                     jlbItem.setBackground(new Color(0, 118, 104));
                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    jpnItem.setBackground(new Color(0, 118, 104));
                    jlbItem.setBackground(new Color(0, 118, 104));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (!kindSelected.equalsIgnoreCase(kind)) {
                          jpnItem.setBackground(new Color(99, 99, 99));
                          jlbItem.setBackground(new Color(99, 99, 99));
                    }
                }
                
          }
        private void setChangeBackground(String kind){
            for(DanhMucBean item : listDanhMuc){
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJpn().setBackground(new Color(0,118,104));
                    item.getJpn().setBackground(new Color(0,118,104));
                }else{
                     item.getJpn().setBackground (new Color (99, 99, 99));
                     item.getJlb ().setBackground (new Color (99, 99, 99));
                }
            }
        }
}
