import java.util.Scanner;

public class Ten{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the string: ");

		String str = helper.nextLine();

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		helper.close();
	}
}
