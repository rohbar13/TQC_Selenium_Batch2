package array;

public class LargestValue {
	public static void main(String[] args) {
		int arr[] = { 97, 45, 2, 67, 10 };
		int largest = arr[0];
		
		for (int x = 0; x < arr.length-1; x++) 
		{
			System.out.println(largest + " < "+arr[x+1]);
			if (largest < arr[x + 1]) 
			{
				largest = arr[x + 1];
			}
		}
		
		System.out.println(largest);
	}
}
