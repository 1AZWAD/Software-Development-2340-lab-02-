public class Two{
	public static void main(String[] args){
		int n = 5;
		int[] arr = {6,1,3,2,8,4};
		int max = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("\nlargest number: " + max);
	}
}
