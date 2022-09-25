package com.ciclo3.TodoCompleto.Model;

import java.util.Date;

public class Enterprice {
    //Atribute
    private Long idEnterprice;
    private StringnameEnterprice;
    private String NITEnterptrice;
    private String phoneEnterprice;
    private StringaddressEnterprice;
    private Date createdAtEnterprice;
    private Date updateadEnterprice;
    //constructor

    public Enterprice(Long idEnterprice, String NITEnterptrice, String phoneEnterprice, Date createdAtEnterprice, Date updateadEnterprice) {
        this.idEnterprice = idEnterprice;
        this.NITEnterptrice = NITEnterptrice;
        this.phoneEnterprice = phoneEnterprice;
        this.createdAtEnterprice = createdAtEnterprice;
        this.updateadEnterprice = updateadEnterprice;
    }
    //constructor Enpty
    public  Enterprice(){

    }
    //getter y setter

    public Long getIdEnterprice() {
        return idEnterprice;
    }

    public void setIdEnterprice(Long idEnterprice) {
        this.idEnterprice = idEnterprice;
    }

    public String getNITEnterptrice() {
        return NITEnterptrice;
    }

    public void setNITEnterptrice(String NITEnterptrice) {
        this.NITEnterptrice = NITEnterptrice;
    }

    public String getPhoneEnterprice() {
        return phoneEnterprice;
    }

    public void setPhoneEnterprice(String phoneEnterprice) {
        this.phoneEnterprice = phoneEnterprice;
    }

    public Date getCreatedAtEnterprice() {
        return createdAtEnterprice;
    }

    public void setCreatedAtEnterprice(Date createdAtEnterprice) {
        this.createdAtEnterprice = createdAtEnterprice;
    }

    public Date getUpdateadEnterprice() {
        return updateadEnterprice;
    }

    public void setUpdateadEnterprice(Date updateadEnterprice) {
        this.updateadEnterprice = updateadEnterprice;
    }
}
