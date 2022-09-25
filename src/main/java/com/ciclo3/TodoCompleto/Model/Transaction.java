package com.ciclo3.TodoCompleto.Model;

public class Transaction {
    //Atributes
    private Long idTransaction;
    private String conceptTransaction;
    private float anountTransaction;
    private Employee employeeTransaction;
    private Enterprice entrepriceTransaction;
    private Date createdAdtrabsaction;
    private upDateTransaction;
    //constructor

    public Transaction(Long idTransaction, String conceptTransaction, float anountTransaction, Employee employeeTransaction, Entreprice entrepriceTransaction, Date createdAdtrabsaction) {
        this.idTransaction = idTransaction;
        this.conceptTransaction = conceptTransaction;
        this.anountTransaction = anountTransaction;
        this.employeeTransaction = employeeTransaction;
        this.entrepriceTransaction = entrepriceTransaction;
        this.createdAdtrabsaction = createdAdtrabsaction;
    }
}
