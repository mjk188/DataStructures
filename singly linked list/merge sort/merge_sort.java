class node{
  int data;
  node next;
  public node(int data){
    this.data=data;
    next=null;
  }
}

class linkedList{
  node head=null;
  public void insert(int data){
      node temp=new node(data);

      if(head==null) head=temp;
      else
      {
        temp.next=head;
        head=temp;
      }
  }

  public void print(){
    node start=head;
        while(start!=null){
          System.out.print(start.data+" ");
          start=start.next;
        }
        System.out.println();

  }

  public void print_node(node temp){
    node start=temp;
        while(start!=null){
          System.out.print(start.data+" ");
          start=start.next;
        }
        System.out.println();

  }
  public node getMid(node start,node end){
    node slow=null,fast=null;
    //if(start==null) return null;
    if(start.next==end) return start;
    slow=start;
    fast=start.next;
    while(fast.next!=end)
    {
      slow=slow.next;
      fast=fast.next;

      if(fast.next!=end)
        fast=fast.next;
    }
      return slow;
  }

public node combine_sorted(node list1,node list2){
node x=list1;
node y=list2;
node start=null,end=null;
  while(x!=null && y!=null){
     if(x.data <= y.data)
      { if(start==null)
        {start=x; end=x;}
        else
          {end.next=x; end=end.next;}
          x=x.next;
       }
      else{
        if(start==null){
            start=y; end=y;
        }
        else
          {end.next=y; end=end.next;}
          y=y.next;
          
      }
}
if(x!=null) end.next=x;
  else
    end.next=y;
  return start;
}

 public node mergeSort(node start,node end){
     node mid=getMid(start,end);
     //System.out.println(mid.data);  
    if(mid.next==null) return mid;

        node start2=mid.next;
        mid.next=null;
    node list1=mergeSort(start,null);
    node list2=mergeSort(start2,end);
    return combine_sorted(list1,list2);
  }

}
public class merge_sort{

  public static void main(String ar[]){

    linkedList ll=new linkedList();
     ll.insert(-14);
      ll.insert(4);
      ll.insert(6);
      ll.insert(10);
      ll.insert(3);
      ll.insert(5);
      ll.insert(1);

      ll.print();
      node start=ll.mergeSort(ll.head,null);
      ll.print_node(start);
    }
}