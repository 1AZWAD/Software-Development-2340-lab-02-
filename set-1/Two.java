import java.util.Scanner;

public class Two{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Your Name: ");
		String name = helper.nextLine();

		System.out.println("Hello, " + name);
		helper.close();
	}
}
