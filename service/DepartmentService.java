/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.service;

import Camel.dao.DepartmentDAO;
import java.sql.SQLException;
import java.util.List;
import Camel.model.Department;

/**
 *
 * @author htk11
 */
public class DepartmentService {
     private DepartmentDAO depDAO;

    public DepartmentService() {
        depDAO = new DepartmentDAO();
    }

    public List<Department> getAllDepartment() throws SQLException {
        return depDAO.getAllDepartment();
    }

    public Department getDepartmentById(int id) throws SQLException {
        return depDAO.getDepartmentById(id);
    }

    public int addDepartment(Department dep) throws SQLException {
        return depDAO.addDepartment(dep);
    }

    public int updateDepartment(Department dep) throws SQLException {
        return depDAO.updateDepartment(dep);
    }

    public int deleteDepartment(int id) throws SQLException {
        return depDAO.deleteDepartment(id);
    }

}
