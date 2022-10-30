/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vente;

import com.database.Db;
import com.login.LoginFrame;

/**
 *
 * @author ruby
 */
public class Vente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LoginFrame lObj=new LoginFrame();
     lObj.setVisible(true);
     Db.setConnection();
    }
    
}
