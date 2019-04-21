package array;

public class Array2D_1 {
	public static void main(String[] args) {
		
		int arr[][]= {{1,2},{1,3},{4,3}};
		
		for(int o=0;o<3;o++)
		{
			for(int x=0;x<2;x++) {
				System.out.print(arr[o][x]+" ");
			}
			System.out.println();
		}
	}
}
