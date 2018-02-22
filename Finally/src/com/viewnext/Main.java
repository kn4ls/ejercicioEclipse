package com.viewnext;

import com.viewnext.ClassA;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ClassA cA = new ClassA(5);
		try {
			cA.error();
			System.out.println("No peta!!!");
			System.out.println("Sortim ADEUU!!");
		} catch (Exception ex) {
			System.out.println("He petado 2!");
			throw new Exception("Subo la ex", ex);
		} finally {
			System.out.println("Finally");
			
			//throw new Exception("Ex dins del finally");
		}
		

	}

}
