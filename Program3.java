// Type Conversion/Casting

public class TypeConversion {
    public static void main(String[] args) {
      
        // Implicit Type Casting / Automatic Type Conversion
        float myFloat = 5;
        System.out.println(myFloat);
        // It automatically prints 5.0

        // Explicit Type Casting
        int myInt = (int) 7.45f;
        System.out.println(myInt);
        // Anything written after decimal will be ignored
    }
}

// Outout 

// 5.0
// 7


// Implicit Type casting/conversion
// Implicit (Widening)
//byte -> short -> int -> long -> float -> double

// Explicit Type Casting/conversion
// Explicit (Narrowing)
// double -> float -> long -> int -> short -> byte
