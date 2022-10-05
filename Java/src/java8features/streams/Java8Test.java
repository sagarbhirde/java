package java8features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import entity.Address;
import entity.Employee;

public class Java8Test {

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

		List<Employee> abc = getEmployeesFromDataSource();

		abc = abc.stream().filter(e -> e.getAge() > 19).filter(e -> e.getCity().equals("Pune"))
				.collect(Collectors.toList());

		System.out.print(abc.toString());

		List<String> names = new ArrayList<>();
		names.add("sagar");
		names.add("bhirde");

		List<String> names2 = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.print(names2.toString());
		List<Integer> list = Arrays.asList(4, 2, 1, 6, 3);

		list.stream().sorted().filter(e -> e % 2 == 0).map(e -> e + "o").forEach(s -> System.out.println(s));

	}

}
