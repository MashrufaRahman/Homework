package java_oop_allTogether;


public class Iphone2 extends Iphone1 {

	
	public char userOfIphone2; // a public variables is declared
	
	public void dropbox() {
		System.out.println("Dropbox feature is introduced in Iphone2. The price is increases 780$");
	}
	public Iphone2() { //default constructor of Iphone2 class
		
		super(); // here default constructor called by super method
		// method and variable are called by super method
		super.getprice();
		super.getInfo();
		super.getgender();
		super.getmadeInUSA();
		super.setprice(750);
		super.setInfo("I bought this phone in 2000");
		super.setgender('F');
		super.setmadeInUSA(false);
		super.regularClassInfo();
		super.interfaceInfo();
		super.call();
		super.message();
		super.camera();
		super.abstractClassInfo();
		super.appleWatchInfo();
		
		
	}

	public Iphone2(char userOfIphone2) { //parameterized constructor
		
		this.userOfIphone2 = userOfIphone2;
		
		System.out.println("The user of Iphone2:" + userOfIphone2);

	}
	public void iPhone2Info() {//void type method, or no return or non parameterized created
		// we can't call constructor of super class inside a method of child class
		// super();
		
		
	}
	
	public void iphone2Info(char userOfIphone2) { //Parameterized method
		
	}

	
}
