// Create a program that takes two inputs from the user and performs add,sub,mul,div operations
// Product of two float numbers
// Perimeter of a rectangle -> a + b + c + d / 2a + 2b
// Area of triangle -> 1/2 * base * height
// Simple Interest -> (p*t*r)/100
// Convert Fahrenheit into Celsius -> C = (F - 32) * 5/9

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.println("Enter the first number : ");
        a = sc.nextInt();
        System.out.println("Enter the second number : ");
        b = sc.nextInt();

        System.out.println("Addition of two numbers : " + (a+b));
        System.out.println("Addition of two numbers : " + (a*b));
        System.out.println("Addition of two numbers : " + (a-b));
        if(b == 0){
            System.out.println("Exception : Cannot divide by zero");
        }
        else{
            System.out.println("Addition of two numbers : " + (a/b));
        }
        System.out.println();
        // -------------------------------------------------------------------

        double len,width;
        System.out.println("Opposite sides of rectangle are equal");

        System.out.println("Enter the length of the rectangle : ");
        len = sc.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        width = sc.nextDouble();

        System.out.println("Perimeter of the rectangle is : " + (2*len + 2*width));
        System.out.println();

        // ----------------------------------------------------------------------

        double base,height;

        System.out.println("Enter the base of the triangle : ");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        height = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of a triangle is : " +  area);
        System.out.println();

        // -----------------------------------------------------------------------

        double p,r,t;

        System.out.println("Enter the principal : ");
        p = sc.nextDouble();
        System.out.println("Enter the Time in years : ");
        t = sc.nextDouble();
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextDouble();

        double simpleInterest = (p*t*r)/100;

        System.out.println("Simple Interest : " + simpleInterest);
        System.out.println();

        // ----------------------------------------------------------------------

        double C,F;
        System.out.println("Enter the value of Fahrenheit : ");
        F = sc.nextDouble();

        C = (F - 32) * 5/9;
        System.out.println("The value of Celsuis is : " + C);


    }
}

