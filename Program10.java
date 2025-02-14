//Create a program that shows bitwise AND of two numbers
//Create a program that shows bitwise OR of two numbers
//Create a program that shows bitwise XOR of two numbers
//Create a program that shows bitwise compliment of a number
//Create a program that shows use of left shift operator
//Create a program that shows use of right shift operator
//Create a program to check even odd using bitwise operators
// Note : Knowledge about Decimal to Binary conversion is required

import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first,second,num;
        int resultAND,resultOR,resultXOR,resultNOT,LeftShift,RightShift;
        System.out.println("Showcasing the Bitwise AND operator");
        System.out.println("Please enter the first number : ");
        first = sc.nextInt();
        System.out.println("Please enter the second number : ");
        second = sc.nextInt();

        resultAND = first & second;
        resultOR = first | second;
        resultXOR = first ^ second;
        resultNOT = ~first;
        LeftShift = first << 2;
        RightShift = first >> 1;

        System.out.println("Output of Bitwise AND is " + resultAND);
        System.out.println("Output of Bitwise OR is " + resultOR);
        System.out.println("Output of Bitwise XOR is " + resultXOR);
        System.out.println("Output of Bitwise NOT is " + resultNOT);
        //It is coming wrong due to 4bytes when we will enter an 8 byte number then it will work properly
        System.out.println("Output of Bitwise LeftShift is " + LeftShift);
        System.out.println("Output of Bitwise RightShift is " + RightShift);
        System.out.println();

        System.out.println("Enter a number : ");
        num = sc.nextInt();

        if((num & 1) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }

    }
}
