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
        int a,result,sum,reverse,palindrome;
        int n1,n2,lcm,gcd;
        long fact;
        boolean prime,armStrong;
        System.out.println("Enter a number : ");
        a = sc.nextInt();
//        System.out.println("Enter first number : ");
//        n1 = sc.nextInt();
//        System.out.println("Enter second number : ");
//        n2 = sc.nextInt();

//        printMultiplication(a);

//        result = printOddSum(a);
//        System.out.println("Sum of odd digits upto " + a + " is : " + result);

//        fact = factorial(a);
//        System.out.println("Factorial of " + a + " is " + fact);

//        sum = sumOfDigits(a);
//        System.out.println("Sum of the digit is : " + sum);

//        lcm = LCM(n1,n2);
//        System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm);

//        gcd = GCD(n1,n2);
//        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);

//        prime = isPrimeNum(a);
//        if(prime){
//            System.out.println(a + " is a Prime number");
//        }
//        else{
//            System.out.println(a + " is not a prime number");
//        }

//        reverse = reverseNUM(a);
//        System.out.println("Reverse of the given number is : " + reverse);

//        fibonacciSeries(a);

//        armStrong = isArmStrong(a);
//        if(armStrong){
//            System.out.println(a + " is a ArmStrong number");
//        }
//        else{
//            System.out.println(a + " is not a ArmStrong number");
//        }

        palindrome = reverseNUM(a);
        if(palindrome == a){
            System.out.println(a + " is a palindrome number");
        }
        else{
            System.out.println(a + " is not a palindrome number");
        }








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

    public static long factorial(int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i++;
        }

        return fact;
    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num % 10);
            num = num/10;
        }
        return sum;
    }

    public static int LCM(int num1,int num2){
        int i=1;
        while(i <= num2){
            int factor = num1 * i;
            if(factor % num2  == 0){
                return factor;
            }
            i++;
        }
        return 0; //unreachable

//  -----------------------------------------

//        int i=1;
//        while(true){
//            int factor = num1 * i;
//            if(factor % num2  == 0){
//                return factor;
//            }
//            i++;
//        }
    }

    public static int GCD(int num1,int num2){
        int gcd = 1;
        int i = 2;
        int least = LeastNum(num1,num2);
        while(i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int LeastNum(int num1,int num2){
        if(num1 < num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static boolean isPrimeNum(int num){
        int i = 2;
        while(i < num ){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static int reverseNUM(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num/10;
        }
        return newNum;
    }

    public static void fibonacciSeries(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int n1=0,n2=1;
        while(n1 + n2 <= num){
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

        }
    }

    public static boolean isArmStrong(int num){
        int ogNum = num;
        int no_of_digits = noOfDigits(num);
        int finalNumber = 0;
        while(num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber = finalNumber + pow(lastDigit,no_of_digits);
        }
        System.out.println("Finalnumber is : " + finalNumber);
        return finalNumber == ogNum;

    }

    public static int noOfDigits(int num){
        int digits=0;
        while(num > 0){
            num = num/10;
            digits++;
        }
        return digits;
    }

    public static int pow(int num1,int num2){
        int result = 1;
        int i = 0;
        while(i < num2 ){
            result = result * num1;
            i++;
        }

        System.out.println("Power of " + num1 + " is " + result);
        return result;
    }





}

