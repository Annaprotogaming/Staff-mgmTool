package service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.Teamdao;
import entity.Staff;

@Service
public class Teamservice {
    @Autowired
	Teamdao dao;
    
	public List<Staff> getAllRecords() {
	List<Staff> staff= dao.getAllRecords();
	return staff;	
	}
	
   public Staff getStaffById(int staffid) {
	   return dao.getStaffById(staffid);
   }
   
   public String insertStaff (Staff staff ) {
	   return dao.insertStaff(staff);
	    }
    
   public List<Staff>getStaffBySalary(){
	   return dao.getStaffBySalary();
   }
   
   public List<Staff>getStaffByExperience(){
	   return dao.getStaffByExperience();
	   }
   
   public List<Staff> getHighSalary() {
	   return dao.getHighSalary();
	   }
   
   public boolean updateIdsal(Staff st){
	   return dao.updateIdSal(st);
	   }
   public List<Staff> MinExpName() {
	   return dao.MinExpName();
   }
   public List<Staff> ProfileTrain(String profile){
	   return dao.profileTrain(profile);
   }
   public List<Staff> NotProfileTrain(String profile){
	   return dao.NotProfileTrain(profile);
   }
}
