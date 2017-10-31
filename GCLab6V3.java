import java.util.Scanner;

public class GCLab6V3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String choice = "y";
		int i = 0;
		int length = 0;
		String userWord = " ";
		String vowels = "aeiou";
		// String consonant = " ";

		// this loop will only execute if my condition is true to begin
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Enter a word to be translated: ");
			// Scanner scan = new Scanner(System.in);
			userWord = userWord.toLowerCase();
			userWord = scan.nextLine();

			for (i = 0; i <= length; i++) {

				if (vowels.indexOf(Character.toLowerCase(userWord.charAt(0))) != -1) {
					userWord = (userWord + "way");
					System.out.println(userWord);
				}

				else {

					Boolean proceed = true;

					for (i = 0; i < userWord.length(); i++) {
						if (proceed) {
							if (vowels.contains(String.valueOf(userWord.charAt(i)))) {
								userWord = (userWord.substring(i) + (userWord.substring(0, i )) + "ay");
								// return;

								System.out.println(userWord);
								proceed = false;
							}
						}

					}

				}

			}
			System.out.println("Do you want to continue? y/n");
			choice = scan.nextLine();
		}
		System.out.println("Goodbye!");
		scan.close();
	}
}
