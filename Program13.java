import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 98;
//        arr[1] = 5;
//        arr[2] = 14;
//        arr[3] = 2;
//        arr[4] = 18;
//        System.out.println(arr[1]);

//-------------------------------------------------------

//        int[] arr = {24,52,10,4,8};
//        System.out.println(arr[1]);
//        System.out.println("Length of the array is " + arr.length);
//        System.out.println();
//
//        int i=0;
//        while(i < arr.length){
//            System.out.println("Vale at index " + i + " is " + arr[i]);
//            i++;
//        }

//-------------------------------------------------------

        int num;
        System.out.print("Enter the size of the array : ");
        num = sc.nextInt();

        int[] marks = new int[num];

        int i=0;
        while(i < marks.length){
            System.out.print("Enter the value for index " + i + " : ");
            marks[i] = sc.nextInt();
            i++;
        }
        System.out.println();
        System.out.println("The elements of array are : ");

        i = 0; // Reset the value of i
        while(i  < marks.length){
            System.out.println("Value at index " + i + " is " + marks[i]);
            i++;
        }
        System.out.println("The end");



    }
}
