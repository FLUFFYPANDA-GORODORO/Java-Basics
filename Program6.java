public class Unary {
    public static void main(String[] args) {

        int a = 5;
        int b = -a;
        int c = -b;
        // "-" operator converts positive value into negative value 


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();


        int p = 5;

        System.out.println(p++); // Post increment -> Use current value into the statement and then increment by 1
        System.out.println(p);

        System.out.println(++p); // Pre increment -> Increment the value by 1 and then use it into the statement
        System.out.println(p);
        System.out.println();

        System.out.println(p--); // Post decrement -> use the current value in the statement and then decrement by 1
        System.out.println(--p); // Pre decrement -> decrement the value by 1 and then use it in the statement

    }
}
