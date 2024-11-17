package Queue;

public class ArrImplementation {
	public static void main(String[] args) {

	}
}

class Queue {
	int start;
	int[] arr;
	int end;
	int size;
	int maxSize;

	void Queue() {
		int start = -1;
		int[] arr = new int[16];
		int end = -1;
		int size = 0;
	}

	void Queue(int maxSize) {
		int start = -1;
		int[] arr = new int[maxSize];
		int end = -1;
		int size = 0;
		this.maxSize = maxSize;
	}

	void push(int num) {
		if (size == maxSize) {
			System.out.println("Queue is full. Please delete an element.");
			System.exit(1);
		}
		if (end == -1) {
			start = 0;
			end = 0;
		} else {
			end = (end + 1) % maxSize;
		}
		arr[end] = num;
		size++;
	}

	int pop() {
		if (start != -1) {
			int x = arr[start];
			start++;
			size--;
			return x;
		}
		return start;
	}

	int size() {
		return size;
	}
}
