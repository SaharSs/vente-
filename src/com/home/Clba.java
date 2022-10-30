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
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Clba {
      public List<Clbe> loadF(){
         List<Clbe> list=new ArrayList<Clbe>();
           
        try {
            
            
            String query="select * from client";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                int id=rs.getInt("id");
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String email=rs.getString("email");
                String tel=rs.getString("tel");
                String adress=rs.getString("adress");
                                
                    Clbe be=new Clbe(id,firstname,lastname,email,tel,adress);
                list.add(be);
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }
     public List<Vbe> lodF(int uh){
         List<Vbe> list=new ArrayList<Vbe>();
           
        try {
            
            
            String query="select * from ven where idc="+uh;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
             
            while(rs.next()){
                int id=rs.getInt("id");
                int idu=rs.getInt("idu");
                int idp=rs.getInt("idp");
                int idc=rs.getInt("idc");
                float prix=rs.getFloat("prix");
                int qte=rs.getInt("qte");
                float montant=rs.getFloat("montant");
                String type=rs.getString("type"); 
                float montantp=rs.getFloat("montantp");
                 float reste=rs.getFloat("reste");
                    String qu="select * from ve where id="+id;
                      PreparedStatement ss=Db.con.prepareStatement(qu);
            ResultSet  ms=ps.executeQuery();
             while(ms.next()){
               Date date=ms.getDate("date");
                Vbe be=new Vbe(id,idu,idp,idc,prix,qte,montant,type,montantp,reste,date);
                    list.add(be);
             }
                   
            
                
                
            }
            
            
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
            
        return list;
    }  
     public void insertCl(Clbe be){
        String query="insert into client values(id,?,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,be.getFirstname());
            ps.setString(2,be.getLastname());
            ps.setString(3,be.getEmail());
            ps.setString(4,be.getTel());
            ps.setString(5,be.getAdress());
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"g");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
    public void upcl(Clbe b){
      try{
            String query="update client set firstname=?,lastname=?,email=?,tel=?,adress=? where id=? ";
          
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,b.getFirstname());
            ps.setString(2,b.getLastname());
            ps.setString(3,b.getEmail());
            ps.setString(4,b.getTel());
            ps.setString(5,b.getAdress());
             
            ps.setInt(6,b.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"y");
               
                
                
                
            
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      }       
      public void del(int id){
     
      try{
            String query="delete from client where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.executeUpdate();
          JOptionPane.showMessageDialog(null,"del");
      }catch (HeadlessException | SQLException e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
      
      
      }
   
      public Clbe textCl(int id){
      Clbe b=null;
      try{
            String query="select * from client where id="+id;
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            while(rs.next()){
                
                String firstname=rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String email=rs.getString("email");
                String tel=rs.getString("tel");
                String adress=rs.getString("adress");
                   
                 b=new Clbe(id,firstname,lastname,email,tel,adress);
                
                
                
            }
          
      }catch (Exception e) {
           JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
      
      }
}
