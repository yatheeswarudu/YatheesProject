package TestClasses;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain {
public static void main(String args[]){
	HibernateTestClass test=new HibernateTestClass();
	test.setId(5);
	test.setName("secondNameLisdetails");
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(test);
	session.getTransaction().commit();
	int id=1;
	HibernateTestClass test1=new HibernateTestClass();
	session.beginTransaction();
	session.load(test1, 5);
	System.out.println("test id is"+test1.getId());
	session.getTransaction().commit();
	
}
	
	
	
}
