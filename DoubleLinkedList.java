
public class DoubleLinkedList {
      Node3 head;
      Node3 tail;

//***********************************************
public void addAtDoubleLikedList(int ele) {
	Node3 temp=new Node3(ele);
	if(head==null) {
		head=temp;
		tail=temp;
	}
	else {
		tail.next=temp;
		temp.pre=tail;
		tail=temp;
	}
}
//***********************************************
public void printDoubleLinkedList() {
	Node3 cur=head;

	if(cur!=null) {
		System.out.println(cur.ele+"  ");
		cur=cur.next;
	}
	System.out.println();
}
public static void main(String[] args) {
	DoubleLinkedList lt=new DoubleLinkedList();
	lt.addAtDoubleLikedList(5);
	lt.addAtDoubleLikedList(10);
	lt.addAtDoubleLikedList(20);
	lt.addAtDoubleLikedList(20);
	lt.addAtDoubleLikedList(30);
	lt.addAtDoubleLikedList(40);
	lt.addAtDoubleLikedList(50);
	lt.addAtDoubleLikedList(60);
	lt.addAtDoubleLikedList(70);
	lt.printDoubleLinkedList();
	
	
	try {
		lt.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
