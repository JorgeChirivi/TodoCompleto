package com.ciclo3.TodoCompleto.Model;

import java.util.Date;
import java.util.List;

public class Employee {
    //Atributes
    private Long idEmpleado;
    private String nameEmployee;
    private String phoneEmployee;
    private String emailEmployee;
    private List<ROLES> rolesEmployee;
    private Enterprise enterpriseEmployee;
    private List<Transaction>transactions;
    private Date updateAtEmployee;
    private Date createdAtEmployee;

    //Contructor

    public Employee(Long idEmpleado, String nameEmployee, String phoneEmployee, String emailEmployee, Date updateAtEmployee, Date createdAtEmployee) {
        this.idEmpleado = idEmpleado;
        this.nameEmployee = nameEmployee;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.updateAtEmployee = updateAtEmployee;
        this.createdAtEmployee = createdAtEmployee;
    }
    //Constructor Enpty

    public Employee(List<ROLES> rolesEmployee, Enterprise enterpriseEmployee, List<Transaction> transactions) {
        this.rolesEmployee = rolesEmployee;
        this.enterpriseEmployee = enterpriseEmployee;
        this.transactions = transactions;
    }
    getter y setter

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public List<ROLES> getRolesEmployee() {
        return rolesEmployee;
    }

    public void setRolesEmployee(List<ROLES> rolesEmployee) {
        this.rolesEmployee = rolesEmployee;
    }

    public Enterprise getEnterpriseEmployee() {
        return enterpriseEmployee;
    }

    public void setEnterpriseEmployee(Enterprise enterpriseEmployee) {
        this.enterpriseEmployee = enterpriseEmployee;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getUpdateAtEmployee() {
        return updateAtEmployee;
    }

    public void setUpdateAtEmployee(Date updateAtEmployee) {
        this.updateAtEmployee = updateAtEmployee;
    }

    public Date getCreatedAtEmployee() {
        return createdAtEmployee;
    }

    public void setCreatedAtEmployee(Date createdAtEmployee) {
        this.createdAtEmployee = createdAtEmployee;
    }

    public getter getY() {
        return y;
    }

    public void setY(getter y) {
        this.y = y;
    }
}
