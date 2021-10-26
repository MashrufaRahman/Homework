package hw3Q3Constructor;
/*03) Create a package name "hw3Q3Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Fourth outcome for 3 variable, 5th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)*/
public class TestComputer {

	public static void main(String[] args) {	
		Computer computer = new Computer(); // Default constructor (no argument constructor is initialized
		System.out.println("***********************");
		Computer computer1=new Computer("Apple", "MacBook", "MacOs Mojave", 800, 'C', false);
		System.out.println("***************************");
		Computer computer2 = new Computer("Window", "Window10","Windows11",500, 'B', true);
		System.out.println("**************************");
		Computer computer3=new Computer("Linux","Debian", "Fedora");
		System.out.println("*******************");
		Computer computer4=new Computer("Apple", "MacOs Mojave", 800, 'C', false);
	}
		
}
		