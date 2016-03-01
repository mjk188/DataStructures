class loop{

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

cell k1=s.find(4);
cell k2=s.find(7);
k2.next=k1;

//s.print();

cell p=s.head;
cell o=s.head;
   
     
 do{
  p=p.next;
  o=o.next.next;
 }while(o!=p);
o=s.head;

while(o!=p) {o=o.next; p=p.next;}

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

  public cell find(int data){
    cell temp=head;
    while(temp!=null && temp.data!=data )
      temp=temp.next;

return temp;
  }
}