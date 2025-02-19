public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ABC", 1000);
        Employee e2 = new Employee(1, "ABC", 1000);
        
        if (e1.equals(e2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;  
        this.salary = salary;
    }

}

