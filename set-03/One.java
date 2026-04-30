import java.util.Scanner;

public class One{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the number A: ");
		int A = helper.nextInt();

		System.out.print("Enter the number C: ");
		int C = helper.nextInt();
		
		if((A+C) % 2 == 0){
			int B = (A + C) / 2;
			System.out.println("B exist and it is: " + B);
		} else{
			System.out.println("B doesn't exist as none of the conditions met");
		}
		helper.close();
	}
}
