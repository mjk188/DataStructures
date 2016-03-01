class node{
	int data;
	node next;
	 public node(int data){
	 	this.data=data;
	 	next=null;
	 }
}

class circularList{
	node last=null;
	public void insert(int data){
		node temp=new node(data);

		if(last==null)
		 {  last=temp;
		 	last.next=last;}
		 else{
		 	node t=last.next;
		 	last.next=temp;
		 	temp.next=t;
		 	last=temp;
		 }			
	}
	public void print(){
		node head=last.next;

		while(head!=last)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
}

public class circularLinkedList{

	public static void main(String ar[])
	  {
	  		circularList cl=new circularList();
			cl.insert(4);
			cl.insert(5);
			cl.insert(1);
			cl.insert(10);
			cl.insert(0);
			cl.insert(-1);
			cl.print();	  		

	  }
}