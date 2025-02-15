//Devlop a Program that prints the multiplication table for a given number
//Create a program to sum all odd numbers from 1 to a specified number N
//Write a function that calculates the factorial of a given number
//Create a program that computes the sum of digits of an integer
//Create a program to find the LCM of two numbers/Integers
//Create a program to find the GCD of two numbers
//Create a program to check whether a given number is prime or not
//Create a program to reverse the digits of a number
//Create a program to print the fibonacci series upto a certain N
//Create a program to verify a number is an Armstrong number
//Create a program to verify if a number is a palindrome
//Patterns



import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,result,sum;
        System.out.println("Enter a number : ");
        a = sc.nextInt();


       printMultiplication(a);

//        result = printOddSum(a);
//        System.out.println("Sum of odd digits upto " + a + " is : " + result);


    }

    public static void printMultiplication(int num){
        System.out.println("Multiplication of the given number is :");
        System.out.println();

        int i = 1;
        while(i <= 10){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;

        }

    }

    public static int printOddSum(int num){
        int sum = 0;
        int i = 1;

        while(i <= num ){
            sum += i;
            i += 2;
        }
        return sum;
    }


}

