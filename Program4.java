// Swapping values of two variables -> Topic -> (assignment operator)

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();

        System.out.println("Before Sqapping :-");
        System.out.println("a = " + a + ", b = " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("After Sqapping :-");
        System.out.println("a = " + a + ", b = " + b);
    }
}

// #Output

// Enter first number : 5
// Enter second number : 6
// Before Sqapping :-
// a = 5, b = 6
// After Sqapping :-
// a = 6, b = 5
