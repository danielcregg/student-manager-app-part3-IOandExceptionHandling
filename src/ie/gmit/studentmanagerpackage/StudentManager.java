package ie.gmit.studentmanagerpackage;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

	// Create Student ArrayList
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

		// Loop over all Students on list and check if new Student being added is already on List
		for (Student stuObj : stuObjArrList) {
			if (stuObj.getStudentId().equals(studentObject.getStudentId())) {
				System.out.println("Student NOT added to Student List. Student already on Student List!");
				return false;
			}
		}

		return stuObjArrList.add(studentObject);
	}

	// Student Add Method
	public boolean removeStudent(Student studentObject) {
		return stuObjArrList.remove(studentObject);
	}

}
