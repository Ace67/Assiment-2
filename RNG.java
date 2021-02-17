import java.util.Scanner;

public class RNG {
	public static void main(String[] args) {
		int secretNumber;
		int guess;
		String choice;
		int low = 0;
		int high = 100;
		int j = 1;
		boolean again = false;
		int out = 1;

		secretNumber = (int) (Math.random() * 99 + 1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first guess: ");

		guess = sc.nextInt();
		if (guess == secretNumber)

			System.out.println("Congratulations, You guessed correctly");

		else if (guess < secretNumber) {
			System.out.println("Number of guesses is " + j);
			System.out.println("Your guess is too low. Try again");
			low = guess;
		}

		else if (guess > secretNumber) {
			System.out.println("Number of guesses is " + j);
			System.out.println("Your guess is too high. Try again");
			high = guess;
		}

		do {
			if (guess != secretNumber) {
				j++;
				System.out.println("Enter your next guess between " + low + " and " + high);
				guess = sc.nextInt();
				if (guess == secretNumber) {
					System.out.println("Congratulations, You guessed correctly");
				} else if (guess < low || guess > high) {
					do {
						System.out.println("	> > > Guess must be between " + low + " and " + high + ". Try again");
						guess = sc.nextInt();
					} while (guess < low || guess > high);
				}
				if (guess < secretNumber) {
					System.out.println("Number of guesses is " + j);
					System.out.println("Your guess is too low ");
					low = guess;
				} else if (guess > secretNumber) {
					System.out.println("Number of guesses is " + j);
					System.out.println("Your guess is too high");
					high = guess;
				}
			}
		} while (guess != secretNumber);
		{

			System.out.println("Try again? (yes or no)");

			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextLine();
		}
		if (choice.equals("no") || choice.equals("No")) {
			System.out.println("Thanks for playing...");
		}

		while (choice.equals("Yes") || choice.equals("yes"));
	}
}
