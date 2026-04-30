import java.util.Scanner;

public class Three{
	public static void main(){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter a number: ");
		
		int n = helper.nextInt();
		boolean isEven = true;
		
		if(n % 2 != 0){
			isEven = false;
		}

		System.out.println(isEven ? "Even" : "Odd");
		helper.close();
	}
}
