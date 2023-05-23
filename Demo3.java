package org.practice.collection;

import java.util.PriorityQueue;
import java.util.Queue;
class Student{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}

public class Demo3 {
public static void main(String[] args) {
	Queue<Student>  w=new PriorityQueue<Student>();
	w.add(new Student(100,"kathik", 89.78));
	w.add(new Student(101,"karuna", 85.67));
	w.add(new Student(102,"punith", 79.45));
	w.add(new Student(103,"mubarak", 83.95));
	w.add(new Student(104,"thaniya", 85.08));
	System.out.println(w);
}
}
