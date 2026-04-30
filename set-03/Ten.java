import java.util.Scanner;

public class Ten{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the status of B1, B2, B3, 0 means empty, 1 means full: ");
		int B1 = helper.nextInt();
		int B2 = helper.nextInt();
		int B3 = helper.nextInt();

		if(B1+B2 == 0){
			System.out.println("Water filling time");
		} else if(B2+B3 == 0){
			System.out.println("Water filling time");
		} else if(B1+B3 == 0){
			System.out.println("Water filling time");
		} else {
			System.out.println("Not now");
		}
		helper.close();
	}
}
