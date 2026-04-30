import java.util.Scanner;

public class Two{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("type out the word in your mind: ");
		String word = helper.next();

		if(word.length() > 10){
			char firstChar = word.charAt(0);
			char lastChar = word.charAt(word.length() - 1);
			int totalCharsInBet = word.length() - 2;

			String finalString = "" + firstChar + totalCharsInBet + lastChar;

			System.out.println("abbreviation: " + finalString);
		} else{
			System.out.println("Original word: " + word);
		}
		helper.close();
	}
}
