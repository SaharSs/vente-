/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.awt.HeadlessException;


import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Uba {

    /**
     *
     * @return
     */
    @SuppressWarnings("UseSpecificCatch")
    public List<Ube> loadD(){
         List<Ube> list=new ArrayList<Ube>();
           
        try {
            
            
            String query="select * from users";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String firstname=rs.getString("firstname");
                String email=rs.getString("email");
                String role=rs.getString("role");
                Ube be=new Ube(id,firstname,email,role);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
      public void insertD(Ube be){
        String query="insert into users values(id,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,be.getFirstname());
            ps.setString(2,be.getEmail());
            ps.setString(3,be.getPassword());
            ps.setString(4,be.getRole());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
      
      public Ube textF(int id){
      Ube b=null;
      try{
            String query="select * from users where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
                String firstname=rs.getString("firstname");
                String email=rs.getString("email");
                String role=rs.getString("role");
                  String password=rs.getString("password");
                 b=new Ube(id,firstname,email,password,role);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
      public void upd(Ube b){
      try{
            String query="update users set firstname=?,email=?,role=?,password=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,b.getFirstname());
            ps.setString(2,b.getEmail());
             ps.setString(3,b.getRole());
              ps.setString(4,b.getPassword());
              ps.setInt(5,b.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
               
                
                
                
            
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      }         
      public void del(int id){
     
      try{
            String query="delete from users where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"del");
      }catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      
      
      }
      
}
