package SortingGithub;

public class CountSortAlgorithm {
	public static void main(String[] args) {
		int[] arr = {8,2,9,0,1,4,29,0,0,10,3};
		countSort(arr);
		//for(int i:arr) System.out.print(i+" ");
	}
	private static void countSort(int[] arr) {
		int n = arr.length;
		int[] freq = new int[findMax(arr)+1];
		for (int i: arr) {
			freq[i]++;
		}

		// finding prefix sum of array
		for (int i = 1; i < freq.length; i++) {
			freq[i] += freq[i-1];
		}

		int[] ans = new int[n];
		for (int i = n-1; i >= 0; i--) {
			int idx = freq[arr[i]] - 1;
			ans[idx] = arr[i];
			freq[arr[i]]--;
		}

		System.arraycopy(ans, 0, arr, 0, n);
		for(int i: arr) System.out.print(i+" ");
	}
	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			max = Math.max(max,i);
		}
		return max;
	}
}
