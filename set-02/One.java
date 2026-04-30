import java.util.ArrayList;
import java.util.Scanner;

public class One{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);		
		
		ArrayList<Integer> nums = new ArrayList<>();
		int n = 5;

		while( n >= 1 ) {
			int num = helper.nextInt();
			nums.add(num);
			n--;
		}

		for(Integer num : nums){
			System.out.print(num + ", ");
		}
		helper.close();
	}
}
