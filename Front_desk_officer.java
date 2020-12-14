/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AdmittedPatientMgt.code;

/**
 *
 * @author USER
 */
public class Front_desk_officer {
    
  private  String  name;
  private  String  email;
  private  String  empID;
  private  String  password;

    public Front_desk_officer(String name, String email, String empID, String password) {
        this.name = name;
        this.email = email;
        this.empID = empID;
        this.password = password;
    }
    
    public boolean check_Validity(String e,String p)
    {
        if(e.contains(email) && p.equals(password))
        {
           return true; 
        }
        else
        {
           return false;         
        }
    }

    public String getEmail() {
        return email;
    }

    public String getEmpID() {
        return empID;
    }

    public String getPassword() {
        return password;
    }
    
}
