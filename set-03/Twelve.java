import java.util.Scanner;

public class Twelve{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the number of children: ");
		int n = helper.nextInt();

		System.out.print("enter the number of candies the iiucian already has: ");
		int x = helper.nextInt();
		
		int moreNeeded = (4 * n) - x;
		int totalPacketsToBuy = 0;
		
		if(moreNeeded > 0){
		 	totalPacketsToBuy = (int) Math.ceil((double) moreNeeded / 4);

			System.out.println("total packets he must buy is: " + totalPacketsToBuy);
		} else{
			System.out.println("no need to buy anymore packets, the iiucian has enough");
		}
		helper.close();
	}
}
