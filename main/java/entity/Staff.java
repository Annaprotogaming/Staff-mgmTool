package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	int staffid;
	String name;
	String profile;
	int salary;
	int experience;
	
	@Id
	
	
	public int getStaffid() {
		return staffid;
	}
	
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Staffentity [staffid=" + staffid + ", name=" + name + ", profile=" + profile + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}

}
