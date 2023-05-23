 package org.practice.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Demo2 {
	public static void main(String[] args) {
		Queue<Object> q=new LinkedList();
		q.add(10);
		q.add("bye");
		q.add('Q');
		q.add(26.66);
		q.add(true);
		q.add("balayya");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q);
		q.clear();
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.peek());
		try {
			System.out.println(q.remove());
		}catch(NoSuchElementException e) {
			System.out.println("queu is emty");
		}
		System.out.println(q.element());
		}
}