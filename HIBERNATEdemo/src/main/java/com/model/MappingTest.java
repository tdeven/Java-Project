package com.model;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingTest {
public static void main(String[] args) {
	
	//oneToOne();
	//oneToMany();
	ManyToMany();
   }

    static void oneToOne() {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        Address adr = new Address();
        adr.setCity("Kathmandu");
        adr.setCountry("Nepal");
        adr.setState("Bagmati");
        sess.save(adr);
        
        Employee emp = new Employee();
        emp.setFname("Pawan");
        emp.setLname("joshi");
        emp.setSalary(98000);
        emp.setAddress(adr);
        
        sess.save(emp);
        sess.getTransaction().commit();
        sess.close();
    }
    
    static void oneToMany() {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        Address adr = new Address();
        adr.setCity("Kathmandu");
        adr.setCountry("Nepal");
        adr.setState("Bagmati");
        sess.save(adr);
        
        Employee emp = new Employee();
        emp.setFname("Pawan");
        emp.setLname("joshi");
        emp.setSalary(98000);
        emp.setAddress(adr);
        
        Phone p1 =new Phone();
        p1.setNumber("9809645212");
        p1.setType("NCELL");
        p1.setEmployee(emp);
        
        sess.save(p1);
        
        Phone p2 =new Phone();
        p2.setNumber("986421917");
        p2.setType("NTC");
        p2.setEmployee(emp);
        
        sess.save(p2);
        
        emp.setPhones(Arrays.asList(p1,p2));
        sess.save(emp);
        sess.getTransaction().commit();
        sess.close();
    }
    
    static void ManyToMany() {
    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();
        
        Address adr = new Address();
        adr.setCity("Kathmandu");
        adr.setCountry("Nepal");
        adr.setState("Bagmati");
        sess.save(adr);
        
        Employee emp = new Employee();
        emp.setFname("Pawan");
        emp.setLname("joshi");
        emp.setSalary(98000);
        emp.setAddress(adr);
        
        Phone p1 =new Phone();
        p1.setNumber("9809645212");
        p1.setType("NCELL");
        p1.setEmployee(emp);
        
        sess.save(p1);
        
        Phone p2 =new Phone();
        p2.setNumber("986421917");
        p2.setType("NTC");
        p2.setEmployee(emp);
        
        sess.save(p2);
        
        Department d1 = new Department();
        d1.setName("IT");
        sess.save(d1);
        
        Department d2 = new Department();
        d2.setName("Finance");
        sess.save(d2);
        
        emp.setDeptList(Arrays.asList(d1,d2));
        
        emp.setPhones(Arrays.asList(p1,p2));
        sess.save(emp);
        sess.getTransaction().commit();
        sess.close();
    }

}
