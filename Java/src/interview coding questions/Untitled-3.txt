

// functional interface for the lambda expression

@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}

public class Main {
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        MyFunctionalInterface f = () -> System.out.println("Hello");
        f.display();
    }
}

// Output: Hello

// predicate interface

import java.util.function.Predicate;

// Predicate interface example

public class Main {
    public static void main(String[] args) {
        // create a predicate
        Predicate<Integer> lesserthan = i -> (i < 18);

        // calling predicate method
        System.out.println(lesserthan.test(10));
    }
}

// Output: true

// consumer interface

import java.util.function.Consumer;

// Consumer interface example

public class Main {
    public static void main(String[] args) {
        // Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);

        // Implement display using accept()
        display.accept(10);
    }
}

// Output: 10

// function interface

import java.util.function.Function;

// Function interface example


