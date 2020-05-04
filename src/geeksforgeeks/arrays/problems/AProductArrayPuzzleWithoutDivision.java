package geeksforgeeks.arrays.problems;

public class AProductArrayPuzzleWithoutDivision {
	public static void main(String asfd[]) {
		ProductArray pa = new ProductArray();
		int arr[] = { 10, 3, 5, 6, 2 };
		pa.printArray(arr, arr.length);
	}
}

class ProductArray {
	void printArray(int arr[], int n) {
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];
		left[0] = 1;
		right[n - 1] = 1;
		// constructing the left array
		for (int i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];
		// constructing the right array
		for (int i = n - 2; i >= 0; i--)
			right[i] = right[i + 1] * arr[i + 1];

		// constructing the prod array with left and right array

		for (int i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		// printing the prod array
		for (int i = 0; i < n; i++)
			System.out.println(prod[i] + " ");
		return;
	}
}
