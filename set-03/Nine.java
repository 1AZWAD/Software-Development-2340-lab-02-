import java.util.Scanner;

public class Nine{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("how many hours you work each day: ");
		int x = helper.nextInt();

		System.out.print("how many hours you work in wednesday, it's a chill day: ");
		int y = helper.nextInt();


		int totalHours = (x * 4) + y;

		System.out.println("total number of working hours per week: " + totalHours);
		helper.close();
	}
}
