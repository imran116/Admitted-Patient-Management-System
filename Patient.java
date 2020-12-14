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
public class Patient {

    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    private String bloodgroup;
    private String telephone;
    
    private String address;

    private String cabinNo;

   

    public void PatientRegistration_for_Cabin(String firstName, String lastName, String age, String gender, String bloodgroup, String telephone, String admitDate, String address, String cabinNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.telephone = telephone;
        //this.admitDate = admitDate;
        this.address = address;
        this.cabinNo = cabinNo;

    }

    public Patient() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void PatientRegistration_for_Ward(String firstName, String lastName, String age, String gender, String bloodgroup, String telephone,   String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
        this.telephone = telephone;
        this.address = address;
         

    }

    public String getGender() {
        return gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

 

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getCabinNo() {
        return cabinNo;
    }

   

}
