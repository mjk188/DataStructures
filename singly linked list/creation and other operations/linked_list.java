//package linked_list_codes;
import java.util.*;
class Node{

	int data;

	Node next;

	public Node(int data){
		  this.data=data;
		  next=null;

	}
}

public class linked_list{

	Node head=null;
	int count=0;
	//Node previous=null;
	Node previous1=null,previous2=null;

	 public  void insert(int data){
	 	Node temp;
	 	Node node=new Node(data);							// insert a node at the end

	 	   if(head==null)
	 	   	    head=node;
	 	   	  
	 	   	     else{
	 	   	     		temp=head;
	 	   	     		while(temp.next!=null) 
	 	   	     			temp=temp.next;	 	   	   

	 	   	     			temp.next=node;
	 	   	     	 }
	 	   	   count++;  	 
	    }

	    public void push(int data){

	    		Node temp=new Node(data);
	    		if(head==null)
	    			head=temp;
	    		else{
	    		temp.next=head;
	    		head=temp;
				}

				count++;
	    }
	    public  void print(){
	    		Node temp=head;
	    		while(temp!=null)
	    			{System.out.print(temp.data+" ");
	    		    temp=temp.next;
	    		    }

	    		    System.out.println();



	    }  
	    public void delete_data(int data){
	    		int flag=0;
	    	Node temp=head;
	    	  if(head==null)
	    	  	return ;
     		  if(head.data==data)
     		  		{head=head.next;
     		  			count--;
     		  			return;}

	    		while(temp.next!=null && temp.next.data!=data  )
	    				temp=temp.next;
	    
	       if(temp.next==null)
	       	System.out.println("no match");
	       else{
	       	Node t=temp.next;
	       	temp.next=temp.next.next;
	         t.next=null;
	         count--;
	       }
	    }
	    public void delete_position(int pos){
	    int t=0;
	    	if(pos==0)
	    		{head=head.next;
	    			count--;
	    	   return;}
	    	   else{
	    	   		if(pos > count-1)
	    	   		{
	    	   			System.out.println("no position");
	    	   			return;
	    	   		}
	    	   	Node temp=head;
	    	   	while(t!=pos-1)
	    	   		t++;
	    	   	temp.next=temp.next.next;
	    	   	count--;

	    	   }

	    }
	    public int search1(Node x,int data,Node previous){
	    			if(x==null)
	    				 {
	    				 	System.out.println("Element not found");
	    				 	return -1;
	    				 }
	    			if(x.data==data)
	    			{System.out.println("Found ");
	    				previous1=previous;
	    				return 1;
	    	} 
	    	   
	    	   return search1(x.next,data,x);
	    	   
	    	   
	    }
	      public int search2(Node x,int data,Node previous){
	    			if(x==null)
	    				 {
	    				 	System.out.println("Element not found");
	    				 	return -1;
	    				 }
	    			if(x.data==data)
	    			{System.out.println("Found ");
	    				previous2=previous;
	    				return 1;
	    	} 
	    	   
	    	   return search2(x.next,data,x);
	    	   
	    	   
	    }

}

