package hw3Q3Constructor;
/*03) Create a package name "hw3Q3Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Fourth outcome for 3 variable, 5th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)*/

public class Computer {
	
	public String Brand; // variables are declared
	public String Model; 
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA; 
	public char grade;
	
	//  Default constructor
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}
	
	
		// Parameterized constructor 02 declared
		public Computer(String Brand, String Model, String OperatingSystem, int price,  char grade,boolean madeInUSA) { // local variable
			this.Brand = Brand;
			this.Model = Model;
			this.OperatingSystem = OperatingSystem;
			this.price = price;
			this.madeInUSA = madeInUSA;
			this.grade = grade;
			
			System.out.println("My Brand:"+ Brand+"\n Model:" + Model +"\noperating system:"+OperatingSystem+"\nPrice:"+ price + "\nMade in USA? Ans:"+ madeInUSA+ "\nMy grade:"+grade);	
	}
public Computer (String Brand, String Model, String OperatingSystem) {
	this.Brand = Brand;
	this.Model = Model;
	this.OperatingSystem = OperatingSystem;
	System.out.println("\nMy Brand:"+ Brand+"\nModel:" + Model +"\noperating system:");

}
public Computer(String Brand, String OperatingSystem, int price,  char grade,boolean madeInUSA) { // local variable
	this.Brand = Brand;
	this.OperatingSystem = OperatingSystem;
	this.price = price;
	this.madeInUSA = madeInUSA;
	this.grade = grade;
	System.out.println("My Brand:"+Brand  +"\noperating system:"+OperatingSystem+"\nPrice:"+ price + "\nMade in USA? Ans:"+ madeInUSA+ "\nMy grade:"+grade);	
	
}
}
