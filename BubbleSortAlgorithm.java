package SortingGithub;

public class BubbleSortAlgorithm {
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	private static int[] bubbleSort(int[] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(i != j && num[j] > num[i])
					swap(num,i,j);
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int[] arr = {8,2,9,0,1,4};
		int[] ans = bubbleSort(arr);
		for(int i:ans) System.out.print(i+" ");
	}
}
