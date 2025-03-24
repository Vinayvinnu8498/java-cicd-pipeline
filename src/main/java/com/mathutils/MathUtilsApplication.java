package com.mathutils;

public class MathUtilsApplication {
    public static void main(String[] args) {
        System.out.println("MathUtils application is running...");

        // Perform some calculations
        MathUtils mathUtils = new MathUtils();
        System.out.println("5 + 3 = " + mathUtils.add(5, 3));
        System.out.println("10 - 4 = " + mathUtils.subtract(10, 4));
        System.out.println("6 * 7 = " + mathUtils.multiply(6, 7));
        System.out.println("20 / 5 = " + mathUtils.divide(20, 5));
        System.out.println("Is 10 even? " + mathUtils.isEven(10));
        System.out.println("Factorial of 5 = " + mathUtils.factorial(5));

        // **Keep the application running to prevent Kubernetes from restarting it**
        try {
            while (true) {
                Thread.sleep(10000); // Keeps the application alive
            }
        } catch (InterruptedException e) {
            System.out.println("Application interrupted. Shutting down...");
        }
    }
}