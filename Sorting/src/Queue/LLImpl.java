package Queue;

public class LLImpl {

}

class QueueLL {
	class LLQueue {
		int num;
		LLQueue next;

		public LLQueue(int num) {
			this.num = num;
			this.next = null;
		}
	}

	LLQueue front;
	LLQueue rear;
	int size;

	boolean isEmpty() {
		return front == null;
	}

	void enqueue(int num) {
		LLQueue node = new LLQueue(num);
		if (node == null)
			System.out.println("Queue is full.");
		else {
			if (front == null) {
				rear = node;
				front = node;
			} else {
				rear.next = node;
				rear = node;
			}
			size++;
		}

	}

	int peek() {
		if (front == null)
			return -1;
		return front.num;
	}

	void dequeue() {
		if (isEmpty())
			System.out.println("Queue is empty.");
		else {
			front = front.next;
			size--;
		}
	}
}
