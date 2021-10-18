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
		
		StudentManager stuManObj = new StudentManager();
		
		Student studentObject1 = new Student("G00123456");
		
		boolean addStatus = stuManObj.addStudent(studentObject1);
		
		System.out.println(addStatus);
		
		boolean removeStatus = stuManObj.removeStudent(studentObject1);
		
		System.out.println(removeStatus);
		
		System.out.println("The End");
		
	} // End main method
	
} // End Main Class
