package hw10Q2Polymorphism;

public class Nices extends Sister{


		//  method -01
		@Override
		public void sister() {
			System.out.println("This is void type method from sister class");
		}

		// method --02
		@Override
		public int sister(int age1, int age2, int age3) {
			int total1 = age1 + age2 + age3 - 7;
			System.out.println("Total age from the class sister method:" + total1);
			return total1;

		}

		// method --03
		@Override
		public int sister(int age1, int age2) {
			int total2 = age1 + age2*2;
			System.out.println("Total age from sister class:" + total2);
			return total2;
		}

		// method ---04
		@Override
		public int sister(int age1, int age2, String age3) {
			int total3 = age1 + age2/4 + Integer.parseInt(age3);

			System.out.println("Total age from sister class:" + total3);
			return total3;
		}
		/*Static method can't be override if we @override it will work as static method of the Nices class
		
		/* static method implemented-------05
		public static int sister(int age1, int age2, int age3, int age4, int age5) {
			int total4 = age1 + age2 + age3;
			System.out.println("Total age from the class sister method:" + total4);
			return total4;
		}
		Static method can't be override if we @override it will work as static method of the Nices class 
		
	--Final type method can't override
		// method --06
		public final int sister(int age1, int age2, int age3, int age4, int age5, int age6) {
			int total4 = age1 + age2 + age3 + age4 + age5 + age6;
			System.out.println("Total age from the class sister method:" + total4);
			return total4;
		}
		
		 Tell me what is the Method overriding by multiple line comments
		 
		Ans - When different methods exist with the same method name with same parameters or signature but with different syntax or logic, it is called method overriding. Method Overriding occurs during run time.
		*/
}		