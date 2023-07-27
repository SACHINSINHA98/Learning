package Queue;

public class QueueIMPL {

	public static void main(String[] args) {
		Queue queue= new Queue();
		queue.Enqueue(10);
		
		/*
		 * queue.Enqueue(15); queue.Enqueue(8);
		 * 
		 * queue.Enqueue(9); queue.Enqueue(7);
		 */
		  queue.dequeue();
		  queue.dequeue();
		  queue.Enqueue(15);
		  queue.Enqueue(10);
		  queue.Enqueue(10);
		  queue.Enqueue(10);
		  queue.Enqueue(10);
		  queue.Enqueue(2);
		  queue.Enqueue(2);
		  queue.dequeue();
		  queue.printQueue();
		 
		
	}

}
