class NthLast_element{

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
int total=7;
int n=3;
int l=total-n+1;
cell p=s.head;
cell o=s.head;
   
   while(n!=0) {n--; o=o.next;}

   while(o!=null) {
    p=p.next;
    o=o.next;
   }
  System.out.println(p.data);

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