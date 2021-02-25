import java.util.Scanner; // Import the Scanner class

public class AnagramsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in); // Create a Scanner object
		System.out.println("1er mot");

		String first_word = inp.nextLine(); // Read user input

		System.out.println("2e mot");

		String second_word = inp.nextLine(); // Read user input

		Anagrams.isAnagram(first_word, second_word);

		if (Anagrams.isAnagram(first_word, second_word))

		{
			System.out.println(first_word + " et " + second_word + " sont des annagrammes ");
		} else {
			System.out.println(first_word + " et " + second_word + " ne sont pas des annagrammes");
		}
	}

}
