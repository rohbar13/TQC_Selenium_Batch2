package array_class2;

public class Average {
	private static int x;

	public static void main(String[] args) {

		int temp = 0;
		int arr[] = { 67, 87, 46, 90, 59 ,58,100 };
		for (int x = 0; x < arr.length; x++) {

			temp = arr[x] + temp;

		}
		System.out.println(temp/arr.length);
	}

}
