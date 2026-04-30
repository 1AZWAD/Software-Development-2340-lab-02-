import java.util.Scanner;

public class Eight{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("enter the number of sections: ");
		int x = helper.nextInt();

		System.out.print("enter the number of students each section: ");
		int y = helper.nextInt();

		System.out.print("enter the number of students passed in the exam: ");
		int z = helper.nextInt();
		
		int totalStudents = x * y;
		float percentage = ((float) z / totalStudents) * 100;
		
		if(percentage > 50) {
			System.out.println("the percentage of studnets who passed is greater than 50%"); 
		} else{
			System.out.println("the percentage of students who passed is not greater than 50%");
		}
		helper.close();
	}
}
