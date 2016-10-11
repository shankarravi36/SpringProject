/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springproject.dao;

import com.mycompany.springproject.entity.Customer;
import com.mycompany.springproject.util.HibernateUtil;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Training
 */
public class CustomerDAO {
    
    public static Customer getCustomer(String name,String email){
        Session session= HibernateUtil.getSessionFactory().openSession();
        Query query=session.createQuery("from CUSTOMER_DETAILS where customer_name= :name  and customer_email= :email");
        query.setString("email",email );
        query.setString("name", name);
        Iterator iter= query.iterate();
        if(iter.hasNext()){
            return (Customer) iter.next();
        }
        else{
            return null;
        }
       // Transaction transaction=session.beginTransaction();
       // Customer customer= (Customer) session.get(Customer.class,id);
        //transaction.commit();
        //return customer;        
    }
    public static void setCustomer(Customer customer){
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session;
        session = sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(customer);
        transaction.commit();
    } 
}
