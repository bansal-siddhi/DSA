package Questions;

public class Practice {
	public static void main(String[] args) {
		int n = 5;
//		int[] arr = new int[n + 1];
		int prev2 = 0;
		int prev = 1;
		System.out.println(prev2);
		System.out.println(prev);
		for (int i = 2; i <= n; i++) {
			int curr = prev2 + prev;
			System.out.println(curr);
			prev2 = prev;
			prev = curr;
		}
//		Arrays.fill(arr, -1);
//		System.out.println(fib(n, arr));
//		for (int i : arr)
//			System.out.println(i);
	}

	private static int fib(int n, int[] arr) {
		if (n <= 1) {
			arr[n] = n;
			return n;
		}
		if (arr[n] != -1)
			return arr[n];
		return arr[n] = fib(n - 1, arr) + fib(n - 2, arr);
	}
}
