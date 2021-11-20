package hw9Q2Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();

		columbiaUniversity.biology();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.dorm();
		ColumbiaUniversity.studyRoom(); // Here I have call the static method from ColumbiaUniversity class
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.lawInfo();
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.caring();

		System.out.println("***********************");

		University university = new ColumbiaUniversity();
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();// This is the static method from university interface
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cateteria();
		university.morque();
		University.pharmacy();// I have call the static method from Hospital Interface

		System.out.println("***********************");

		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.statistics();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.cafeteria();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.physics();
		medicalSchool.aeronauticalInfo();
		medicalSchool.cafeteria();

	}

}
