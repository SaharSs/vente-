/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import com.database.Db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruby
 */
public class Hba {
    public void se(){
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
            }
        } catch (SQLException ex) {
            Logger.getLogger(Uba.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    
}
