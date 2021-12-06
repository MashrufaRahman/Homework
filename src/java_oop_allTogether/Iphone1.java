package java_oop_allTogether;

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String Info;
	private char gender;
	private boolean madeInUSA;

	public Iphone1() { // default constructor
		super.abstractClassInfo();

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
		System.out.println(
				"The regular class can create an object where as interface and abstract class can't create object.Regular class declared only variable no method. In regular class method only implemented not declared. In the interface method only declared and in the abstract class method declared and implemented.\n\t Regular class can inherited only one abstract or regular class using extends keyword. Interface can inharit more then one interface by extends keywords. In a regular class we can inharit more then one interface using implements keyword. ");

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
