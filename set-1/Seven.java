import java.util.Scanner;

public class Seven{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the table number: ");
		int n = helper.nextInt();

		for(int i = 1; i <= 10; i++){
			System.out.println(n + " * " + i + " = " + (n * i));
				
		}
		helper.close();
	}
}
