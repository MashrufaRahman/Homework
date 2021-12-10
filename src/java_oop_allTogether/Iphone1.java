package java_oop_allTogether;
/*
 * 04) Now think about a regular class Iphone1. Create a method - regularClassInfo and print out all the features of a regular class compared with Interface and Abstract class you know. what is the relation between regular class, Abstract class and Interface? Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 70] .
 */

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String Info;
	private char gender;
	private boolean madeInUSA;

	public Iphone1() { // default constructor
		System.out.println("This is the default constructor from Iphone1 class.");
		super.abstractClassInfo();

	}
	public Iphone1 (int price, String Info, char gender, boolean madeInUSA ) {
		this.price = price;
		this.Info = Info;
		this.gender = gender;
		this.madeInUSA = madeInUSA;
		
		
		System.out.println("My phone price:" + price + "My name is:"+ Info + "My gender:"+ gender + "\nIs thismadeInUSA ? Ans:" + madeInUSA);
				
		
	}

	// We have to use the get and set method to use this variable
	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String Info) {
		this.Info = Info;
	}

	public char getgender() {
		return gender;
	}

	public void setgender(char gender) {
		this.gender = gender;
	}

	public boolean getmadeInUSA() {
		return madeInUSA;
	}

	public void setmadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;

	}

	public void regularClassInfo() {
		System.out.println("The regular class can create an object where as interface and abstract class can't create object.Regular class declared only variable no method. In regular class method only implemented not declared. In the interface method only declared and in the abstract class method declared and implemented.\n\t Regular class can inherited only one abstract or regular class using extends keyword. Interface can inharit more then one interface by extends keywords. In a regular class we can inharit more then one interface using implements keyword. ");

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

}
