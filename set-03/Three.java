import java.util.Scanner;

public class Three{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("type out the word in your mind: ");
		String word = helper.next();

		String firstChar = word.substring(0,1).toUpperCase();
		String splittedWord = word.substring(1);
		String finalString = firstChar + splittedWord;

		System.out.println("Capitalized word is " + finalString);
		helper.close();
	}
}
