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
public class Acbe {
    private int id;
     private int ida;
    private int idp;
    private int idf;
    private float price;
    private int qte;
    private float montant ;
    private Date date ;
    private  int rm;

    Acbe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public Acbe(int rm) {
        this.rm = rm;
    }

    public Acbe(int id, int idp, int idf, float price, int qte, float montant, Date date) {
        this.id = id;
         this.ida = id;
        this.idp = idp;
        this.idf = idf;
        this.ida = id;
        this.price = price;
        this.qte = qte;
        this.montant = montant;
        this.date = date;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public int getIdf() {
        return idf;
    }

    public void setIdf(int idf) {
        this.idf = idf;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
