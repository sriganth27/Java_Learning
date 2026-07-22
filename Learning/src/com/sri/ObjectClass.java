
package com.sri;

import java.util.ArrayList;
import java.util.List;

public class ObjectClass implements Cloneable{

	int age;
	int num;
	String name;
	int []arr;
	public ObjectClass(int age , int num , String name , int [] arr) {
		this.age = age;
		this.num = num;
		this.name = name;
		this.arr = new int[] {1,2,3};
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public ObjectClass(int age, int num) {
		super();
		this.age = age;
		this.num = num;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " age " +age +   " num " + num + " name " + name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.num  ==((ObjectClass)obj).num;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		int arr [] = {1,2,3,4};
		ObjectClass obj = new ObjectClass(15, 97,"sri", arr);
		ObjectClass obj2 = new ObjectClass(34,67);
		ObjectClass obj3 = obj2;
		ObjectClass obj4 = (ObjectClass) obj.clone();
		System.out.println(obj.toString());
		obj4.setName("sriganth");
		System.out.println(obj4.toString());
		System.out.println(obj.toString());
		obj3.setAge(43);
		obj4.setAge(63);
		
//		System.out.println(obj3.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj4.hashCode());
//		System.out.println(obj.hashCode());
		
//		System.out.println(obj3.age);
//		System.out.println(obj2.age);
//		System.out.println(obj4.age);
//		System.out.println(obj.age);
//		int a =obj2.hashCode();
//		List<?> m = new ArrayList<>();
//		System.out.println(m.getClass().getFields());
//		
//		System.out.println(obj.getClass().getFields());
//		System.out.println(obj.getClass().getSuperclass());
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
//		
//		System.out.println(obj2.equals(obj));
//        System.out.println(a);
//        System.out.println(obj4.num + " " + obj4.age);
        
         	}
	

}
