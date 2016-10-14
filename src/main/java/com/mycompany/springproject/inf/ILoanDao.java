/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.inf;

import com.mycompany.springproject.entity.Loan;

/**
 *
 * @author Training
 */
public interface ILoanDao {
    
      public Loan getLoan(int loanID);
      
      public void setLoan(Loan loan);
      
      
}
