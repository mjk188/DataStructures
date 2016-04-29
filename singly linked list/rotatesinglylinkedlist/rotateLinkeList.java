import java.util.*;
public class rotateLinkeList{
	public static void main(String ar[])
	{
		linkedList s=new linkedList();
		Scanner sc=new Scanner(System.in);
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		s.insert(6);
		s.insert(6);
		s.insert(7);
		s.insert(8);
		s.print();
		System.out.println();
		int k=sc.nextInt();
		rotatelist(k,s);
		s.print();

	}
	public static void rotatelist(int k,linkedList s)
	{
		node start=s.head;
			while(--k !=0){
				start=start.next;
			}
			node end=start;
			while(end.next!=null) end=end.next;
			node s1=s.head;
			s.head=start.next;
			start.next=null;
			end.next=s1;
	}
}
class node{
int data;
node next;

	 public node(int data){
	 	this.data=data;
	 }

}

class linkedList{
  node head=null;
	 public void insert(int data){
   		node x=new node(data);
   		if(head==null)
   			  {
   			  	head=x;
   			  }
   			else{
   				node temp=head;
   				while(temp.next!=null) temp=temp.next;
   				temp.next=x;

   			}  
   		}

   	  public void print(){
   	node t=head;
   		while(t!=null){
   			 System.out.print(t.data+" ");
   				t=t.next;
   }


   }
}


