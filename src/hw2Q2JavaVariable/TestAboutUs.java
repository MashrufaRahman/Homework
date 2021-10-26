package hw2Q2JavaVariable;



public class TestAboutUs {

	public static void main(String[] args) {
	

		AboutUs aboutUs1 = new AboutUs(); // Constructor initialized
		aboutUs1.MyName = "Mashrufa Rahman"; // variables initialized
		aboutUs1.myAge = 40;
		aboutUs1.myHouseRent = 3000;
		aboutUs1.myYearlySalary = 500000;
		aboutUs1.myBankBalance = 100000;
		aboutUs1.myGender = 'F';
		aboutUs1.myHeight = 5.3f;
		aboutUs1.myGrade = 4.55555555555;
		aboutUs1.usCitizen = true;
		aboutUs1.aboutUs();// method initialized

		System.out.println("\n********************");

		AboutUs aboutUs2 = new AboutUs();
		aboutUs2.MyName = "Alex"; // variable initialized 
		aboutUs2.myAge = 45;
		aboutUs2.myHouseRent = 6000;
		aboutUs2.myYearlySalary = 30000;
		aboutUs2.myBankBalance = 200000;
		aboutUs2.myGender = 'M';
		aboutUs2.myHeight = 6.3f;
		aboutUs2.myGrade = 2.333333333333;
		aboutUs2.usCitizen = true;
		aboutUs2.aboutUs(); // method initialized */

	} 

}
