package SortingGithub;

public class QuickSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = {8,2,9,0,1,4,-29,29,0,0,-2,-10,3};
		quicksort(arr,0,arr.length-1);
		for(int i:arr) System.out.print(i+" ");
	}

	private static void quicksort(int[] arr, int start, int end) {
		if (start >= end) return;
		int pivot = partition(arr,start,end);
		quicksort(arr,start,pivot-1);
		quicksort(arr,pivot+1,end);
	}

	private static int partition(int[] arr,int st,int end) {
		int letPivot = arr[st];
		int cnt = 0;
		for (int i = st+1; i <= end; i++) {
			if(arr[i] < letPivot) cnt++;
		}

		int pivotIndex = st+cnt;
		swap(arr,st,pivotIndex);

		int p = st, q = end;  // very important
		while (p < pivotIndex && q > pivotIndex) {
			while (p < pivotIndex && arr[p] < arr[pivotIndex]) p++;
			while (q > pivotIndex && arr[q] >= arr[pivotIndex]) q--;
			if(p<pivotIndex && q > pivotIndex)
			swap(arr,p,q);
			p++;
			q--;
		}
		return pivotIndex;
	}
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
