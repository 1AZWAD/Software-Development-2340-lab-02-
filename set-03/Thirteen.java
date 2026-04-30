import java.util.Scanner;

public class Thirteen{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the three prepared topic A,B,C: ");
		int A = helper.nextInt();
		int B = helper.nextInt();
		int C = helper.nextInt();

		System.out.print("enter the topic number assigned on the contest day: ");

		int x = helper.nextInt();

		if(x == A || x == B || x == C){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
		helper.close();

	}
}
