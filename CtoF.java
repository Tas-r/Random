/**
 * Celsius to Fahrenheit conversion program.
 * Zayn Makki
 * 02/26/2024
 */
import java.util.Scanner;
public class CtoF 
{
	public static void main(String[] args)
	{
		double c, f;
		
		c = input();
		f = convert(c);
		output(f);
	}
	
	public static double input()
	{
		Scanner sc = new Scanner(System.in);
		double celInput;
		
		System.out.printf("Please input the temperatre in Celsius:%n");
		celInput = sc.nextDouble();
		sc.close();
		
		return celInput;
	}
	
	public static double convert(double celInput)
	{
		double fahrenheit;
		
		fahrenheit = ((celInput * 9) / 5) + 32;
		
		return fahrenheit;
	}
	
	public static void output(double fahrenheit)
	{
		System.out.printf("Fahrenheit Conversion: %.2f%n", fahrenheit);
		
	}
}
