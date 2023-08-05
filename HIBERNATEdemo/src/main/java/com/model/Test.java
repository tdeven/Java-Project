package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanConstructorResultTransformer;
import org.hibernate.transform.AliasToBeanResultTransformer;


public class Test {
public static void main(String[] args) {

	//add();
	getAll();
	//updateStd();
	//deleteStd();
	//delSql();
 }

 // add student 

static void add() {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session sess = sf.openSession();
     sess.beginTransaction();
    
    
    Student st = new Student();
    st.setFname("Roshan");
    st.setLname("Mukhiya");
    st.setAge(24);
    st.setCity("Dhanusha");
    st.setCollege("NorthFace");
    
    sess.save(st); //insert sql write
    sess.getTransaction().commit(); // execute sql
    sess.close(); // db close
    
    
}

     // get all students
static void getAll() {
	// select *from student
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session sess = sf.openSession();
    
    
    Criteria crt =  sess.createCriteria(Student.class)
                     .setProjection(Projections.projectionList()
                     .add(Projections.property("fname"),"fname")	
                     .add(Projections.property("lname"),"lname")
                     .add(Projections.property("age"),"age"));
                    		 
                    		
    
//    crt.add(Restrictions.eq("college", "MBMAN"));
//    crt.add(Restrictions.eq("age", "25"));
//    crt.setProjection(Projections.property("fname"));
   // crt.setProjection(Projections.projectionList(new String[] {"age"));
       
//      ProjectionList plist = Projections.projectionList()
//    		  .add(Projections.property("fname"))
//    		  .add(Projections.property("fname"))
//    		  .add(Projections.property("fname")));
                
       //crt.setProjection(Projections.projectionList());
    crt.setResultTransformer(new AliasToBeanResultTransformer(Student.class));                 
    List<Student> slist = crt.list(); //select sql
    
          
}

// update all student
static void updateStd() {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session sess = sf.openSession();
    sess.beginTransaction();
    
    Student s = (Student) sess.get(Student.class,2);
    
    s.setAge(55);
    s.setCollege("Pulchowk");
    
    sess.update(s);//update sql
    sess.getTransaction().commit();
    sess.close();
}
// delete student
static void deleteStd() {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session sess = sf.openSession();
    sess.beginTransaction();
    
    Student s = (Student) sess.get(Student.class,2);
    
    sess.delete(s);
    sess.getTransaction().commit();
    sess.close();
    
    
}
//delete student using Sql native
static void delSql() {

	SessionFactory sf = new Configuration().configure().buildSessionFactory();
    Session sess = sf.openSession();
    sess.beginTransaction();
    
//    SQL
      SQLQuery sql = sess.createSQLQuery("delete from student where id = 3");
      sql.executeUpdate();
//
//    //HQL- Hibernate Query Language
//    Query hql = sess.createQuery("DELETE FROM Student wher id= :id");
//    hql.setParameter("id", 5);
//   
//    hql.executeUpdate();
//    
    sess.beginTransaction().commit();
    sess.close();
    
    }


}
