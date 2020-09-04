package org.mockk;

public class Check {

	void Static() {	
		System.out.println("static");
	}
	{
		int a;
		System.out.println("a");
	}
		public Check(){

		System.out.println("new constructor");
			System.out.println("constructor");
}
public static void main(String[] args) {
	Check c= new Check();
}
}
