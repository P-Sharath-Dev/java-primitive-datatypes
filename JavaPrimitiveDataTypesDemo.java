package PrimitiveDatatypesDemo;
/**
 * This class demonstrates the usage of primitive data types in Java, 
 * including float, double, char, and integer types.
 */
public class JavaPrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Demonstrating floating-point numbers
        float avg = 49.3f; // Low precision (approximation)
        float avgScore = 324.5888344f; // Low precision (requires 'f')
        double avgScore2 = 345.556433434987789; // High precision

        System.out.println("Float example (avg): " + avg);
        System.out.println("Float example (avgScore): " + avgScore);
        System.out.println("Double example (avgScore2): " + avgScore2);

        // Demonstrating character type
        int character = 'q'; // Converts 'q' to its ASCII value (113)
        System.out.println("ASCII value of 'q': " + character);

        char c = 'q' + 1; // 'q' (113) + 1 = 114, which corresponds to 'r'
        System.out.println("Character after 'q': " + c);

        // Demonstrating integer types
        byte byteVal = 127; // Range: -128 to 127
        short shortVal = 32767; // Range: -32,768 to 32,767
        int intVal = 2147483647; // Range: -2^31 to 2^31-1
        long longVal = 9223372036854775807L; // Range: -2^63 to 2^63-1 (requires 'L')

        System.out.println("Byte value: " + byteVal);
        System.out.println("Short value: " + shortVal);
        System.out.println("Int value: " + intVal);
        System.out.println("Long value: " + longVal);

        //boolean
        boolean isEligible = true;
        System.out.println("boolean example (isEligible): " + isEligible);
    }
}
