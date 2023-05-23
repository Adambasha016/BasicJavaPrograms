 package org.practice.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {
public static void main(String[] args) {
	ArrayList ab=new ArrayList<>();
	ArrayList as=new ArrayList<>();
	LinkedList l1=new LinkedList<>();
	ab.add("hello");
	ab.add(true);
	ab.add('a');
	ab.add(26);
	ab.add("marathahalli");
    System.out.println(ab);
    ab.add(2,"hi");
    System.out.println(ab);
    System.out.println(ab.get(2));
    System.out.println(ab.isEmpty());
    System.out.println(as.isEmpty());
    System.out.println(ab.size());
    System.out.println(ab.set(5, "mejectic"));
    System.out.println(ab);
    System.out.println(as.addAll(ab));
    System.out.println(as);
    l1.add("java");
    l1.add("python");
    l1.add('a');
    l1.add(211);
    l1.add(true);
    l1.add(33.33);
    System.out.println(l1);
    System.out.println(l1.addAll(4, as));
    System.out.println(l1);
    ab.clear();
    System.out.println(ab);
}

}
