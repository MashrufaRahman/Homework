package hw8Q2UseOfSuperInChildClass;
/*
 *  b) Create a class name 'Daughter', declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class. Paste GitHub link below.
 */

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	// default constructor declared 
	public Daughter() {
		super("Mozammel", 71, 'M', false); // represent the parameterized constructor of parent class
		super.father();
		super.fatherInfo("Mozammel", 71, 'M', false); // parameterized constructor declared

		super.FamilyName = "Khan"; // super keyword can initialized variable from the parent class
		super.Name = "Mozammel";
		super.age = 71;
		super.sex = 'M';
		super.usCitizen = false;

		System.out.println("Family name is:" + FamilyName);
		System.out.println("This is a default constructor for Daughter class");

	}
	//parameterized constructor declared
	public Daughter(String birthMonth, int age) {
		super("Mashrufa", 45, 'F', true); // super method can call either default or parameterized constructor
											
		super.fatherInfo("Shapla", 36, 'F', false); // super keyword can call the parameterized method from parent class
									
		super.FamilyName = "Khan"; // super keyword can initialized variable from the parent class
		super.Name = "Mozammel";
		super.age = 71;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family Name is:" + FamilyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month:" + birthMonth + "\nAge:" + age);
	}

// regular daughter method implement
	public void daughter() {
		super.fatherInfo("Shapla", 36, 'F', false);
		super.FamilyName = "Khan";// super keyword can initialized variable from the parent class
		super.Name = "Mzammel";
		super.age = 71;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family Name is:" + FamilyName);
		System.out.println("This is a void method from Daughter class");

	}

// parameterized method daughterInfo created
	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Shapla", 36, 'F', false);
		super.FamilyName = "Khan"; // super keyword can initialized variable from the parent class
		super.Name = "Mozammel";
		super.age = 71;
		super.sex = 'M';
		super.usCitizen = false;
		System.out.println("Family Name is:" + FamilyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month:" + birthMonth + "\nAge:" + age);

	}
}