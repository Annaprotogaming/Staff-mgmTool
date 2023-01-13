package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import entity.Staff;

@Repository
public class Teamdao {
     @Autowired
     SessionFactory sf;
	public List<Staff> getAllRecords() {
	Session session =sf.openSession();
	Transaction tr = session.beginTransaction();
	Criteria cr= session .createCriteria(Staff.class);
	List<Staff>staff = cr.list();	
	session.close();
    return staff;
}
	
	public Staff getStaffById(int staffid) {
		Session session = sf.openSession();
		Staff staff = session.get(Staff.class, staffid);
		return staff;
		}
	
	public String insertStaff(Staff staff) {
		Session session = sf.openSession();
		 Transaction tr = session.beginTransaction();
	    
		session .save(staff);
		tr.commit();
		session.close();
		return "Staff inserted Successfully";
		 }
	
     public List<Staff>getStaffBySalary(){
    	 Session session = sf.openSession();
   	 Criteria cr = session.createCriteria(Staff.class);
    	 cr.add(Restrictions.gt("salary",20000));
    	 List<Staff>staff = cr.list();
    	 return staff;
     }

     public List<Staff>getStaffByExperience(){
    	 Session session = sf.openSession();
   	 Criteria cr = session.createCriteria(Staff.class);
    	 cr.add(Restrictions.between("experience",10,20));
    	 List<Staff>staff = cr.list();
    	 return staff;
     }

     public List<Staff> getHighSalary(){
    	 Session session = sf.openSession();
   	 Criteria cr = session.createCriteria(Staff.class);
    	 cr.addOrder(Order.desc("salary"));
    	 cr.setMaxResults(1);
    	 List<Staff> staff = cr.list();
    	 return staff;
     }

	public boolean updateIdSal(Staff st) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(st);
		tr.commit();
		session.close();
		return true;
	}

	public List<Staff> MinExpName() {
	    Session session =sf.openSession();
	    Criteria cr = session.createCriteria(Staff.class);
	    cr.addOrder(Order.asc("experience"));
	    cr.setMaxResults(1);
	    List<Staff> st1 = cr.list();
	    String str = null;
	    for (Staff staff : st1) {
	    	str = staff.getName();
	    }session.close();
	    return st1;
	}
	
	
	public List<Staff>NotProfileTrain(String profile){
		 Session sn = sf.openSession();
	   	 Criteria cr = sn.createCriteria(Staff.class);
	    	 cr.add(Restrictions.ne("profile","Trainer"));
	    	 List<Staff>lt = cr.list();
	         return lt;
	     }
    
	public List<Staff>profileTrain(String profile ){
	         Session sn = sf.openSession();
		   	 Criteria cr = sn.createCriteria(Staff.class);
		    	 cr.add(Restrictions.eq("profile","Trainer"));
		    	 List<Staff>lt = cr.list();
		         return lt;
	}

}





















