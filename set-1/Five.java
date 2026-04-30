import java.util.Scanner;

public class Five{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.println("*** The vermo calculator v1 ***");

		float a = helper.nextFloat();
		char sign = helper.next().charAt(0);
		float b = helper.nextFloat();
		float result = 0;

		switch(sign){
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
		}

		System.out.println(result);
		helper.close();
	}
}
