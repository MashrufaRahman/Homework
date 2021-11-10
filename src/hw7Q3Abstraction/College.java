package hw7Q3Abstraction;

public interface College {
	public void commonRoom();

	public void laboratory();

	public void languageClub();

	// Default method created
	public default void dorm() {
		
	}
	
	// Static method created
	public static void studyRoom() {
		
	}

}

/*3-2) i) how many keywords are used for the inheritance in Interface, answer by Java comments?
 *Ans - an interface can inherit more than one interface by extends keyword
 *  Can an interface inherit other Interface, or a regular class or abstract class?
 * Ans – yes interface can inherit more than one interface but it can’t inherit a regular class or abstract class.
 * v)	How many inheritance is possible? Use the Interface -- "University" to answer my questions (by multiple line comments).
 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class?
 * Ans - one which is extends
 * Can an Abstract Class inherit other Abstract Class or a regular class or interface?
 * Ans - Yes the abstract class can inherit only one abstract class or one regular class by extends keyword but it can’t inherit an Interface by extends keyword. 
 * How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes and use the keywords to answer my questions
 * 	Ans – an abstract class can inherit only one abstract class or one regular class by extends keyword.
 * 	iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? 
 * Ans – is one by extends keyword
 *	How many inheritances is possible by a regular Class? 
 * 	Ans – Two implements and  extends 
 */
