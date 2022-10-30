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
public class Ube {
     private int id;
     private String firstname;
    private String email;
    private String password;
    private String role;

  


  public Ube(int id,String firstname, String email, String password, String role) {
      this.id=id;
      this.firstname= firstname;
        this.email =email;
        this.password=password;
        this.role=role;
  }    
 public Ube(int id,String firstname, String email, String role) {
      this.id=id;
      this.firstname= firstname;
        this.email =email;
       this.role=role;
  }    

  public Ube(int id, String firstname){
 
  this.id = id;
   this.firstname = firstname;
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
  
}