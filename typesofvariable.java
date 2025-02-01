


// public class typesofvariable{
//     int instanceVar = 20; // Instance variable
//     static int staticVar = 30; // Static variable

//     //static variable will only run 1 time if u create as many objects u want
//     static{
//         System.out.println("Static block is executed");
//     }

//     //Instance block will run as many objects u create
//     {
//         System.out.println("Instance block is executed");
//     }

//     public void display() {
//         int localVar = 10; // Local variable
//         System.out.println(localVar);
//     }

//     public static void main(String[] args) {
//         typesofvariable tv=new typesofvariable();
//         typesofvariable tv1=new typesofvariable();
//         tv.display();
//         // System.out.println(tv.localVar); can't access outside its scope
//         System.out.println(tv.instanceVar);
//     }
// }



//Instance variable
// Instance variables are declared directly inside a class but outside any method, constructor, or block.
// The scope of an instance variable is the entire class, except inside static methods or static blocks.
// class Employee {
//     // int num;        // Default: 0
//     // boolean flag;   // Default: false
//     // String text;    // Default: null
//     int id;          // Instance variable
//     String name;     // Instance variable
//     int instanceVar = 10; // Instance variable

//     Employee(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     // static void display() {
//         // System.out.println(id); // Error: Cannot make a static reference to a non-static field
//     // }

//     //If you want to access an instance variable in a static method or block, you must explicitly create or use an existing object.

//     static void display() {
//         Employee obj = new Employee(100,"Ankur");
//         System.out.println(obj.id); // Access through an object
//     }

//     void displayInfo() {
//         System.out.println("ID: " + id + ", Name: " + name);
//     }
// }

// public class typesofvariable{
//     public static void main(String[] args) {
//         Employee emp1 = new Employee(101, "Alice");
//         Employee emp2 = new Employee(102, "Bob");

//         emp1.displayInfo(); // Output: ID: 101, Name: Alice
//         emp2.displayInfo(); // Output: ID: 102, Name: Bob
//         emp1.display();
//         emp2.display();

//     }
// }

//static variable
// All objects of the class share the same copy of the static variable.
// If one object modifies the static variable, the change is reflected across all objects.
// class Example {
//     static int staticVar = 10;

//     void modify() {
//         staticVar += 5; // Modify static variable
//     }

//     public static void main(String[] args) {
//         Example obj1 = new Example();
//         Example obj2 = new Example();

//         obj1.modify();
//         System.out.println(obj2.staticVar); // Output: 15 (shared value)
//     }
// }

//or

// class Example {
//     static int sharedValue = 0; // Static variable

//     Example() {
//         sharedValue++; // Increment static variable
//     }

//     static void displaySharedValue() {
//         System.out.println("Shared Value: " + sharedValue);
//     }

//     public static void main(String[] args) {
//         Example obj1 = new Example();
//         Example obj2 = new Example();

//         // Accessing static variable
//         System.out.println(Example.sharedValue); // Output: 2
//         Example.displaySharedValue(); // Output: Shared Value: 2
//     }
// }



