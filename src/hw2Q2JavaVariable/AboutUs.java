package hw2Q2JavaVariable;

public class AboutUs {
	public String MyName;// variable declared
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public char myGender;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

	public AboutUs() {
		System.out.println("This is all about me:");// Constructor declared
	}

	public void aboutUs() { // method implemented
		System.out.println("My Name is:" + MyName + "\nMy Age:" + myAge + "\nMy House Rent:" + myHouseRent
				+ "\nMy Bank Balance:" + myBankBalance + "\nMy Gender:" + myGender + "\nMy Height:" + myHeight
				+ "\nMy Grade:" + myGrade + "\nAm I US Citizen? Ans:" + usCitizen);
	}

	public static void main(String[] args) {
		AboutUs aboutUs = new AboutUs(); // instantiate
		aboutUs.aboutUs();

	}

}
// pr