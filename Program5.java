public class Arithmetic {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        System.out.println("a = " + a + " , b = " + b);
        System.out.println("Addition : " + (a+b));
        System.out.println("Subtraction : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));
        // Modulus -> Remainder
        System.out.println("Modulus : " + (a%b));
        System.out.println();
        float x = 5;
        float y = 2;

        System.out.println("x = " + x + " , y = " + y);
        System.out.println("Addition : " + (x+y));
        System.out.println("Subtraction : " + (x-y));
        System.out.println("Multiplication : " + (x*y));
        System.out.println("Division : " + (x/y));

        System.out.println("OrderOfOperation -> It follows BODMAS Rule");
        System.out.println(8-3*3);
        System.out.println(9/3*6/3);
        System.out.println(8-5+7-1);
        // In case of Same operator it executes from left to right
        System.out.println(9/3/3);

    }
}
