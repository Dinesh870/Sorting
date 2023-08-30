package SortingGithub;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		int[] arr = {8,2,9,0,-21,4,20,0,-2,-10,3};
		int[] ans = insertionSort(arr);
		for(int i:ans) System.out.print(i+" ");
	}

	private static int[] insertionSort(int[] arr) {

		for(int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j-1]) {
				swap(arr,j,j-1);
				j--;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[j-1];
		arr[j-1] = temp;
	}
}
