/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.dao;

import Camel.model.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author htk11
 */
public class EmployeeDAO {

    public List<Employee> getAllEmployee() throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM employees Order By employee_Id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee employee = new Employee();

                employee.setEmployee_Id(rs.getInt("employee_Id"));
                employee.setEmployee_Name(rs.getString("employee_Name"));
                employee.setDepartment_Id(rs.getInt("department_Id"));
                employee.setPostion_Id(rs.getInt("postion_Id"));
                employee.setSex(rs.getString("sex"));
                employee.setBirthday(rs.getDate("birthday"));
                employee.setEmail(rs.getString("email"));
                employee.setTel(rs.getString("tel"));
                employees.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public Employee getEmployeeById(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  employees WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee employee = new Employee();
                preparedStatement.setInt(1, id);

                employee.setEmployee_Id(rs.getInt("employee_Id"));
                employee.setEmployee_Name(rs.getString("employee_Name"));
                employee.setDepartment_Id(rs.getInt("department_Id"));
                employee.setPostion_Id(rs.getInt("postion_Id"));
                employee.setSex(rs.getString("sex"));
                employee.setBirthday(rs.getDate("birthday"));
                employee.setEmail(rs.getString("email"));
                employee.setTel(rs.getString("tel"));

                return employee;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public int addEmployee(Employee employee) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO employees(employee_Name,department_Id,postion_Id,sex,birthday,email,tel) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getEmployee_Name());
            preparedStatement.setInt(2, employee.getDepartment_Id());
            preparedStatement.setInt(3, employee.getPostion_Id());
            preparedStatement.setString(4, employee.getSex());
            preparedStatement.setDate(5, (Date) employee.getBirthday());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getTel());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateEmployee(Employee employee) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE employees SET employee_Name = ?, department_Id =?,  postion_Id=?, sex=?, birthday=?, email=?, tel=? WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
             preparedStatement.setString(1, employee.getEmployee_Name());
            preparedStatement.setInt(2, employee.getDepartment_Id());
            preparedStatement.setInt(3, employee.getPostion_Id());
            preparedStatement.setString(4, employee.getSex());
            preparedStatement.setDate(5, (Date) employee.getBirthday());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getTel());
            preparedStatement.setInt(8, employee.getEmployee_Id());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteEmployee(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM employees WHERE employee_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
