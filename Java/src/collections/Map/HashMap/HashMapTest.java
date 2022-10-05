package collections.Map.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import entity.Address;
import entity.Employee;
import entity.Student;

public class HashMapTest {

	private static List<Student> getDuplicateStudentList() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Sagar"));
		studentList.add(new Student(1, "Sagar"));
		studentList.add(new Student(1, "Sagar"));
		studentList.add(new Student(1, "Sagar"));
		studentList.add(new Student(1, "Sagar"));

		return studentList;
	}

	private static List<Student> getDistinctStudentList() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "Sagar"));
		studentList.add(new Student(2, "Sagar"));
		studentList.add(new Student(3, "Sagar"));
		studentList.add(new Student(4, "Sagar"));
		studentList.add(new Student(5, "Sagar"));

		return studentList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentListData = new ArrayList<>();
	//	studentListData = getDuplicateStudentList();
		studentListData = getDistinctStudentList();
		
		Map<Student, String> ac = new HashMap<Student, String>();
		for (Student student : studentListData) {
			ac.put(student, "name");
		}
		for (Entry<Student, String> nos : ac.entrySet()) {
			System.out.println(" Key:-" + nos.getKey() + " Value:-" + nos.getValue());
		}

	}

}
