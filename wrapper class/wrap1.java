import java.util.Scanner;


// Wrapper class is uses objects to wrap primitive datatypes in wrapper class also known as autoboxing
// taking out primitive datatypes from the objects in the wrapper class also known as unboxing
// classes in java.util package handles only object
// obj is needed for synchronization in multithreading
public class wrap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Autoboxing: Automatic conversion of a primitive type to its corresponding wrapper class.
        // int num = 5;
        // Integer obj = num; // Autoboxing


        // Unboxing: Automatic conversion of a wrapper class object back to its primitive type.
        // Integer obj = 10;
        // int num = obj; // Unboxing


        // Wrapper classes provide methods like:

        // Integer.parseInt(String s): Converts a string to an integer.
        // Double.valueOf(String s): Converts a string to a Double object.
        // Character.isDigit(char ch): Checks if a character is a digit.

        // wrap1 obj1=new wrap1();
        // System.out.println(obj1);




        //Main Program starts fromm here

        int a = 10; // Declare a primitive int variable and assign it a value of 10.

        // Manual boxing (explicitly converting primitive to wrapper object).
        // Here, Integer.valueOf(a) creates an Integer object that wraps the value of 'a'.
        Integer aa = Integer.valueOf(a); // Boxing (manual)

        // OR
        // Autoboxing (implicit conversion from primitive to wrapper object).
        // The compiler automatically converts the int value 'a' into an Integer object.
        Integer aa2 = a; // Autoboxing (automatic)

        // Unboxing (converting wrapper object back to primitive type).
        // The Integer object 'aa' is converted to its primitive int value.
        int b = aa; // Unboxing (automatic)

        // Print the primitive value 'a'.
        System.out.println(a); // Output: 10

        // Print the wrapper object 'aa'.
        System.out.println(aa); // Output: 10 (the wrapper object is automatically converted to a string representation of its value)// Calls aa.toString(), which returns "10"

        // Explicitly call the intValue() method to get the primitive int value from the wrapper object.
        System.out.println(aa.intValue()); // Output: 10 (manual unboxing using intValue())

        // Print the unboxed value 'b'.
        System.out.println(b); // Output: 10



    }
}

