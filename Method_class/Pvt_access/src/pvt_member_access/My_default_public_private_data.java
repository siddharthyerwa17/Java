package pvt_member_access;

import java.util.*;

class EngineeringCollegeStudent {
	int Student_id = 0;
	public String Student_name = "";
	public String Student_field = "";
	private String Student_address = "";
	private long Student_phone = 0;
	
	public String getStudent_address() {
		return Student_address;
	}
	public void setStudent_address(String student_Address) {
		Student_address=student_Address;
	}
	public long getStudent_phone() {
		return Student_phone;
	}
	public void setStudent_phone(long student_Phone) {
		Student_phone = student_Phone;
	}
}

public class My_default_public_private_data {
	public static void main (String args[]) {
		EngineeringCollegeStudent ECS = new EngineeringCollegeStudent();
		ECS.Student_id = 1;
		ECS.Student_name = "Sahil";
		ECS.Student_field = "IT";
		
		ECS.setStudent_address("India");
		ECS.setStudent_phone(1234567890);
		
		System.out.println("My Id is "+ECS.Student_id + "\n My name is :"+ECS.Student_name+ "\n My field is "+ECS.Student_field +"\n I live in "+ECS.getStudent_address()+"\n My contact is "+ECS.getStudent_phone());
	}
}
