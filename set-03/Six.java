import java.util.Scanner;

public class Six{
	public static void main(String[] args) {
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the number of friends: ");
		int n = helper.nextInt();

		System.out.print("enter the cost per subscription: ");
		int x = helper.nextInt();
		
		float totalSubs = (float) n / 6; 
		int totalCost = (int) Math.ceil(totalSubs) * x;
		
		System.out.println("Total Cost of Subscription: " + totalCost);

		helper.close();
	}
}
