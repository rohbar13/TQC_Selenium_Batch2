package array_class2;

public class Array4 {
	public static void main(String[] args) {
		// Find the missing value from 1-10
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		for (int x = 1; x <= 10; x++) {
			boolean found = false;
			for (int y = 0; y < arr.length; y++) {
				if (x == arr[y]) {
					found = true;
				}
			}
			if (found == false) {
				System.out.println("Value not found " + x);
			}
		}
	}
}
