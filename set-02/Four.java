public class Four{
	public static void main(String[] args){
		int n = 5;
		int[] arr = {2,1,3,2,6};
		int sum = 0;

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			sum += arr[i];
		}

		float avg = (float) sum/n;
		
		System.out.println("\naverage of the array: " + avg);
	}
}
