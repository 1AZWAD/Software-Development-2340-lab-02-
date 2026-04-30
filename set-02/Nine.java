import java.util.Scanner;

public class Nine{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter your string: ");
		String str = helper.nextLine();

		int vowels = 0;
		int consonants = 0;

		for(int i = 0; i < str.length(); i++){
			char tmp = str.charAt(i);
			char ch = Character.toLowerCase(tmp);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels++;
			}else{
				consonants++;
			}
		}

		System.out.println("vowels: " + vowels);
		System.out.println("consonants: " + consonants);
		helper.close();

	}
}
