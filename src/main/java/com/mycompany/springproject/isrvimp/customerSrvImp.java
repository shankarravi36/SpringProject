/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.isrvimp;

import com.mycompany.springproject.entity.Customer;
import com.mycompany.springproject.entity.Loan;
import com.mycompany.springproject.inf.ICustomerDao;
import com.mycompany.springproject.iservice.ICustomerSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Training
 */
@Service
public class customerSrvImp implements ICustomerSrv{
    
    @Autowired
    private ICustomerDao customerDao;

    public ICustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    
    @Override
    
    public String validateLoanBySalary(int customerSalary, int loanAmount) {
      
        //throw new UnsupportedOperationException("Not supported yet."); 
        return customerDao.validateLoan(customerSalary, loanAmount);
   
    }
    @Override
    public Customer validateCustomer(String name, String email){
        return customerDao.getCustomer(name, email);
    }
    
    
}
