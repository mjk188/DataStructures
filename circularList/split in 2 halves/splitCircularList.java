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

	public node getMid(){
		node slow=last,fast=last;

		fast=fast.next;
		slow=slow.next;
		if(fast!=last) fast=fast.next;


		  while(fast!=last)
		  	{
		  		slow=slow.next;
		  		fast=fast.next;
		  			if(fast!=last) fast=fast.next;

		  	}
		  		return slow;
		  
	}
	public void print_node(node lasty){
		node head=lasty.next;

		while(head!=lasty)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.print(head.data);
		System.out.println();
	}
}


public class splitCircularList{

	public static void main(String ar[])
	  {     
	  		node last1,last2;
	  		circularList cl=new circularList();
			cl.insert(4);
			cl.insert(5);
			cl.insert(1);
			cl.insert(10);
			cl.insert(0);
			cl.insert(-1);
			cl.print();	  
			node mid=cl.getMid();
			System.out.println(mid.data);

			last2=cl.last;
			last1=mid;
			node temp=last1.next;
			last1.next=last2.next;
			last2.next=temp;

			cl.print_node(last1);
			cl.print_node(last2);
			


	  }
}