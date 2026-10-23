public class p23 {
    public static void main(String[] args) {

        // Primitive data types
        int a = 10;
        double b = 20.5;
        char c = 'A';

        // Boxing
        Integer intObj = Integer.valueOf(a);
        Double doubleObj = Double.valueOf(b);
        Character charObj = Character.valueOf(c);

        System.out.println("After Boxing:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);

        // Unboxing
        int x = intObj.intValue();
        double y = doubleObj.doubleValue();
        char z = charObj.charValue();

        System.out.println("\nAfter Unboxing:");
        System.out.println("int: " + x);
        System.out.println("double: " + y);
        System.out.println("char: " + z);

        // Autoboxing
        Integer num = 50;

        // Auto-unboxing
        int num2 = num;

        System.out.println("\nAutoboxing: " + num);
        System.out.println("Auto-unboxing: " + num2);
    }
}