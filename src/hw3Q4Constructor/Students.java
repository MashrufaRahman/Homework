package hw3Q4Constructor;
/*
 * 04) Create a package name "hw3Q4Constructor" in your "HomeWorkOctober2021" project. Inside the package, a) Create a class "Student". Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. Also, initialize the parameterized method and see the outcome. Push in the github. Paste your github link below. (If you are not able to push to github, please paste below)
 */

public class Students {
	
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;
	
	public Students() {
		System.out.println("This is from default constructor of Student class");
	}
	public Students( String StNam, int stID, char sex, float grade,boolean programmer) {
		this.StName=StNam;
		this.stID=stID;
		this.sex=sex;
		this.programmer=programmer;
		this.grade=grade;
		System.out.println("Studen Name: "+StNam+"\nStudent ID: "+stID+"\nSex: "+sex+"\nGrade"+grade
				+"\nProgrammer: "+programmer);
	}
	public  void students(String StNam, int stID, char sex, boolean programmer, float grade) {
		this.StName=StNam;
		this.stID=stID;
		this.sex=sex;
		this.programmer=programmer;
		this.grade=grade;
		System.out.println("Student Name: "+StNam+"\nStudent ID: "+stID+"\nSex: "+sex+"\nProgrammer: "+programmer+"\nGrade"+grade);
	}
	}

	

	
