package array;

public class SmallestValue {
	public static void main(String[] args) {
		int arr[] = { 97, 45, 2, 67, 10 };
		int smallest = arr[0];
		
		for (int x = 0; x < arr.length-1; x++) 
		{
			System.out.println(smallest + " < "+arr[x+1]);
			if (smallest > arr[x + 1]) 
			{
				smallest = arr[x + 1];
			}
		}
		
		System.out.println(smallest);
	}
}
