/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Vba {  
    public HashMap<String, Integer>  populateCombo(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select name,id from product");
            ResultSet  rs=ps.executeQuery();
      
        
       Pbe cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
            String name=rs.getString("name");
                cmi=new Pbe(id,name);
               map.put(cmi.getName(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
     public HashMap<String, Integer>  pop(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select firstname,id from users");
            ResultSet  rs=ps.executeQuery();
      
        
          Ube cmi;
           
           while(rs.next()){
                int id=rs.getInt("id");
            String firstname=rs.getString("firstname");
                cmi=new Ube(id,firstname);
               map.put(cmi.getFirstname(),cmi.getId());
           }
                          
                 
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,""+ex);
       }
      
       return map;
   }
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
    
    
    
    public void insertD(Vbe be){
      String qu="insert into ven values(id,?,?,?,LAST_INSERT_ID(),?,?,?,?,?,?)";
      String query="insert into ve values(id,?)";
        try {
              PreparedStatement ss=Db.con.prepareStatement(query);
            ss.setDate(1, (Date) be.getDate());
         
            ss.executeUpdate();
           
              PreparedStatement ps=Db.con.prepareStatement(qu);
            ps.setInt(1,be.getIdu());
            ps.setInt(2,be.getIdp());
            ps.setInt(3,be.getIdc());
            ps.setFloat(4,be.getPrix());
            ps.setInt(5,be.getQte());
            ps.setFloat(6,be.getMontant());
            ps.setString(7,be.getType());
            ps.setFloat(8,be.getMontantp());
             ps.setFloat(9,be.getReste());
              ps.executeUpdate();
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
        
      
      
    }
    
}
