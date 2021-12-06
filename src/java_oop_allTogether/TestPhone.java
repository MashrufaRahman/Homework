package java_oop_allTogether;

public class TestPhone {

	public static void main(String[] args) {
		
		Iphone1 iphone1 = new Iphone1();
		iphone1.setprice(750);
		iphone1.setInfo("2000");
		iphone1.setgender('F');
		iphone1.setmadeInUSA(false);
		
		System.out.println("The price was: "+ iphone1.getprice()+"\nI bought this phone in:"+ iphone1.getInfo()+"\nMy gender:"+ iphone1.getgender()+ "\nthis phone madeInUSA:"+ iphone1.getmadeInUSA());
		
		Iphone1 p01 = new Iphone1();
		p01.regularClassInfo();

		System.out.println("\nThe regular class can create an object where as interface and abstract class can't create object.Regular class declared only variable no method. In regular class method only implemented not declared. In the interface method only declared and in the abstract class method declared and implemented.\n\t Regular class can inherited only one abstract or regular class using extends keyword. Interface can inharit more then one interface by extends keywords. In a regular class we can inharit more then one interface using implements keyword. ");

		// an abstract class can't be instantiated, it needs the help of a concrete
		// class, here Iphone1 is a concrete class
		AppleWatch appleWatch = new Iphone1();
		appleWatch.abstractClassInfo();

		System.out.println(
				"\nAbstract class is a super class. it cannot create an object where as class can creare an object. It contain both method abstract and non abstract. Class has only nonabstract method. \n An interface has only abstract method where as abstract method has non-abstract method which is implemented");

//	an abstract class can't be instantiated, it needs the help of a concrete class, here Ikphone1 is a concrete class
		Phone phone = new Iphone1();
		phone.call();
		phone.message();
		phone.camera();

		System.out.println(
				"\n Phone is a Interface class and it can't instantiated by itself here is class: Pager, Wakitaki ");

	}

}
