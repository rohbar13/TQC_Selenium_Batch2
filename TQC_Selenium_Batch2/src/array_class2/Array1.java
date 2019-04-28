package array_class2;

public class Array1 {

	public static void main(String[] args) {
		//To find the duplicate values
		int arr[] = {2,5,8,2,9,10,34,3,4,8};
		
		for(int x=0;x<arr.length-1;x++)
		{
			//System.out.println(arr[x]+" ");
			for(int y=x+1;y<arr.length;y++)
			{
				//System.out.print(arr[y]+" ");
				if(arr[x]==arr[y]) {
					System.out.println("More than one occurence : "+arr[x]);
				}
			}
			//System.out.println();
		}
		
		
		
		
		
		/*
		 * int val1 = arr[0]; //5-8, ....... 4-8
		 * 
		 * for(int x=0;x<9;x++) { for(int y=x+1;y<10;y++) { if(arr[x]==arr[y]) {
		 * System.out.println("More than one occurence for "+arr[x]); } } }
		 */
		

	}
}
