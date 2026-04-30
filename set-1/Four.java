import java.util.Scanner;

public class Four{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter three numbers (seperated by space): ");
		
		int a = helper.nextInt();
		int b = helper.nextInt();
		int c = helper.nextInt();

		System.out.println("The largest number between " + a + ", " + b + " and " + c + " is: " + Math.max(a,Math.max(b,c)));
		helper.close();    
	}
}
