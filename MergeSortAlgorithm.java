package SortingGithub;

public class MergeSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = {8,2,9,0,1,4,0,0,-2,-10,3};
		mergeSort(arr,0,arr.length-1);
		for(int i:arr) System.out.print(i+" ");
	}
	private static void mergeSort(int[] arr,int left, int right) {
		if(left >= right) return;
		int mid = (left+right)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	private static void merge(int[] arr,int left, int mid, int right) {
		int[] leftArray = new int[mid-left+1];
		int[] rightArray = new int[right-mid];

		for(int i = 0; i < mid-left+1; i++) {
			leftArray[i] = arr[left+i];
		}
		for(int i = 0; i < right-mid; i++) {
			rightArray[i] = arr[mid+1+i];
		}

		int p = 0, q = 0;
		int k = left; // very important
		while (p < leftArray.length && q < rightArray.length) {
			if (leftArray[p] < rightArray[q]) arr[k++] = leftArray[p++];
			else arr[k++] = rightArray[q++];
		}
		while (p < leftArray.length)
			arr[k++] = leftArray[p++];
		while (q < rightArray.length)
			arr[k++] = rightArray[q++];
	}
}
