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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ruby
 */
public class Inba {
     public List<Inbe> loadF(){
         List<Inbe> list=new ArrayList<Inbe>();
           
        try {
            String  query="select MONTH(dt),YEAR(dt), sum(pquantity) as pQuantity, sum(squantity) as sQuantity from ((select idpp as productID, qte as pQuantity, NULL as sQuantity,d.date as dt from ac as Purchases left outer join achat as d on Purchases.ida = d.id ) union all (select idp, NULL as pQuantity, qte as sQuantity,f.date as dt from ven as vee left outer join ve as f on vee.idv = f.id )) ps group by MONTH(dt),YEAR(dt)";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
            
              while(rs.next()){
                   int m=rs.getInt("MONTH(dt)");
                    int y=rs.getInt("YEAR(dt)");
                     int sq=rs.getInt("sQuantity");
                 int pq=rs.getInt("pQuantity");
                 int g=pq-sq;                                
              Inbe be=new Inbe(m,y,pq,sq,g);
               list.add(be);
        }
              
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,""+ex);
        }
        
        return list;
    }
         /*try {
              
        
            PreparedStatement ss=Db.con.prepareStatement(qu);
            ResultSet  mss=ss.executeQuery();
       
              while(mss.next()){
                 int t=mss.getInt("month");
                 System.out.print(m); 
                 System.out.print(t);   
          
         if(m!=t){
        String que="insert into inv values(id,?,?,?,?,?)";
        try {
            PreparedStatement ls=Db.con.prepareStatement(que);
            ls.setInt(1,be.getMonth());
            ls.setInt(2,be.getYear());
            ls.setInt(3,be.getPqte());
            ls.setInt(4,be.getSpte());
            ls.setInt(5,be.getDiff());
            
            
            ls.executeUpdate();
            JOptionPane.showMessageDialog(null,"g");
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
                
         }else{
              JOptionPane.showMessageDialog(null,"nooooooo");
         }  
              }
          } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }*/
  /*  public void sele(){
        try {
            String  query="select MONTH(dt),YEAR(dt), sum(pquantity) as pQuantity, sum(squantity) as sQuantity from ((select idpp as productID, qte as pQuantity, NULL as sQuantity,d.date as dt from ac as Purchases left outer join achat as d on Purchases.ida = d.id ) union all (select idp, NULL as pQuantity, qte as sQuantity,f.date as dt from ven as vee left outer join ve as f on vee.idv = f.id )) ps group by MONTH(dt),YEAR(dt)";
            PreparedStatement ps=Db.con.prepareStatement(query);
            ResultSet  rs=ps.executeQuery();
              while(rs.next()){
                   int m=rs.getInt("MONTH(dt)");
                    int y=rs.getInt("YEAR(dt)");
                     int sq=rs.getInt("sQuantity");
                 int pq=rs.getInt("pQuantity");
                 int g=pq-sq;
                String qu="insert into inv values(id,?,?,?,?,?)";
        try {
            PreparedStatement hy=Db.con.prepareStatement(qu);
            hy.setInt(1,m);
            hy.setInt(2,y);
            hy.setInt(3,pq);
            hy.setInt(4,sq);
            hy.setInt(5,g);
            
            hy.executeUpdate();
            
              
        } catch (HeadlessException | SQLException e) {
              JOptionPane.showMessageDialog(null,""+e);
        }
     
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Inba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
}
