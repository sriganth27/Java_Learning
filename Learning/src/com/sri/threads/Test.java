package com.sri.threads;

public class Test {
 
	public static void main(String [] rags) throws InterruptedException {
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		Thread t1 = new Thread(() -> sb.append("Hello")); 
		Thread t2 = new Thread(()-> sb.append(" world"));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("single thread" +sb.toString());
		
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb2.append("A");
            }
        });

        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sb2.append("B");
            }
        });

        t5.start();
        t6.start();
        
        try {
            t5.join();
            t6.join();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        

        System.out.println("Length: " + sb2.length());
    
	
		
		
		
       StringBuffer sb1 = new StringBuffer();
		
		Thread t3 = new Thread(() -> sb1.append("Hello")); 
		Thread t4 = new Thread(()-> sb1.append(" world"));
		
		t3.start();
		t4.start();
		
        try {
    		t3.join();
    		t4.join();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        

		
		System.out.print("multi thread " + sb1.toString());
	}
}
