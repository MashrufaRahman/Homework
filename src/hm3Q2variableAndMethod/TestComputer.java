package hm3Q2variableAndMethod;

/*02) Create a package name "hw3Q2variableAndMethod" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Implement a method inside the class NAME-- "configuration" and use only one System.out.println(). Use the declared variables inside sysout. Create another class TestComputer. Create object from Computer class under main method. Initialize all object and 'configuration' method. I want the first outcome in console as --> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want second outcome in console for your configuration (Assume you are a Windows user even you are not). So, Total 2 outcome is expecting from the test class. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)*/


public class TestComputer {

	public static void main(String[] args) {
		Computer computer = new Computer(); // Default constructor (no argument constructor is initialized
		computer.Brand = "Apple"; // Parameterized constructor 01 outcome
		computer.Model = "MacBook Air ";
		computer.OperatingSystem = "MacOS Mojave";
		computer.price = 800;
		computer.grade = 'C';
		computer.madeInUSA = false;
		computer.configuration();
	
		System.out.println("******************");	
		
		Computer computer1 = new Computer();
			computer1.Brand = "Windows"; // parameterized constructor 02 outcome
			computer1.Model = "Windows 10";
			computer1.OperatingSystem="Windows 11";
			computer1.price=500;
			computer1.grade='A';
			computer1.madeInUSA=true;
			computer1.configuration();
			
			
			
	}
		
}
		