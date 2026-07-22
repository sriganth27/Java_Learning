package com.sri.comstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Staff {

	private String name;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
//	public String toString() {
//		return "{" + "age :" + age + ", name :"+name +", address:"+ address + "}";
//	}
	
	@Override
	public String toString() {
	    return String.format(
	      "{\"name\":\"%s\",\"age\":%d,\"address\":\"%s\"}",
	      name, age, address
	    );
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff st = new Staff();
		st.setName("Sri");
		st.setAge(22);
		st.setAddress("test");
		
		Staff st2 = new Staff();
		st2.setName("Sri");
		st2.setAge(22);
		st2.setAddress("test");
		
		System.out.println(st.toString());
		
		Collection as = new ArrayList<>();
		as.add(st);
		as.add(st2);
		
		System.out.println(as.toString());
		
		Employee em = new Employee();
		
		
		
		em.setDetails(as);
		em.setRole("admin");
		
		Map<String , Object> mp = new HashMap<>();
		mp.put("Student", em);
		String json = "{"
			    + "\"Student\":"
			    + mp   // this must already be a valid JSON string for `em`
			    + "}";
			System.out.println(json);

	}

}
