
public class SingleLinkedList {
	private Node1 head;
	public void add( int e) {
		Node1 temp=new Node1(e);
		if(head==null) {
			head=temp;
			
		}
		else {
			Node1 cur=head;
			while(cur.next!=null) {
				cur=cur.next;
			
			}
			cur.next=temp;
		}
	}
	//*****************************************************/
	public void print() {
		Node1 cur=head;
		while(cur!=null) {
			System.out.print(cur.ele+" ");
			cur=cur.next;
		}
		System.out.println();
	}
	//*****************************************************//
	public void addFirst(int ele) {
		Node1 temp= new Node1(ele);
		if(head==null) {
			head=temp;
		}
		else {
			    temp.next=head;
			    head=temp;
		}
	}
	//finding lenth of an liked list
	//*************************************************//
	public int findLength() {
	Node1 temp=head;
	int count=0;
	while(temp!=null) {
		temp=temp.next;
		count++;
	}
	return count;
	}
	//******************************************************//
	
	public int fineMidEle() {
		Node1 slow=head;
		Node1 fast=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.ele;
	} 
	//**********************************************************//
	public int findKthNodeFromEndOfLinkedList(int key) {
		Node1 slow =head;
		Node1 fast=head;
		int count=1;
		while(count<=key) {
			fast=fast.next;
			count++;
		}
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.ele;
	}
	//************************************************************//
	public Node1 reverse() {
		Node1 prev=null;
		Node1 cur=head;
		while(cur!=null) {
			Node1 next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
					
		}
		head=prev;
		return head;
	}
	
	
	//*********************************************//
	
	public void removieFirst() {
		if(head==null) {
			System.out.println(" no node present enty");
		}
		else if (head.next==null) {
			head=null;
		}
		else if(head.next!=null) {
			Node1 cur=head;
			head=head.next;
			cur.next=null;
		}
		
		
	}
	//********************************************//
	public void removieLast() {
		if(head==null) {
			System.out.println("no node prresent");
		}
		else if(head.next==null) {
			head=null;
		}
		else if(head.next!=null) {
			Node1 cur=head;
			while(cur.next.next!=null) {
				cur=cur.next;
			}
			cur.next=null;
			
		}
	}
	//*************************************************//
	public void addAtIndex(int index,int ele) {
		if(index==0) {
			addFirst(ele);
		}
		else {
			Node1 temp=new Node1(ele);
			int count=1;
			Node1 cur=head;
			while(count<index-1) {
				cur=cur.next;
				count++;
			}
			temp.next=cur.next;
			cur.next=temp;
		}
	}
	//*************************************** consider starting index of linked list should be 1 
	public int findLastElementOfanRepetedElement(int ele) {
		Node1 cur=head;
		int count=1;
		int index=-1;
		while(cur!=null) {
			if(cur.ele==ele) {
				index=count;
			}
			cur=cur.next;
			count++;
		}
		return index;
	}
	//*************************************************
	public void addAll(int[]a) {
		for(int ele:a) {
			add(ele);
		}
	}
	public static void main(String[] args) {
		SingleLinkedList ls=new SingleLinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30); 
		ls.add(40);
		ls.add(50);
		ls.add(60);
		ls.add(70);
		ls.add(55);
		ls.add(80);
		ls.add(90);
		ls.add(85);
		ls.add(4);
		ls.print();
		System.out.println(ls.findLength()+"  total length");
		System.out.println(ls.fineMidEle()+"  mid ele");
		System.out.println(ls.findKthNodeFromEndOfLinkedList(4)+" 4 ");
		ls.reverse();
		ls.print();
		System.out.println();
		ls.removieFirst();
		System.out.println("removie first node");
		ls.print();
		System.out.println("removive last node");
		ls.removieLast();
		ls.print();
		ls.addAtIndex(4, 30);
		System.out.println(" adding at index");
		ls.print();
		System.out.println(" second repeted element");
		System.out.println(ls.findLastElementOfanRepetedElement(30));
	}
	
	
	
	

}
