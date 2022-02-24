package com.javacollections_Queue;
//queue program using methods add(), remove(),poll(), element(), peek(), size()
import java.util.*;
public class QueueExample
{

	public static void main(String[] args) 
	{
		//queue is an interface which cannot be created so we created Linked list as its instance and assigned it to queue
		Queue<String> q= new LinkedList<String>();	
		System.out.println("Created queue which follows FIFO order: "+q);
		System.out.println();
		
		//adding elements to queue using add()
		q.add("jane");
		q.add("philips");
		q.add("john");
		q.add("may");
		q.add("jim");
		//q.add(3,"jin");	//cannot add value using index
		System.out.println("Elements in queue are: "+q+" size= "+q.size());
		System.out.println();
		
		// to remove element from queue using remove()
		System.out.println("removed first element jane: "+q.remove());
		System.out.println("elements are: "+q);
		System.out.println();
		
		//to return head of the queue using element()
		System.out.println("head of queue is: "+q.element());
		System.out.println();
		
		/*to remove element using poll() , it is similar to remove() method 
		 * only difference is it returns null when queue is empty
		 */
		System.out.println("removing first element from :"+q.poll()); //cannot provide index value
		System.out.println("removing another element: "+q.poll());
		System.out.println("removing element: "+q.poll()+","+q.poll());
		System.out.println("elements are: "+q);
		//returns null when queue is empty
		System.out.println("remove element: "+q.poll());  //cannot use remove() , throws exception
		
		q.add("bill");
		q.add("roy");
		q.add("chris");
		q.add(null);	//can add null values also
		System.out.println("added new element: "+q);
		System.out.println();
		
		//to return head of queue using peek() which is similar to element() method
		System.out.println("head of queue: "+q.peek());
		
		//displaying elements again
		System.out.println("Element in Queue are: "+q);
		
		

	}

}
