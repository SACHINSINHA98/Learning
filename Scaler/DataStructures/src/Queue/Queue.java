package Queue;

public class Queue {
	int[] arr = new int[5];
	int top = -1;

	public void Enqueue(int data) {
		if (this.top == -1) {
			this.arr[0] = data;
			this.top++;
		} else {
			if (this.top != arr.length - 1) {
				for (int i = this.top; i >= 0; i--) {
					this.arr[i + 1] = this.arr[i];
				}
				this.arr[0] = data;
				this.top++;

			} else {
				System.out.println("Queue is full");
			}
		}

	}

	public void dequeue() {
		
		if(this.top==-1) {
			System.out.println("queue is empty");
		}else {
			this.top--;
		}
	}

	public void printQueue() {
		 
			for (int i = top; i >= 0; i--) {
				System.out.print(this.arr[i] + " ");
			}
		
	}
}
