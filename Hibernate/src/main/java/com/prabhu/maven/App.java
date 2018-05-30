package com.prabhu.maven;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

/**
* Hello world!
*
*/
public class App 
{
   public static void main( String[] args )
   {
       //System.out.println( "Hello World!" );
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx= session.beginTransaction();
       Employee e1 = new Employee (1,"Venkat",12345);
       Employee e2 = new Employee (2,"Subhamkar",12345);
       Employee e3 = new Employee (3,"Prabhakar",12345);
       session.save(e1); session.save(e2); session.save(e3);
       tx.commit();
       session.close();
       
       
   }
}