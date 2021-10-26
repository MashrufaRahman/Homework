package hw3Q4Constructor;
/*
 * 04) Create a package name "hw3Q4Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Student". Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. Also, initialize the parameterized method and see the outcome. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)
 */
public class TestStudent {

	public static void main(String[] args) {
		
		Students students=new Students();
		System.out.println("*******Parameterize Constructor*********");
		Students students2=new Students("Mashrufa",2021050,'F',3.976f,true);
		System.out.println("*******Parameterize Method***********");
		students2.students("Mashrufa",2021050,'F',true,3.976f);
		
	}
	
	
	
	
	
	
	
}
