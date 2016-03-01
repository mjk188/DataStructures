class Pair_swap{

	public static void main(String ar[])
	  {
	  	slist s=new slist();

s.insert(1);
// s.insert(2);
// s.insert(3);
// s.insert(4);
// s.insert(5);
// s.insert(6);
// s.insert(7);
// s.insert(8);
s.print();

s.pair_swap();
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

public void pair_swap(){
        cell p1=head;
        cell p2=head.next;
        cell p3;

        if(head.next==null)  return;
          else
            head=head.next;

        p3=p2.next;

        while(p2!=null){

          p2.next=p1;
          if(p3!=null && p3.next!=null) 
               p1.next=p3.next;
                else
                  p1.next=p3;

                p1=p3;
     if(p3!=null && p3.next!=null) {
           p2=p3.next;
           p3=p2.next;
     }
       else
        p2=null;

        }

}
   public void recu_reverse(cell temp,cell previous){
      if(temp==null)  {
             head=previous;
             return;
      }
      else{

          recu_reverse(temp.next,temp);
          temp.next=previous;
      }


   }

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