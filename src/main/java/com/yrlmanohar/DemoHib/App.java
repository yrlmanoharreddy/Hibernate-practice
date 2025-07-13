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
    	// To save the value
    	/*
        System.out.println( "Create operation" );
        Alien telusko = new Alien();
        
        telusko.setAid(105);
        telusko.setAname("Asai");
        telusko.setColor("Black");
        
        Configuration con = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.persist(telusko);
        
        tx.commit();
        */
        // To get the value
        
    	/*
        System.out.println( "Read operation" );
        
        Alien telusko = new Alien();
        
        Configuration con = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        telusko = (Alien)session.find(Alien.class, 103);
        
        tx.commit();
        
        System.out.println(telusko);
        
        */
    	
    	// Using Embeddable object
    	
    	System.out.println("Using Embeddable Object");
    	
    	AlienName name = new AlienName();
    	name.setFname("yrlmanohar");
    	name.setMname("Reddy");
    	name.setLname("Meda");
    	Alien a1 = new Alien();
    	a1.setAid(1);
    	a1.setColor("green");
    	a1.setAname(name);
    	
    	Configuration con = new Configuration()
    			.configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Alien.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.persist(a1);
    	
    	tx.commit();
    	
        
    }
}
