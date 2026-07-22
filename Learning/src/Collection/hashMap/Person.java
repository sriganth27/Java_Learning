package Collection.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {

	String name ;
	int age;
	Person(String name , int age){
		this.name = name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Person p = (Person) obj;
		return p.age == age && Objects.equals(name , p.name);
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.equals() only → lookup fails
		// 2.hashCode() only → duplicates allowed
		Person p = new Person("Sri",21);
		Person p2 = new Person("Sri",21);
        Map<Person,String> map = new HashMap<>();
        
        map.put(p, "test");
        map.put(p2, "test");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(p2));

	}

}
