List<Integer> numbers = Arrays.asList(1, 2,2, 3,3,4, 4, 5, 6, 7, 8, 9, 10);


// Even Numbers
numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());

// Odd Numbers
        numbers.stream().filter(n -> n%2 !=0).collect(Collectors.toList());



// Occurence of Numbers

        numbers.stream().collect(Collectors.GroupingBy(n -> n, Collectors.counting());

        {1=1,2=2,3=2}