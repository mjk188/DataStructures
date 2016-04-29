import java.util.*;
class node{
int data;
node next;
node down;

	 public node(int data){
	 	this.data=data;
	 	next=null;
	 	down=null;
	 }

}

class linkedList{
  node head=null,mainpStart=null;
	 public void insert(int data){
   		node x=new node(data);
   		if(head==null)
   			  {
   			  	head=x;
   			  }
   			else{
   				node temp=head;

   				while(temp.down!=null) temp=temp.down;
   				temp.down=x;

   			}  
   		}
   		public void insertlist(){
   			node l1=head;
   			if(mainpStart==null) mainpStart=l1;
   				else
   				{
   					node temp=mainpStart;
   					 while(temp.next!=null) temp=temp.next;
   					 temp.next=l1;
   				}

   			head=null;

   		}

   	  public void print(){
   	node t=mainpStart;
   	node p;
   		while(t!=null){
   			 System.out.print(t.data+" ");
   				p=t.down;
   				  while(p!=null){
   				  	System.out.print(p.data+" ");
   				  	p=p.down;
   				  }
   				  t=t.next;
   				  System.out.println();
   }


   }
}


public class flattenLinkeList{
	public static void main(String ar[])
	{
		linkedList s=new linkedList();
		Scanner sc=new Scanner(System.in);
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insertlist();
		s.insert(11);
		s.insert(23);
		s.insertlist();
		s.insert(-11);
		s.insert(-23);
		s.insertlist();
		s.print();
		System.out.println();

		flattenList(s);
	

	}
	public static void flattenList(linkedList s){
		node st=s.mainpStart;

		  if(st.next==null) s.print();
		    else {
		    			while(st.next!=null){
		    				 node ptr1=st;
		     node ptr2=st.next;
		     st=st.next.next;

		  node start=null,end=null;
		  while(ptr1!=null && ptr2!=null){
		     if(ptr1.data <= ptr2.data)
		      { if(start==null)
		        {start=ptr1; end=ptr1;}
		        else
		          {end.down=ptr1; end=end.down;}
		          ptr1=ptr1.down;
		       }
		      else{
		        if(start==null){
		            start=ptr2; end=ptr2;
		        }
		        else
		          {end.down=ptr2; end=end.down;}
		          ptr2=ptr2.down;
		          
		      }
		}
		if(ptr1!=null) end.down=ptr1;
		  else
		    end.down=ptr2;

		start.next=st;
		st=start;

		    			}
		    			s.mainpStart=st;
		    			s.print();

       }
   }
}