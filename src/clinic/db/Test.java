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
	try
	{
		factory = new AnnotationConfiguration().configure().addAnnotatedClass(Doctor.class).buildSessionFactory();
	}
	catch (Throwable ex) { 
		System.err.println("Failed to create sessionFactory object." + ex);
		throw new ExceptionInInitializerError(ex); 
	}
		      
		      Session session = factory.openSession();
		      Transaction tx = null;
		      tx = session.beginTransaction();
		      
		      Doctor doc = new Doctor();
		      	doc.setId(101);
				doc.setName("cos");
				doc.setSurname("cos");
				session.save(doc);
				tx.commit();
				session.close();
				
				System.out.println("!!! nareszcie cholerstwo posz³o");
			  }
	   }