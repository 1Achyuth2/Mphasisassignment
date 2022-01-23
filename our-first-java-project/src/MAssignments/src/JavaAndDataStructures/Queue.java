package JavaAndDataStructures;

import java.util.PriorityQueue;

public class Queue {
		public static void main(String[] args) 
		{
		        	    PriorityQueue<String> q = new PriorityQueue();
		        		q.add("achyuth");
		        		q.add("vamsi");
		        		q.add("rohit");
		        		q.add("yuvaraj");
		        		q.add("navaj");
		                System.out.println(q);
		        		System.out.println(q.peek());
		        		q.remove();
		        		System.out.println( q);
		        		System.out.println(q.size());
		}
}
