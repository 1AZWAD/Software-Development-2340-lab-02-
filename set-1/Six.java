import java.util.Scanner;

public class Six{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the number: ");

		int n = helper.nextInt();

		for(int i=1; i <= n; i++){
			System.out.println(i);
		}
		helper.close();
	}
}
