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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Cba {
    public List<Cbe> loadC(){
         List<Cbe> list=new ArrayList<Cbe>();
           
        try {
            
            
            String query="select * from cat";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                
                    Cbe be=new Cbe(id,name);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
    public void insertC(Cbe be){
        String query="insert into cat values(id,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,be.getName());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"good");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
     public void upc(Cbe b){
      try{
            String query="update cat set name=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,b.getName());
             ps.setInt(2,b.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"yes");
               
                
                
                
            
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      }         
     public void del(int id){
     int y=JOptionPane.showConfirmDialog(null,"do you want to delete","delete",JOptionPane.YES_NO_OPTION);
     if(y==0){ 
     try{
            String query="delete from cat where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"del");
      }catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      
     }
      }
      public Cbe textD(int id){
      Cbe b=null;
      try{
            String query="select * from cat where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
                String name=rs.getString("name");
                
                 b=new Cbe(id,name);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
}
