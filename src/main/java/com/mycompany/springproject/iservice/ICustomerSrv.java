/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.iservice;

import com.mycompany.springproject.entity.Customer;
import com.mycompany.springproject.entity.Loan;

/**
 *
 * @author Training
 */
public interface ICustomerSrv {
    
    public String validateLoanBySalary(int customerSalary, int loanAmount);
    public Customer validateCustomer(String name, String email);
    
}
