/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.dao;

/**
 *
 * @author htk11
 */

import Camel.model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
     public List<Department> getAllDepartment() throws SQLException {
        List<Department> departments = new ArrayList<Department>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM departments Order By department_Id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Department department = new Department();

                department.setDepartment_Id(rs.getInt("department_Id"));
                department.setDepartment_Name(rs.getString("department_Name"));
               
                departments.add(department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }
    

    public Department getDepartmentById(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  departments WHERE department_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Department department = new Department();
                preparedStatement.setInt(1, id);

                department.setDepartment_Id(rs.getInt("department_Id"));
                department.setDepartment_Name(rs.getString("department_Name"));
             
                return department;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
  public Department getDepartmentByName(String  name) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  departments WHERE department_Name = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Department department = new Department();
                preparedStatement.setString(1, name);

                department.setDepartment_Id(rs.getInt("department_Id"));
                department.setDepartment_Name(rs.getString("department_Name"));
             
                return department;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public int addDepartment(Department department) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO departments(department_Name) VALUES(?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, department.getDepartment_Name());
           
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateDepartment(Department department) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE departments SET department_Name = ? WHERE department_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setString(1, department.getDepartment_Name());
           
            
            preparedStatement.setInt(2, department.getDepartment_Id());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteDepartment(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM departments WHERE department_Id = ?";

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
