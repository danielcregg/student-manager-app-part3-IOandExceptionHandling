package ie.gmit.studentmanagerpackage;

/**
 * The Main class holds the main method.
 */
public class Main {

	// Main method containing print statement.
	public static void main(String[] args) {

//		// Create menu object
//		Menu menuObject = new Menu();
//		// Run menu start method
//		menuObject.start();
		boolean addStatus;

		StudentManager stuManObj = new StudentManager();

		Student studentObject1 = new Student("G00123458", "Alf", "Stewart", 3);
		Student studentObject2 = new Student("G00123459", "Sally", "Fletcher", 4);
		Student studentObject3 = new Student("G00123459", "Sally", "Fletcher", 4);

		addStatus = stuManObj.addStudent(studentObject1);
		System.out.println(addStatus);
		addStatus = stuManObj.addStudent(studentObject2);
		System.out.println(addStatus);
		addStatus = stuManObj.addStudent(studentObject3);
		System.out.println(addStatus);

		// boolean removeStatus = stuManObj.removeStudent(studentObject1);

		// System.out.println(removeStatus);

		System.out.println("The End");

	} // End main method

} // End Main Class
