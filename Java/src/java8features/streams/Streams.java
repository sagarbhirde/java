package java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import entity.Address;
import entity.Employee;

public class Streams {

	private static List<Employee> getEmployeesFromDataSource() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(
				new Employee(2, "Saurabh ", 20, "Pune", Arrays.asList(new Address("Sai Baba Mandir", "Pune", 411048))));
		employeeList.add(
				new Employee(3, "Ramesh ", 45, "Pune", Arrays.asList(new Address("Ravivar Peth", "Kolhapur", 415268))));
		employeeList.add(new Employee(4, "Suresh", 50, "Satara",
				Arrays.asList(new Address("mangalwar Peth", "Satara", 400251))));
		employeeList.add(new Employee(1, "Sagar Bhirde", 20, "Miraj",
				Arrays.asList(new Address("Budhwar Peth", "Miraj", 416410))));

		return employeeList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employeeList = getEmployeesFromDataSource();
		List<Employee> employeeList2 = new ArrayList<>();
		List<String> employeeNames = new ArrayList<>();
		new ArrayList<>();
		Map<String, List<Employee>> employeeByGrouping = new HashMap<String, List<Employee>>();

		// display employees details whose age is less than 25
		employeeList2 = employeeList.stream().filter(e -> e.getAge() < 25).collect(Collectors.toList());
		// display employees details whose age is less than 25 and City is pune
		employeeList2 = employeeList.stream().filter(e -> e.getAge() < 25 && e.getCity().equals("Pune"))
				.collect(Collectors.toList());
		// display employees names whose age is less than 25

		employeeNames = employeeList.stream().filter(e -> e.getAge() < 25).map(Employee::getName)
				.collect(Collectors.toList());

		employeeByGrouping = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getCity, Collectors.toList()));

		int ageSum = employeeList.stream().collect(Collectors.summingInt(Employee::getAge));

		System.out.println("*************************Using Comparable Sort**********************");
		Collections.sort(employeeList);
		System.out.println("*************************Using Comparator Sort**********************");
		Comparator<Employee> AgeComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getAge() - e2.getAge();
			}
		};
		Collections.sort(employeeList, AgeComparator);
		Comparator<Address> comparator = new Comparator<Address>() {

			@Override
			public int compare(Address o1, Address o2) {
				return Integer.compare(o1.getPinCode(), o2.getPinCode());
			}

		};
		System.out.println("*************************For Loop Iteration**********************");
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}
		System.out.println("*************************Using For Each **********************");
		employeeList.forEach((employee) -> System.out.print(employee.toString()));

		// **************Using spliterator************//
		employeeList.spliterator();
		System.out.println("Spliterator " + employeeList);

		System.out.println("Age Sum:-" + ageSum);

		for (Entry<String, List<Employee>> employee : employeeByGrouping.entrySet()) {
			System.out.println("Key:-" + employee.getKey());
			employee.getValue().forEach(e -> System.out.println(e));
		}

		for (String string : employeeNames) {
			System.out.println(string);
		}
		for (Employee employee : employeeList2) {
			System.out.println(employee.getAge());
			System.out.println(employee.getCity());
			System.out.println(employee.getId());
			System.out.println(employee.getName());
		}
	}

}
