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
public class Bed_information {

    private String cabin_type;
    private String ward_type;

    private String cabinNo;
    private String wardNo;
    private String unit;
    private String bedNo;
    private String disableValue;

    public void setValueBedInfo(String cabinNo, String unit, String bedNo) {
        this.cabinNo = cabinNo;
        this.unit = unit;
        this.bedNo = bedNo;
    }

    public void setDisableValue(String disableValue) {
        this.disableValue = disableValue;
    }

    public String getDisableValue() {
        return disableValue;
    }

    public String getCabinNo() {
        return cabinNo;
    }

    public String getWardNo() {
        return wardNo;
    }

    public String getUnit() {
        return unit;
    }

    public String getBedNo() {
        return bedNo;
    }

    
    
    

    public String getCabin_type() {
        return cabin_type;
    }

    public String getWard_type() {
        return ward_type;
    }

    public void setCabin_type(String ac_type) {
        this.cabin_type = ac_type;
    }

    public void setWard_type(String ward) {
        this.ward_type = ward;
    }

}
