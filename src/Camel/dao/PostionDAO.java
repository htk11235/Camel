/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.dao;

import Camel.model.Department;
import Camel.model.Postion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author htk11
 */
public class PostionDAO {
     public List<Postion> getAllPostion() throws SQLException {
        List<Postion> postions = new ArrayList<Postion>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM postions Order By postion_Id";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Postion postion = new Postion();

                postion.setPostion_Id(rs.getInt("postion_Id"));
                postion.setPostion_Name(rs.getString("postion_Name"));
               
                postions.add(postion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return postions;
    }
    

    public Postion getPostionById(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  postions WHERE postion_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Postion postion = new Postion();
                preparedStatement.setInt(1, id);

                postion.setPostion_Id(rs.getInt("postion_Id"));
                postion.setPostion_Name(rs.getString("postion_Name"));
             
                return postion;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    
 public Postion getPostionByName(String name) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM  postions WHERE postion_Name = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Postion postion = new Postion();
                preparedStatement.setString(1, name);

                postion.setPostion_Id(rs.getInt("postion_Id"));
                postion.setPostion_Name(rs.getString("postion_Name"));
             
                return postion;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public int addPostion(Postion postion) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO postions(postion_Name) VALUES(?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, postion.getPostion_Name());
           
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updatePostion(Postion postion) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE postions SET postion_Name = ? WHERE postion_Id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
              preparedStatement.setString(1, postion.getPostion_Name());
           
            
            preparedStatement.setInt(2, postion.getPostion_Id());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deletePostion(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM postions WHERE postion_Id = ?";

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
