//Create a program that determines if a number is positive , negative or zero
//Even or odd
//Create a program that determines greatest of three numbers
//Leap year
//Create a program that calculates grades based on marks
//A -> above 90% , B -> above 75% , C -> above 60% , D -> above 35% , F -> Fail below 35%

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("The number is positive");
        }
        else if(num == 0){
            System.out.println("The number is zero");
        }
        else{
            System.out.println("The number is negative");
        }
        System.out.println();
        // ------------------------------------------------------------------
        
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        System.out.println();

        //-------------------------------------------------------------------

        int year;
        System.out.println("Enter year : ");
        year = sc.nextInt();
        if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%100==0){
            System.out.println("Not a leap year");
        }
        else if(year%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        System.out.println();

        //----------------------------------------------------------------

        int a,b,c;
        System.out.println("Enter First number : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
        System.out.println("Enter third number : ");
        c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("First number is greatest");
        }
        else if(b>a && b>c){
            System.out.println("Second number is greatest");
        }
        else if(c>a && c>b){
            System.out.println("Third number is greatest");
        }
        else{
            System.out.println("Make sure all the three numbers are unique");
            System.out.println("Please enter a valid number");
        }
        System.out.println();

        // --------------------------------------------------------------------

        int marks;

        System.out.println("Enter Your marks : ");
        marks = sc.nextInt();

        if(marks<=100 && marks>=35){

            if(marks>=90){
                System.out.println("A grade");
            }
            else if(marks>=75){
                System.out.println("B grade");
            }
            else if(marks>=60){
                System.out.println("C grade");
            }
            else {
                System.out.println("D grade");
            }

        }
        else{
            System.out.println("You are fail");
        }
    }
}
