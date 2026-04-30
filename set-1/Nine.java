import java.util.Scanner;

public class Nine{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the number you want the sum of: ");
		int n = helper.nextInt();

		int sum = (n * (n + 1)) / 2;

		System.out.println("Sum of 1 to " + n + ": " + sum);
		helper.close();
	}
}
