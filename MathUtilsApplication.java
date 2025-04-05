package myapp;

public class MathUtilsApplication {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        System.out.println("MathUtils application is running...");
        System.out.println("5 + 3 = " + mathUtils.add(5, 3));
        System.out.println("10 - 4 = " + mathUtils.subtract(10, 4));
        System.out.println("6 * 7 = " + mathUtils.multiply(6, 7));
        System.out.println("20 / 5 = " + mathUtils.divide(20, 5));
        System.out.println("Is 10 even? " + mathUtils.isEven(10));
        System.out.println("Factorial of 5 = " + mathUtils.factorial(5));
    }
}