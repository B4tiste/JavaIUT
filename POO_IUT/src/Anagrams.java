import java.util.Arrays;

public class Anagrams {

	public static boolean isAnagram(String firstWord, String secondWord) {

		// int n = 0;

		String tl_firstWord = firstWord.toLowerCase();
		String tl_secondWord = secondWord.toLowerCase();

		char[] char_firstdWord = tl_firstWord.toCharArray();
		char[] char_secondWord = tl_secondWord.toCharArray();

		Arrays.sort(char_firstdWord);
		Arrays.sort(char_secondWord);

		return Arrays.equals(char_firstdWord, char_secondWord);

		/*
		 * for (int i = 0; i < char_secondWord.length; i++) {
		 * 
		 * if(char_firstdWord[i] == char_secondWord[i]) { n = 1; } else { n = 0; } }
		 * 
		 * if(n == 1) { return true; } else { return false; }
		 */

	}

}
