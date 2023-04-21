
import java.util.Scanner;

// Создать( декларировать) все примитивные типы как глобальные переменные и как локальные переменные

// глобальные
public class Types {
    static byte byteVar;
    static short shortVar;
    static int intVar;
    static long longVar;
    static float floatVar;
    static double doubleVar;
    static char charVar;
    static boolean booleanVar;

// локальные
    public static void main(String[]  args) {
        byte byteVarLoc;
        short shortVarLoc;
        int intVarLoc;
        long longVarLoc;
        float floatVarLoc;
        double doubleVarLoc;
        char charVarLoc;
        boolean booleanVarLoc;
    }
}

// Считать из консоли каждый примитивный тип и присвоить его переменной

public class Types {
    public static void main(String[]  args) {
        Scanner scanner = new Scanner(System.  in);

        System.out.print("Введите byte: ");
        byte byteVar = scanner.nextByte();

        System.out.print("Введите short: ");
        short shortVar = scanner.nextShort();

        System.out.print("Введите int: ");
        int intVar = scanner.nextInt();

        System.out.print("Введите long: ");
        long longVar = scanner.nextLong();

        System.out.print("Введите float: ");
        float floatVar = scanner.nextFloat();

        System.out.print("Введите double: ");
        double doubleVar = scanner.nextDouble();

        System.out.print("Введите char: ");
        char charVar = scanner.next().charAt(0);

        System.out.print("Введите boolean: ");
        boolean booleanVar = scanner.nextBoolean();

        scanner.close();

    }
}

// Вывести все типы в таблицу при помощи println() и printf()

// при помощи println()

public class Types {
    public static void main(String[] args) {
        byte byteVar = 3;
        short shortVar = 333;
        int intVar = 3333333;
        long longVar = 333333L;
        float floatVar = 33.3f;
        double doubleVar = 3.3333;
        char charVar = 'a';
        boolean booleanVar = true;


        System.out.println("Byte: " + byteVar + " " + byteVarLoc);
        System.out.println("Short: " + shortVar + " " + shortVarLoc);
        System.out.println("Int: " + intVar + " " + intVarLoc);
        System.out.println("Long: " + longVar + " " + longVarLoc);
        System.out.println("Float: " + floatVar + " " + floatVarLoc);
        System.out.println("Double: " + doubleVar + " " + doubleVarLoc);
        System.out.println("Char: " + charVar + " " + charVarLoc);
        System.out.println("Boolean: " + booleanVar + " " + booleanVarLoc);


   // при помощи printf()

        System.out.printf("Byte: ", byteVar, byteVarLoc);
        System.out.printf("Short: ", shortVar, shortVarLoc);
        System.out.printf("Int: ", intVar, intVarLoc);
        System.out.printf("Long: ", longVar, longVarLoc);
        System.out.printf("Float: ", floatVar, floatVarLoc);
        System.out.printf("Double: ", doubleVar, doubleVarLoc);
        System.out.printf("Char: ", charVar, charVarLoc);
        System.out.printf("Boolean: ", booleanVar, booleanVarLoc);

}

// P.S. при помощи именно таблицы не получилось, было совсем катастрофа