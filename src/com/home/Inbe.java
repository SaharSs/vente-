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
public class Inbe {
    private int id;
     
     private int month;
     private int year;
     private int pqte  ;
     private int spte ;
    private int diff ;

    public Inbe(int id, int month, int year, int pqte, int spte, int diff) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.pqte = pqte;
        this.spte = spte;
        this.diff = diff;
    }
 public Inbe( int month, int year, int pqte, int spte, int diff) {
       
        this.month = month;
        this.year = year;
        this.pqte = pqte;
        this.spte = spte;
        this.diff = diff;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPqte() {
        return pqte;
    }

    public void setPqte(int pqte) {
        this.pqte = pqte;
    }

    public int getSpte() {
        return spte;
    }

    public void setSpte(int spte) {
        this.spte = spte;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }
    
    public Inbe(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
