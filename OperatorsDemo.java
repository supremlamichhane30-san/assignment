public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder)

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a > b : " + (a > b));   // Greater than
        System.out.println("a < b : " + (a < b));   // Less than
        System.out.println("a == b : " + (a == b)); // Equal to
        System.out.println("a != b : " + (a != b)); // Not equal to

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y)); // Logical AND
        System.out.println("x || y : " + (x || y)); // Logical OR
        System.out.println("!x : " + (!x));         // Logical NOT
    }
}