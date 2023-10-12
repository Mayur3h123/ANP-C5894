package ExceptionHandling;

/*Lab 1:Queue Operations
Write a Java program that demonstrates the usage of a Queue (LinkedList):
Enqueue a series of elements.
Dequeue elements from the Queue.
Print the elements after each dequeue operation.*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
	
			Queue<Integer> q=new LinkedList<>();
			q.add(1);
			q.add(5);
			q.add(2);
			q.add(3);
			q.add(4);
			
			// Printing Values Of Queue
			System.out.println("Enqueue" + q);
			
			
			// Printing Values After Dequeuing
			q.remove(5);
			 System.out.println("Queue After Dequeuing: " + q);
				

			}
		}

	



