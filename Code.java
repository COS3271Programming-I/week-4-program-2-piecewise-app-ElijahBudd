package Programs;

import java.util.Scanner;

public class Piecewise_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter a number for x: ");
		Double x = userinput.nextDouble();
		
		double result;
		
		if (x < 0) {
			result = 3 * x + 7;
		}
		else if (0 <= x && x <= 10) {
			result = x * x + 8;
		}
		else {
			result = x * x * x - 6 * x * x;
		}
		
		System.out.println("Formula of x result: " + result);
		
	}
}
