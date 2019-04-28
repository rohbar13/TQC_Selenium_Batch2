package array_class2;

public class Array3 {
	public static void main(String[] args) {
		//Find the number which can completely be divided by 5
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,85,47,59,65,35};
		for(int x=0;x<arr.length;x++) {
			System.out.println(arr[x]%5);
			if(arr[x]%5==0) {
				System.out.println(arr[x]+" is divided by 5");
			}
			}
		


	}
}
