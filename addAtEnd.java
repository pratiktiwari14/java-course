/* class node{
	 int data;
	 node next;
	 
	 public node(int x) {
		 data=x;
		 next=null;
	 }
 }*/
 
public class addAtEnd {
	
	public static void print(node head) {
		node temp=head;
		while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
		}	
	}	
	 public static node addEnd(node head,int x) {
		 node temp= new node(x);
		 
		 if (head==null) {	
			 System.out.println("empty list");
			 return temp;
		 }
		 node curr=head;
		
		 while(curr.next!=null) {
			 curr=curr.next;
		 }
		 curr.next=temp;
		 return head;
	 }
	public static void main(String[] args) {
		node head=null;
		print(head);
		
		 head=addEnd(head,50);   
		 
		 print(head);
	 addEnd(head,40);
		addEnd(head,30);
		  addEnd(head,20);
		  addEnd(head,10);
		 print(head);
		 
	}
}