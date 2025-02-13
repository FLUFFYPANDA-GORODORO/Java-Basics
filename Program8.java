//If a number is divisible by 3 then print Fizz . If the number is divisible by 5 print Buzz .
//If the number is divisible by both 3 & 5 then print FizzBuzz
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : " );
        num = sc.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("Fizz Buzz");
        }
        else if(num%3==0){
            System.out.println("Fizz");
        }
        else if(num%5==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Enter a number which is divisible by either 3 0r 5 / by both");
        }

    }
}
