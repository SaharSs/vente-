/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.login;

import com.database.Db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Ba {
    public void insertD(Be beanH){
        String query="insert into users values(id,?,?,?,?)";
        try {
            PreparedStatement ps=Db.con.prepareStatement(query);
            ps.setString(1,beanH.getFirstname());
            ps.setString(2,beanH.getEmail());
            ps.setString(3,beanH.getPassword());
            ps.setString(4,beanH.getRole());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"success");
              
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
    }
     public boolean check(String email,String password){
         boolean b=false;
             String query="select email,password from users where email='"+email+"' AND password='"+password+"'";
        try {
            Statement st=Db.con.createStatement();
            st.executeQuery(query);
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null,"invalid"); 
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
        return b;
     }
        
    
}
   
