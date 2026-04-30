import java.util.Scanner;

public class Four{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter 3 numbers (seperated by space): ");
		int a = helper.nextInt();
		int b = helper.nextInt();
		int c = helper.nextInt();

		if(a == b){
			System.out.println("c occurs once");
		} else if(a == c){
			System.out.println("b occurs once");
		} else{
			System.out.println("a occurs once");
		}
		helper.close();
	}
}
