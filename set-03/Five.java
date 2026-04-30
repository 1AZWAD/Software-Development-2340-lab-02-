import java.util.Scanner;

public class Five{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter 3 numbers (seperated by space): ");
		int a = helper.nextInt();
		int b = helper.nextInt();
		int c = helper.nextInt();
		
		float avg = ((float) a + b) / 2;

		if(avg > c){
			System.out.println("average of A and B is greater than C");
		} else{
			System.out.println("average of A and B is not greater than C");
		}
		helper.close();
	}
}
