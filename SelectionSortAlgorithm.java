package SortingGithub;

public class SelectionSortAlgorithm {
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	private static int[] selectionSort(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			int min = i;
			for(int j = i; j < arr.length; j++) {
				if (i != j && arr[j] < arr[min])
					min = j;
			}
			swap(arr,i,min);
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {8,2,9,0,1,4,0,0,-2,-10,3};
		int[] ans = selectionSort(arr);
		for(int i:ans) System.out.print(i+" ");
	}
}
