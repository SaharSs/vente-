/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home;

import java.util.Date;

/**
 *
 * @author ruby
 */
public class Vbe {
     private int id;
         private int idu;    
         private int idp;
         private int idc;
        private float prix;
     private int qte ;
    private float montant;
    private String type;
    private float montantp;
      private float reste;
        private Date date;

    public Vbe(int id, int idu, int idp,int idc, float prix, int qte, float montant, String type, float montantp, float reste, Date date) {
        this.id = id;
        this.idu = idu;
        this.idp = idp;
          this.idc = idc;
        this.prix = prix;
        this.qte = qte;
        this.montant = montant;
        this.type = type;
        this.montantp = montantp;
        this.reste = reste;
        this.date = date;
    }


 
    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdu() {
        return idu;
    }

    public void setIdu(int idu) {
        this.idu = idu;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMontantp() {
        return montantp;
    }

    public void setMontantp(float montantp) {
        this.montantp = montantp;
    }

    public float getReste() {
        return reste;
    }

    public void setReste(float reste) {
        this.reste = reste;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

  
    
}
