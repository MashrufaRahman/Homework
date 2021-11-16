package hw8Q2UseOfSuperInChildClass;
/*
 * Create a package name "hw8Q2UseOfSuperInChildClass" in the HW project. Inside the package, a) Create a class name Father. declare 5 variable like Name, age, sex, usCitizen, FamilyName. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it) from the first 4 variables. Use 'FamilyName' variable to initialize by super keyword in child class. Create a regular void type method name father() which is implemented, declare a sysout inside it. Create a parameterized method fatherInfo() which also contain it's 4 variables, declare a sysout (you can copy from parameterized constructor) b) Create a class name 'Daughter', declare variable birthMonth, age. Declare default (declare a sysout inside it) and parameterized constructor (declare a sysout inside it), and implement a regular method daughter() and declare a sysout. Create a parameterized method daughterInfo() which contains 2 of its variables as local variable. declare a sysout (you can copy from parameterized constructor) . Daughter extends Father (super class). Use super method, super keyword and show all of their use in child class. and initialize in a TestFamily Class. Paste GitHub link below.
 */

public class Father {

	public String Name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	// default constructor declared
	public Father() {
		System.out.println("This is default constructor");

	}

	public Father(String Name, int age, char sex, boolean usCitizen) { // Parameterized constructor declared
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\nMy Name:" + Name + "\nMy Age:" + age + "\nMy sex:" + sex + "\nAm I usCitizen?" + usCitizen);
	}

//create a regular void method
	public void father() {
		System.out.println("void type method is implemented");

	}

	// parameterized method
	public void fatherInfo(String Name, int age, char sex, boolean usCitizen) {
		this.Name = Name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My Name:" + Name + "\nMy Age:" + age + "\nMy sex:" + sex + "\nAm I usCitizen?" + usCitizen);

	}

}
