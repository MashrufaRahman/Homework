package hm3Q2variableAndMethod;
/*02) Create a package name "hw3Q2variableAndMethod" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class NAME-- "configuration" and use only one System.out.println(). Use the declared variables inside sysout. Create another class TestComputer. Create object from Computer class under main method. Initialize all object and 'configuration' method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want second outcome in console for your configuration (Assume you are a Windows user even you are not). So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)*/

public class Computer {
	
	public String Brand; // variables are declared
	public String Model; 
	public String OperatingSystem;
	public int price;
	public boolean madeInUSA; // T/F
	public char grade;
	
	public void configuration() {
	System.out.println("My Brand:"+ Brand+"\nMy Model:" + Model +"\nThe operating system is:"+OperatingSystem+"\nThe Price is:"+ price + "\nMade in USA? Ans: false"+ madeInUSA+ "\nMy grade:"+grade);	
	}

	
	

}
