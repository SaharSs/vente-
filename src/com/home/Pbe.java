/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

/**
 *
 * @author ruby
 */
public class Pbe {
      private int id;
     private String name;
     private int idc;
      private int cat;
      
     private String priceu;
  
     
     private String pricev;
     private int qte;
     private String image;

    public Pbe(int id,int cat, String name, int idc, String priceu, String pricev, int qte, String image) {
        this.id = id;
        this.cat = cat;
        this.name = name;
        
        this.idc = idc;
        this.priceu = priceu;
        this.pricev = pricev;
        this.qte = qte;
        this.image = image;
         
    }
 public Pbe(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }


    

    public void setPriceu(String priceu) {
        this.priceu = priceu;
    }

    public String getPricev() {
        return pricev;
    }

    public String getPriceu() {
        return priceu;
    }

    public void setPricev(String pricev) {
        this.pricev = pricev;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
     

    
}
