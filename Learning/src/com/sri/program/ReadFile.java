package com.sri.program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	static void fileRead(String filePath) {
		 try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
			 
			 String line ;
			 while((line = bf.readLine()) != null) {
				 System.out.println(line);
			 }
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath = "D:/project/OGB/ogb.txt";
		 
		 fileRead(filePath);

	}

}
