List<Student> studentList = new ArrayList<Student>();
List<Department> departmentList = new ArrayList<Department>();
class Student {
	Integer id;
	String name ;
	List<Integer> deptIds;
}
class Department {
Integer departmentId;
	String deptName;
}
// All the departments with atleast two students using Java 8

List<Department> departmentsWithAtleastTwoStudents = departmentList.stream()
	.filter(department -> studentList.stream().filter(student -> student.deptIds.contains(department.departmentId)).count() >= 2)
	.collect(Collectors.toList());


// Language: python

// ds

studentList = []

departmentList = []

