package mod4.csc320.csug;

import java.util.Scanner;

public class FloatingPointStats {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double inputNum = 0;  	//user input to be captured via Scanner
		double total = 0;		
		double max = 0;
		double min = Double.MAX_VALUE;	//min init. to highest Double value using a const. from java.lang core package
		
		System.out.println("Please enter 5 numbers to return their total,");		//user instructions
		System.out.println("average, max, min, and 20% interest on the total.");
		System.out.println();
		System.out.println("To enter fewer than 5 numbers or to quit, type \"done\"");
		
		int i = 0;
		while (i < 5) {							//iterates through each of the five values entered by user
			if (scanner.hasNextDouble()) {		//checks to ensure appropriate type number entered
				inputNum = scanner.nextDouble();//accepts user input
				total += inputNum;				//increments total with each additional input until final total
				if (inputNum < min) {			//compares each input to previous value of min
					min = inputNum;				//min holds final minimum value after 5 iterations
				}
				if (inputNum > max) {			//compares each input to previous value of max
					max = inputNum;				//max holds final maximum value after 5 iterations
				}
			++i;								//increments i before returning to the while condition
			}
			else {								//allows user to input "done" to quit the program with < 5 numbers,
				String done = scanner.next();	//otherwise program stalls waiting for input if < 5 numbers entered
				if (done.equalsIgnoreCase("done")) {
					break;
				}
				else {							//if invalid input, prompts user to finish inputing numbers or to type "done"
					System.out.println("Invalid input. Please enter \"done\" to quit or five total numbers.");
				}
			}
		}
		if (i == 0) {							//triggers if user immediately types "done" with no numbers entered
			System.out.println("No numbers were entered. Terminating program.");
		}
		else {
			System.out.println("                   total: " + total);		//prints total
			System.out.println("                 minimum: " + min);			//prints min
			System.out.println("                 maximum: " + max);			//prints max
			System.out.println("                 Average: " + total / i);	//prints average
			System.out.println("Interest on total at 20%: " + total * 0.2);	//prints 20% of total
		}
	}
}