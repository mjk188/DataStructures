class Reverse_list{

	public static void main(String ar[])
	  {
	  	slist s=new slist();

s.insert(1);
s.insert(2);
s.insert(3);
s.insert(4);
s.insert(5);
s.insert(6);
s.insert(7);
s.print();

  cell previous=null;
  cell current = s.head;
  cell temp;

  while(current!=null){
       temp=current.next;
       current.next=previous;
       previous=current;
       current=temp;
  }
  s.head=previous;
  s.print();
	  }
}

class cell{

	int data;
	cell next;
  public cell(int data){
  	   this.data=data;
  	   next=null;
  }

}

class slist{

   cell head=null;

   public void insert(int data){
   		cell x=new cell(data);
   		if(head==null)
   			  {
   			  	head=x;
   			  }
   			else{
   				cell temp=head;
   				while(temp.next!=null) temp=temp.next;
   				temp.next=x;

   			}  


   }

   public void print(){
   	cell t=head;
   		while(t!=null){
   			 System.out.print(t.data+" ");
   				t=t.next;
   }
System.out.println();
}

}