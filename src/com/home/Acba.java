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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Acba {
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
     public HashMap<String, Integer>  populate(){
      HashMap<String, Integer> map = new HashMap<String, Integer>();
             
       try {
              PreparedStatement ps=Db.con.prepareStatement("select firstname,id from fourn");
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
     
     public void insertD(Acbe be){
         String qu="insert into ac values(id,?,?,LAST_INSERT_ID(),?,?,?)";
        String query="insert into achat values(id,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setDate(1, (Date) be.getDate());
         
            ps.executeUpdate();
            PreparedStatement ss=Db.con.prepareStatement(qu);
            ss.setInt(1,be.getIdp());
            ss.setInt(2,be.getIdf());
           
            ss.setFloat(3,be.getPrice());
              ss.setInt(4,be.getQte());
            ss.setFloat(5,be.getMontant());
          
         
            ss.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
           
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
        
     
    }

    void setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
}
