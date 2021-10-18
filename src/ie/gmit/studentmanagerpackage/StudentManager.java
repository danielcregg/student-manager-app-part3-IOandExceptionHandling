package ie.gmit.studentmanagerpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
  

public class StudentManager {
    
	// Declare a List called students to hold the student objects
	private List<Student> stuObjArrList;

	// Constructor
	public StudentManager() {
		// Instantiate a student ArrayList
		stuObjArrList = new ArrayList<Student>();
	}

	// Getters and Setters
	public List<Student> getStudents() {
		return stuObjArrList;
	}

	public void setStudents(List<Student> studentList) {
		this.stuObjArrList = studentList;
	}

	// Student Add Method                   
	public boolean addStudent(Student studentObject) {
			return stuObjArrList.add(studentObject);
	}
	
	// Student Add Method                   
	public boolean removeStudent(Student studentObject) {
			return stuObjArrList.remove(studentObject);
	}
	
}
