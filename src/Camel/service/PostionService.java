/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Camel.service;

import Camel.dao.PostionDAO;
import Camel.model.Postion;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author htk11
 */
public class PostionService {
     private PostionDAO posDAO;

    public PostionService() {
        posDAO = new PostionDAO();
    }

    public List<Postion> getAllPostion() throws SQLException {
        return posDAO.getAllPostion();
    }

    public Postion getPostionById(int id) throws SQLException {
        return posDAO.getPostionById(id);
    }

    public int addPostion(Postion pos) throws SQLException {
        return posDAO.addPostion(pos);
    }

    public int updatePostion(Postion pos) throws SQLException {
        return posDAO.updatePostion(pos);
    }

    public int deletePostion(int id) throws SQLException {
        return posDAO.deletePostion(id);
    }
     public Postion getPostionByName(String name) throws SQLException {
           return posDAO.getPostionByName(name);
     }
}
