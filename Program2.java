// Scanner Class in java to store the user input

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name;
        int num1,num2;
        float num3;

        System.out.print("Enter your name :");
        name = sc.nextLine();
        System.out.println(name);
        System.out.println();

        System.out.println("Enter the First number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number :");
        num2 = sc.nextInt();
        System.out.println("Sum of two numbers is : " + (num1+num2));
        System.out.println();

        System.out.print("Enter a float number :");
        num3 = sc.nextFloat();
        System.out.println(num3);
        System.out.println();

    }
}


// # Output

// Enter your name : Gaurav patil
// Gaurav patil

// Enter the First number :
// 5
// Enter the Second number :
// 4
// Sum of two numbers is : 9

// Enter a float number : 5.12
// 5.12

