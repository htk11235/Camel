/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.service;

import Camel.dao.EmployeeDAO;
import Camel.model.Employee;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author htk11
 */
public class EmployeeService {
     private EmployeeDAO employeeDAO;

    public EmployeeService() {
        employeeDAO = new EmployeeDAO();
    }

    public List<Employee> getAllEmployee() throws SQLException {
        return employeeDAO.getAllEmployee();
    }

    public Employee getEmployeeById(int id) throws SQLException {
        return employeeDAO.getEmployeeById(id);
    }

    public int addEmployee(Employee employee) throws SQLException {
        return employeeDAO.addEmployee(employee);
    }

    public int updateEmployee(Employee employee) throws SQLException {
        return employeeDAO.updateEmployee(employee);
    }

    public int deleteEmployee(int id) throws SQLException {
        return employeeDAO.deleteEmployee(id);
    }
}
