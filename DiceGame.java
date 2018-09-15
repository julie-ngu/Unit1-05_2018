/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program generates a number from 1 to 6. The user must guess the number
 *     and until the user guesses correct, the game continues. The game tells 
 *     the user how many guesses they made until they got it right.
 *
 ****************************************************************************/

import java.util.Scanner;
import java.util.Random;

public class DiceGame {
	
	public static void main(String args[]) {
		
		//generates random number from 1 to 6
		Random ngenerate = new Random();
		int randNum = ngenerate.nextInt(6) + 1;
		
		int userGuess;
		int userTries = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("This is a game that generates a random number between 1 and 6. \n\nGuess what number the computer generated: ");
		
		do {
			userGuess = userInput.nextInt();
			userTries ++;
			
			if (userGuess == randNum) {
				System.out.print("Congratulations! You guessed right! It took you " + userTries + " try/tries.");
				System.exit(0);
			}
			else if (userGuess > 6 || userGuess < 1) {
				System.out.print("Invalid. Please try again and pick a number from 1 to 6: ");
			}
			else {
				System.out.print("Bzzt! Try again (you have tried " + userTries + " time(s)): ");
			}
			
		} while (true);
	}

}