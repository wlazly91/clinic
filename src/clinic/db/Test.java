/**
 * 
 */
package clinic.db;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author £ukasz Kochanek
 * @version 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.setId(1);
		doc.setName("£ukasz");
		doc.setSurname("Kochanek");
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(doc);
		t.commit();
		session.close();
	}

}
