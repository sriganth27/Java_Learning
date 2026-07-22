package com.sri.program;

public class SriganthString {
 
	int balance = 1000;
	
	   void withdraw(int amount) {
		if(balance > amount) {
			System.out.println("amont is "+ amount);
			//try { Thread.sleep(100); } catch(Exception e){}
			balance = balance -amount;
		}
		System.out.println("balance is "+ balance);
	}
	public static void main(String [] rags) throws InterruptedException {
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		SriganthString  s = new SriganthString();
		
		Thread b = new Thread(() -> s.withdraw(500)); 
		Thread b1 = new Thread(()-> s.withdraw(700)); 
		Thread b3 = new Thread(()-> s.withdraw(100)); 
		b.start();
		b1.start();
		b3.start();
		
		
//		Thread t1 = new Thread(() -> sb.append("Hello")); 
//		Thread t2 = new Thread(()-> sb.append(" world"));
//		
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println("single thread" +sb.toString());
//		
//        Thread t5 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                sb2.append("A");
//            }
//        });
//
//        Thread t6 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                sb2.append("B");
//            }
//        });
//
//        t5.start();
//        t6.start();
//        
//    
//        t5.join();
//        t6.join();
//       
//
//        System.out.println("Length: " + sb2.length());
//    
//	
//		
//		
//		
//       StringBuffer sb1 = new StringBuffer();
//       StringBuffer sb4 = new StringBuffer();
//		
//		Thread t3 = new Thread(() -> sb1.append("Hello")); 
//		Thread t4 = new Thread(()-> sb1.append(" world"));
//		
//		t3.start();
//		t4.start();
//		t3.join();
//		t4.join();
//		
//		System.out.print("multi thhread " + sb1.toString());
//		
//        Thread t7 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                sb4.append("A");
//            }
//        });
//
//        Thread t8 = new Thread(() -> {
//            for (int j = 0; j < 1000; j++) {
//                sb4.append("B");
//            }
//        });
//
//        t7.start();
//        t8.start();
//        
//    
//        t7.join();
//        t8.join();
//       
//
//        System.out.println("Length: " + sb4.length());
	}
}
