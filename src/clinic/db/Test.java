/**
 * 
 */
package clinic.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author £ukasz Kochanek
 * @version 1.0
 */
public class Test {
	
	private static SessionFactory factory; 
	
	public static void main(String[] args) {
	try{
		factory = new AnnotationConfiguration().
				configure().
		                   //addPackage("com.xyz") //add package if used.
				addAnnotatedClass(Doctor.class).buildSessionFactory();
	}
	catch (Throwable ex) { 
		System.err.println("Failed to create sessionFactory object." + ex);
		throw new ExceptionInInitializerError(ex); 
	}
		      
		      Session session = factory.openSession();
		      Transaction tx = null;
		      
		      tx = session.beginTransaction();
		      
		      Doctor doc = new Doctor();
				doc.setId(1);
				doc.setName("£ukasz");
				doc.setSurname("Kochanek");
				tx.commit();
				session.close();
			  }
	   }