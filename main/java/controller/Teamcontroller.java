package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Staff;
import service.Teamservice;

@RestController
public class Teamcontroller {
	@Autowired    //dependency injection =Rater than creating object within new keyword we can ask spring to create object by themselves by annotation @Autowire4
	Teamservice tm ;
	
	@GetMapping("/all")
	List<Staff> getAllRecords() {
		List<Staff> team =  tm.getAllRecords();
		return team;
		}
	
         @GetMapping("staff/{staffid}")
         Staff getStaffById(@PathVariable int staffid) {
	      Staff faculty = tm.getStaffById(staffid);
		    	return faculty;
		    	}
		    
	       @PostMapping("/insert")
	       public String insertstaff(@RequestBody Staff staff) {
		   return tm.insertStaff(staff);		    	 }
	    
	      @GetMapping("/getbysalary")
	      public List<Staff>getStaffBySalary(){
	    	  return tm.getStaffBySalary();
	      }
	      
	      @GetMapping ("/getbyexp")
	      public List<Staff>getStaffByExperience(){
	      return tm.getStaffByExperience();
	       }
	      
	      
	      @GetMapping ("gethighsalary")
	      public Object getHighSalary() {
	    	  return tm.getHighSalary();
	      }
	      
	      @PutMapping ("updateidsal")
	      public boolean updateIdSal(@RequestBody Staff st){
	    	  return tm.updateIdsal(st);
	      }
	      
	      @GetMapping ("getminexp")
	      public List<Staff>MinExpName(){
	    	  return tm.MinExpName();
	      }
	      
           
           @GetMapping ("profileTrain/{profile}")
           public List<Staff>profileTrain(@PathVariable String profile){
        	   return tm.ProfileTrain(profile);
           }
           

           @GetMapping ("NotProfileTrain/{profile}")
           public List<Staff> NotProfileTrain(@PathVariable String profile){
        	   return tm.NotProfileTrain(profile);
           }
           
           
           
           
           
           
           
           
           
           
           
//	@GetMapping("player/{age}")
//	Staff getPlayerByID(@PathVariable int age) {
//		Staff player = tm.getPlayerByID(age);
//		return player;
//	}
//
//	@DeleteMapping("/delete/{age}")
//	public boolean deletePlayerByID(@PathVariable int age) {
//		boolean isDeleted = tm.deletePlayerByID(age);
//		return isDeleted;
	}

