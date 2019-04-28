package array_class2;

public class Array2 {
	public static void main(String[] args) {
		//Find the odd values
		int arr[] = {1,2,3,4,5,6,7,8,9,10,23,22,21,20,19,18,24,35,23,15};
		
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]%2);
			if(arr[x]/2==0) {
				System.out.println(arr[x]+" is even");
			}else {
				System.out.println(arr[x]+" is odd");
			}
		}
	}
}
