package array;

public class Array2D {
	public static void main(String[] args) {
		
		int arr[][]= new int[3][5];

		int val = 10;
		
		for(int v = 0;v<3;v++)
		{
			for(int x=0;x<5;x++) {
				arr[v][x] = val;
				val = val + 10;
			}
		}
		
		for(int o=0;o<3;o++)
		{
			for(int x=0;x<5;x++) {
				System.out.print(arr[o][x]+" ");
			}
			System.out.println();
		}
	}
}
