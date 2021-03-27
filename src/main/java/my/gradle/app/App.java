package my.gradle.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			// transaction - insert or update or delete
			Transaction transaction = session.beginTransaction();
//			Employee emp = new Employee("Ccc", 10.5);
//			session.save(emp); // insert
//			Employee emp2 = new Employee("Aaa", 10.5);
//			session.save(emp2); // insert
//			Employee emp3 = new Employee("Bbb", 10.5);
//			session.save(emp3); // insert
			transaction.commit();
			Employee e1;
			e1 = session.get(Employee.class, 101); // select
			System.out.println(e1.toString());
//			session.evict(e1);
			e1.setName("Monu");
			session.save(e1);
//			session.saveOrUpdate(e1); // update - save()
			e1 = session.get(Employee.class, 101);
			System.out.println(e1.toString());
//			session.delete(e1); // delete
			e1 = session.get(Employee.class, 101);
			System.out.println(e1.toString());
			transaction.commit();
			session.close();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End");
	}
}
