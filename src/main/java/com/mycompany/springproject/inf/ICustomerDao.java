/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.inf;

import com.mycompany.springproject.entity.Customer;
import com.mycompany.springproject.entity.Loan;

/**
 *
 * @author Training
 */
public interface ICustomerDao {
     
     public Customer getCustomer(String name,String email);
     
     
     public void setCustomer(Customer customer);
     
     
     public String validateLoan(int customerSalary, int loanAmount);
    
}
