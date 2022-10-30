/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Pba {
    
     public HashMap<String, Integer>  populate(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select firstname,id from client");
            ResultSet  rs=ps.executeQuery();
      
        
           Clbe cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
            String firstname=rs.getString("firstname");
                cmi=new Clbe(id,firstname);
               map.put(cmi.getFirstname(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
      public HashMap<String, Integer>  pop(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select name,id from cat");
            ResultSet  rs=ps.executeQuery();
      
        
           Cbe cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
            String name=rs.getString("firstname");
                cmi=new Cbe(id,name);
               map.put(cmi.getName(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
     public void insertk(Pbe be){
        String query="insert into product values(id,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,be.getName());
            ps.setInt(2,be.getCat());
            ps.setInt(3,be.getIdc());
            ps.setString(4,be.getPriceu());
            ps.setString(5,be.getPricev());
            ps.setInt(6,be.getQte());
            ps.setString(7,be.getImage());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    
}
