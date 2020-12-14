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
public class Patient_admission_information {
    
    private String admitDate;
    private String releaseDate;

    public void Patient_all_date(String admitDate ) {
        this.admitDate = admitDate;
        
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
    
    
    
}
