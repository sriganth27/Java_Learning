package streams;

import java.util.List;

public class FindFirstFindAnyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of(
		        "John",
		        "David",
		        "Mike",
		        "Steve",
		        "Robert"
		);
		
		names.stream().filter(n->n.length()>2)
		.findFirst().ifPresent(System.out::println);
		
		
		names.stream().filter(n->n.length()>2)
		.findAny().ifPresent(System.out::println);
		
		
		names.parallelStream().filter(n->n.length()>2)
		.findAny().ifPresent(System.out::println);

	}

}
