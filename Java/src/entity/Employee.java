package entity;

import java.util.Comparator;
import java.util.List;

import com.sun.istack.internal.NotNull;

public class Employee implements Comparable<Employee> {

	@NotNull
	private int id;

	private String name;

	private int age;
	
	private long salary; 

	/**
	 * @return the salary
	 */
	public synchronized long getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public synchronized void setSalary(long salary) {
		this.salary = salary;
	}

	private String city;

	List<Address> address;

	public Employee(int id, int age, String city) {
		super();
		this.id = id;
		this.age = age;
		this.city = city;
	}

	public Employee(int id, int age, String city, List<Address> address) {
		super();
		this.id = id;
		this.age = age;
		this.city = city;
		this.address = address;
	}

	public Employee(int id, String name, int age, String city, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", address=" + address
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	return Integer.compare(this.getAge(), o.getAge()) ;
	}
	

    /**
     * Comparator to sort employees list or array in order of Salary
     */
	
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

  

    /**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

}
