import java.util.Scanner;

public class Eight{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the string: ");
		
		String str = helper.nextLine();

		int left = 0;
		int right = str.length() - 1;
		boolean pal = true;

		while(left < right){
			if(str.charAt(left) != str.charAt(right)){
				pal = false;
				break;
			}

			left++;
			right--;
		}

		System.out.println(pal ? "palindrome" : "not palindrome");
		helper.close();
	}
}
