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
		 	node head=last.next;
		 	if(head.data > temp.data)
		 		{last.next=temp;
		 			 temp.next=head;
		 			}
		 	else{		
		 		while(head.next.data <= temp.data && head.next!=last) head=head.next;
		 		  if(head.next!=last){
		 		  	temp.next=head.next;
		 		  	head.next=temp;
		 		  }
		 		  else{
		 		  	if(last.data>=temp.data) {
		 		  		temp.next=last;
		 		  		head.next=temp;
		 		  	}
		 		  	else
		 		  	{
		 		  		temp.next=last.next;
		 		  		last.next=temp;
		 		  		last=last.next;
		 		  	}
		 		  }
		 	
			 }		
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


public class sortedInsertCircularList{

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
			
	  }
}