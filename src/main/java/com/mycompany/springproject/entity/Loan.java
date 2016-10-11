/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.entity;

/**
 *
 * @author Training
 */
public class Loan {
    private int loanID;
    private int customerID;
    private String type;
    private Customer customer;
    private int amount;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public Loan(){
        
    }
    @Override
    public String toString(){
        return type ;
                
    }

    

    
    
    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
}
