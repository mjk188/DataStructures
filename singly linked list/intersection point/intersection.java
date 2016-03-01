import java.util.*;

class intersection{

	public static void main(String ar[])
	  {
	  	slist s=new slist();
      slist k=new slist();


s.insert(1);
s.insert(2);
s.insert(3);
s.insert(4);
s.insert(5);
s.insert(6);
s.insert(7);
s.print();

k.insert(8);
k.insert(9);
cell x=s.find(4);
cell y=k.find(9);
y.next=x;

k.print();


Hashtable inter=new Hashtable();
Enumeration nodes;
String str;

cell p=s.head;
while(p!=null) 
  {inter.put(p.data,p);
    p=p.next;}

nodes=inter.keys();
while(nodes.hasMoreElements()) {
str=(String) nodes.nextElement();
System.out.println(str+" : "+inter.get(str));
}


cell o=s.head;
   
     

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