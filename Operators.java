public class Operators {
    public static void main(String[] args) {
        int x = 12, y = 10;
        // int z = x + y;
        // System.out.println(z);
        // System.out.println("Sum is : " + z);
        
        System.out.println("Sum is : " + (x + y));
        System.out.println("Sub is : " + (x - y));
        System.out.println("Div is : " + (x / y));
        System.out.println("Mul is : " + (x * y));

        // Modulo Operator - % - returns remainder after division
        System.out.println(12 % 5);

        x += 5;     // x = x + 5
        x -= 5;     // x = x - 5
        x /= 5;     // x = x / 5
        x *= 5;     // x = x * 5
        x %= 5;     // x = x % 5

        // Relational Operators
        // boolean res = x == y;
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x != y);

        String name_1 = "Ravi";
        String name_2 = name_1;
        String name_3 = new String("Ravi");

        // Compare references
        System.out.println(name_1 == name_2);
        System.out.println(name_1 == name_3);

        // Compares values
        System.out.println(name_1.equals(name_3));

        // Logical Operators
        // Both the conditions must be true
        System.out.println(x > y && x < 20);
        // Either of the condition could be true
        System.out.println(x > y || x < 20);
        System.out.println(!(x > y));

        // Unary Operators
        // int z = +10;
        // int z = -10;
        int z = 10;
        
        // Post Increment
        System.out.println(z++);    // 10
        System.out.println(z);      // 11

        // Pre Increment
        System.out.println(++z);    // 12
        System.out.println(z);      // 12

        // Post Decrement
        System.out.println(z--);    // 12
        System.out.println(z);      // 11

        // Pre Decrement
        System.out.println(--z);    // 10
        System.out.println(z);      // 10

        // Instanceof Operator
        System.out.println(name_1 instanceof String);
        // System.out.println(x instanceof Integer);

        // Ternary Operator
        String res = x > y ? "X" : "Y";
        System.out.println(res + " is greater...");

    }
}
