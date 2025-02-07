/**
 * Celsius to Fahrenheit conversion program.
 * Zayn Makki
 * 02/26/2024 
 * 
 * made edits to the code Tasnim Raisa
 */
import java.util.Scanner;

public class CtoF 
{
    public static void main(String[] args)
    {
        double celsius = input();
        double fahrenheit = convert(celsius);
        output(fahrenheit);
    }
    
    /**
     * Prompts the user to input a temperature in Celsius.
     * @return The inputted temperature in Celsius.
     */
    public static double input()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Please input the temperature in Celsius:%n");
            while (!sc.hasNextDouble()) {
                System.out.printf("Invalid input. Please input a numeric temperature in Celsius:%n");
                sc.next(); // discard invalid input
            }
            return sc.nextDouble();
        }
    }
    
    /**
     * Converts Celsius to Fahrenheit.
     * @param celsius The temperature in Celsius.
     * @return The temperature in Fahrenheit.
     */
    public static double convert(double celsius)
    {
        return (celsius * 9 / 5) + 32;
    }
    
    /**
     * Outputs the temperature in Fahrenheit.
     * @param fahrenheit The temperature in Fahrenheit.
     */
    public static void output(double fahrenheit)
    {
        System.out.printf("Fahrenheit Conversion: %.2f%n", fahrenheit);
    }
}