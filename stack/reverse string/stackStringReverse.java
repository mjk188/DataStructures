import java.util.*;
class node{
	char data;
	node next;
	public node(char data){
		this.data=data;
		next=null;
	}
}

class stack{
	node top=null;
	public void push(char data){
		node temp=new node(data);
			if(top==null) top=temp;
			else{
				temp.next=top;
				top=temp;
			}

			//print();

	}
	public int isEmpty(){
		if(top==null)
			return 1;
		else
			return -1;
	}
	public char pop(){
			char x=top.data;
			top=top.next;
			return x;
		//print();
	
	}

	public char peek(){

		 return top.data;
	}
public void print(){
	node temp=top;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
 }

}

class stackStringReverse{
	static stack s=new stack();
		

	public static String reverse(String x){
		String rev="";
	 
		  for(int a=0;a<x.length();a++)
		  	s.push(x.charAt(a));
		  

		  while(s.isEmpty()!=1)
		  	rev=rev+s.pop();
		return rev;
	}
	public static void main(String ar[]){
		
			Scanner s=new Scanner(System.in);

			while(s.hasNext())
			System.out.println(reverse(s.nextLine()));
			
	}
}