package hw10Q2Polymorphism;

public class Sister {
	// void type method implemented--------------01
	public void sister() {
		System.out.println("This is void type method from sister class");
	}

	// parameterized method implemented-------02
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("Total age from the class sister method:" + total1);
		return total1;

	}

	// Return type parameterized method implemented-----------03
	public int sister(int age1, int age2) {
		int total2 = age1 + age2;
		System.out.println("Total age from sister class:" + total2);
		return total2;
	}

	// Return type parameterized method implemented with string
	// variable-----------04
	public int sister(int age1, int age2, String age3) {
		int total3 = age1 + age2 + Integer.parseInt(age3);

		System.out.println("Total age from sister class:" + total3);
		return total3;
	}

	// static method implemented-------05
	public static int sister(int age1, int age2, int age3, int age4, int age5) {
		int total4 = age1 + age2 + age3;
		System.out.println("Total age from the class sister method:" + total4);
		return total4;
	}

	// parameterized final method implemented-------06
	public final int sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total4 = age1 + age2 + age3 + age4 + age5 + age6;
		System.out.println("Total age from the class sister method:" + total4);
		return total4;
	}
	/*
	 * Tell me what is the Method overloading by multiple line comments. Ans - same
	 * method name but different type of parameter or different
	 * 
	 */

}
