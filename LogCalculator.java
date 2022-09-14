/*
* This program calculates the number of logs that a truck can carry
 *   depending on the user's log's length.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-09-13
*/

import java.util.Scanner;

/**
 * This program calculates how much
 * a truck can carry based on user length input.
*/

final class LogCalculator {
    /**
     * Constant assigned to value 20.
    */
    public static final double DENSITY = 20;
    /**
     * Constant assigned to value 1100.
    */
    public static final double MAX = 1100;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private LogCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // input
        final Scanner myObj = new Scanner(System.in);
        System.out.println("Enter log length (0.25 m, 0.5 m, or 1.0 m): ");
        // process & output
        final float length = myObj.nextFloat();
        System.out.println("\nThe truck can hold up to this number of logs: "
            + MAX / (DENSITY * length));
        System.out.println("\nDone.");
    }

}

