//import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int num = 1; //Initialization
        while (num <= 10){ // Condition
            System.out.println(num); // Actual work
            num = num + 1;  //Updating the condition
        }

//        int count = 500;
//        while (count >= 200){
//            System.out.println(count);
//            count -= 1;
//        }
//
//        int i = 0;
//        int number;
//        while(i < 5){
//            System.out.print("Enter a number : ");
//            number = sc.nextInt();
//            System.out.println(number);
//            i++;
//        }

        fun();
        printTriangle();

        int c;
        c = addition(4,5);
        System.out.println(c);


    }

    public static void fun(){
        System.out.println("Hello World");
    }

    public static int addition(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public static void printTriangle(){
        int rows = 0;


        while(rows < 5){
            System.out.print("*");
            int columns = 0;
            while(columns < rows){
                System.out.print(" *");
                columns++;
            }
            System.out.println();
            rows++;
        }
    }

}
