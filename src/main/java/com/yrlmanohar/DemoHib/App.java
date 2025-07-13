package com.yrlmanohar.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alien telusko = new Alien();
        
//        telusko.setAid(105);
//        telusko.setAname("Asai");
//        telusko.setColor("Black");
        
        Configuration con = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
//        session.persist(telusko);
        telusko = (Alien)session.find(Alien.class, 103);
        
        tx.commit();
        
        System.out.println(telusko);
    }
}
