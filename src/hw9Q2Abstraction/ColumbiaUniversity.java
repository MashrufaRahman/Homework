package hw9Q2Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, Vocationalchool {

	// public abstract void chemistry();
	// Inside the class contains only non abstract methods

	public void biology() {
		System.out.println("This is non abstract or implemented method");
	}

	// Default constructor
	public ColumbiaUniversity() {

	}
	
	public static void studyRoom() {
		System.out.println("StudyRoom method is from College interface");
		
	}

	@Override
	public void commonRoom() {
		System.out.println("commonRoom method From College Interface ");
		
	}

	@Override
	public void laboratory() {
		System.out.println("laboratory method From College Interface ");
		
	}

	@Override
	public void languageClub() {
		System.out.println("languageClub method From College Interface ");
		
	}

	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method From Hospital Interface ");
		
	}

	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method From Hospital Interface ");
		
	}

	@Override
	public void cateteria() {
		System.out.println("cateteria method From Hospital Interface ");
		
	}

	@Override
	public void lawInfo() {
		System.out.println("lawInfo method From LaeSchool Interface ");
		
	}

	@Override
	public void vocationalInfo() {
		System.out.println("VocationalInfo method From VocationalSchool Interface ");
		
	}

	@Override
	public void classSize() {
		System.out.println("classSize method From University Interface");
		
	}

	@Override
	public void playGround() {
		System.out.println("playGround method From University Interface");
		
	}

	@Override
	public void teacher() {
		System.out.println("teacher method From University Interface");
		
	}

	@Override
	public void biochemistryLab() {
		System.out.println("biochemistryLab method From MedicalSchool abstract class");
		
	}

	@Override
	public void caring() {
		System.out.println("caring method From NursingSchool abstract class");
		
	}

	
	}


