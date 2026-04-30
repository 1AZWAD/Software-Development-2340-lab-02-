import java.util.Scanner;

public class Fifteen{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the desired temperatures by Alice, Bob and Charlie: ");

		int A = helper.nextInt();
		int B = helper.nextInt();
		int C = helper.nextInt();

		int highestMinReq = Math.max(A,C);

		if(highestMinReq <= B){
			System.out.println("They all can agree on the same temperature");
		} else{
			System.out.println("They all can't agree on the same temperature");
		}
		helper.close();
	}
}
