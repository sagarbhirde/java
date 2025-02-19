

List<Employee> employees = new ArrayList<>();
Salary
10000,1
5000,2
1000,3

employees.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary()).collect(Collectors.toList());


// i wanted to sort the employees based on their salary in ascending order. I wrote the above code but it is not working. Can you help me with this?

// Answer: The code you have written is almost correct. The only issue is that the sorting is not happening in the correct order. The sorting should be done in ascending order, but you are subtracting the salaries of the employees, which will give you the difference between the salaries. To sort the employees based on their salary in ascending order, you can use the following code:







