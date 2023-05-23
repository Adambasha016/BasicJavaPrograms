
public class MyDoubleyLinkedList {

	Node2 head;
	Node2 tail;                                     
	
	
	public void add(int ele) {
		Node2 temp=new Node2(ele);
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
	public void print() {
		Node2 cur=head;
		while(cur!=null) {
			System.out.print(cur.ele+"  ");
			cur=cur.next;
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		MyDoubleyLinkedList li=new MyDoubleyLinkedList();
		li.add(5);
		li.add(10);
		li.add(30);
		li.add(20);
		li.add(70);
		li.add(60);
		li.add(50);
		li.add(65);
		li.print();
	}
	
}
