package hw1Q2JabaBasic;

import hw10Q2Polymorphism.Nices;
import hw10Q2Polymorphism.Sister;

public class TestFamily {

	public static void main(String[] args) {
		Sister sis = new Sister();
		sis.sister();// void type method initialized 01
		sis.sister(10, 20, 30);// parameterized method initialized 02
		sis.sister(15, 30); // return type parameterized method initialized 03
		sis.sister(12, 24, 36); // Return type parameterized method initialized with string variable 04
		Sister.sister(5, 10, 15, 20, 25);// Static method initialized 05
		sis.sister(2, 4, 6, 8, 10, 12); // parameterized final method initialized 06
		
		System.out.println("\n********this is the Nice Family*********");
		
		Nices nices = new Nices();
		nices.sister();// void type method initialized 01
		nices.sister(10, 20, 30);// parameterized method initialized 02
		nices.sister(15, 30); // return type parameterized method initialized 03
		nices.sister(12, 24, 36); // Return type parameterized method initialized with string variable 04
		Nices.sister(5, 10, 15, 20, 25);// Static method initialized 05
		nices.sister(2, 4, 6, 8, 10, 12); // parameterized final method initialized 06

	}

}
