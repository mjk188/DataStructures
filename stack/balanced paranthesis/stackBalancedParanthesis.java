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

public class stackBalancedParanthesis{
	static stack s=new stack();
		

	public static boolean isBalanced(String x){
		
	 		
		  for(int a=0;a<x.length();a++)
		  	{
		  		char ch=x.charAt(a);
		  		if(s.isEmpty()==1)
		  		s.push(x.charAt(a));
		  			else{
		  				char top_element=s.peek();
		  				  if(top_element=='(' && ch==')') s.pop();
		  				  else if(top_element=='{' && ch=='}') s.pop();
		  				   else if(top_element=='[' && ch==']') s.pop();
		  				    else s.push(ch);
		  			}

		  	}
		  	if(s.isEmpty()==1)
		  		return true;
		  	else
		  		return false;
		
	}
	public static void main(String ar[]){
		
			Scanner s=new Scanner(System.in);

			while(s.hasNext())
			System.out.println(isBalanced(s.nextLine()));
			
	}
}