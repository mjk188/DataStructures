//package linked_list_codes;

import java.io.*;
import java.util.*;


public class test{
	
	public static void main(String ar[]){

		System.out.println("enter nums");
		Scanner s=new Scanner(System.in);

		linked_list x=new linked_list();

		x.insert(3);
		x.insert(4);
		x.insert(-10);
		x.print();

		x.push(2);
		x.push(-1);
		x.push(10);
		x.print();

		// x.delete_data(-10);
		// x.delete_data(10);
		// x.print();
		System.out.println(x.count+"\n");
		// x.delete_position(2);
		// x.delete_position(1);
		// x.print();

		int p1=x.search1(x.head,2,null);
		int p2=x.search2(x.head,3,null);

		if(p1==-1 || p2==-1 || x.previous1==x.previous2) System.out.println("swap not possible");
		  else{
		  	Node t,l;
		  	  System.out.println("possible");

		  	  if(x.previous1==null){
		  	  		t=x.head;
		  	  	x.previous2.next.next=x.head.next;
		  	  	x.head=x.previous2.next;
		  	  	x.previous2.next=t;
		  	  	   t.next=null;


		  	  }
		  	  else if(x.previous2==null)
		  	  	 {
		  	  	 	t=x.head;
		  	  	x.previous1.next.next=x.head.next;
		  	  	x.head=x.previous1.next;
		  	  	x.previous1.next=t;
		  	  	   t.next=null;
		  	  	 }

		  	  	 else{
		  	  	 		t=x.previous1.next;
		  	  	 		l=x.previous2.next.next;
		  	  	 		x.previous1.next=x.previous2.next;
		  	  	 		x.previous1.next.next=t.next;
		  	  	 		x.previous2.next=t;
		  	  	 		t.next=l;

		  	  	 }
		  }

		// System.out.println(previous.data);
x.print();
	}
}