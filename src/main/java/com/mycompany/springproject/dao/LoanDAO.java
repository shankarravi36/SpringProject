/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.dao;

import com.mycompany.springproject.entity.Loan;
import com.mycompany.springproject.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Training
 */
public class LoanDAO {
    
    public static Loan getLoan(int loanID){
        Session session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Loan loan= (Loan)session.get(Loan.class, loanID);
        transaction.commit();
        return loan;
    }
    public static void setLoan(Loan loan){
        
        
        
        SessionFactory sf =HibernateUtil.getSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(loan);
        transaction.commit();
    }
}
