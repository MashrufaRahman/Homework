package hw8Q3Abstraction;


public interface LawSchool {

	public void lawInfo ();
	
}
/*
 * 3-1) i) Total how many keywords are used for the inheritance in Interface, answer by Java comments?
 * Ans - one -extends
 *  Can an interface inherit other Interfaces, or a regular class or abstract class by extends or implements keyword?
 *  ans - Interface can inherit more than one interface by extends keywords but it can't inherit a regular class or an abstract class.
 *   How many inheritance is possible? Use the Interface -- "University" to answer my questions (University extends College, Hospital) (by multiple line comments).
 *   Ans - An Interface can inheritance more then one interface by extends key words.
 *    ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class?
 *    Ans - only one
 *     Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends or implements keyword?
 *   Ans - using extends keyword can inherit only one class. 
 *      How many inheritances is possible by an Abstract Class? Use one of above Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and use the keywords to answer my questions. 
 *   Ans -  An abstract class only use the extends keyword not implements.  
 *      iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class?
 *      Ans - none
 *       Can a regular Class inherit other Abstract Class or a regular class or interface by extends or implements keyword?
 *       Ans - regular class or abstract can inherit only one by extends keywords.
 *        How many inheritances is possible by a regular Class? Use one of above regular Classes (ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool) and use the keywords to answer my questions. 
 *    only one using extends keyword    
 */ 
