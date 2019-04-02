package Searching;

public class LinearSearch {
	public static void main(String args[]) {
		int arr[] = new int[7];
		arr[0] = 7;
		arr[1] = 31;
		arr[2] = 48;
		arr[3] = 36;
		arr[4] = 71;
		arr[5] = 3;
		arr[6] = 5;
		System.out.println(search(arr, 48));
	}

	public static int search(int arr[], int search) {
		int length = arr.length;
		for (int i = 0; i < length; i++)
			if (search == arr[i])
				return i;
		return -1;
	}
}
