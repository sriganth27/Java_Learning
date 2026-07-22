package com.sri.exeptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;


class parent {
	void show() throws IOException{
		throw new IOException("exception throwing in parent");
	}
}

class child extends parent {
	@Override
	void show() throws FileNotFoundException {
		throw new FileNotFoundException("exception throwed in child");
	}
}

class child2 extends parent {
	@Override
	void show() throws SocketException , IOException{
		try {
			super.show();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("parent exception "+ e.getMessage());
		}
		
		throw new SocketException("exception thorows in child 2");
	}
}

class parent2 {
	void main()  throws Exception{
		throw new Exception("exception occured in parent2");
	}
}

class child3 extends parent2 {
	void main() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent c1 = new child();
		parent c2 = new child2();
		parent2 p = new parent2();
		Main m = new Main();
		m.main();
		try {
			c2.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}
	
	void main() {
		System.out.println("inside main method test");
	}

}
