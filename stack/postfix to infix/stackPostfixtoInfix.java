import java.util.*;
class node{
	String data;
	node next;
	public node(String data){
		this.data=data;
		next=null;
	}
}

class stack{
	node top=null;
	public void push(String data){
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
	public String pop(){
			String x=top.data;
			top=top.next;
			return x;
		//print();
	
	}

	public String peek(){

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

class stackPostfixtoInfix{
	static stack s=new stack();
		

	public static String postfixtoinfix(String x){
		String infix="";
	 
		  for(int a=0;a<x.length();a++){
		  	if(isOperand(x.charAt(a))) s.push(x.charAt(a)+"");
		  	  else{
		  	  	infix=infix+s.pop();
		  	  	infix="("+s.pop()+x.charAt(a)+infix+")";
		  	  	s.push(infix);
		  	  }
		  	  infix="";
		  }
		return s.pop();
	}

	public static boolean isOperand(char c){
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			return true;
		else
			return false;
	}

	public static void main(String ar[]){
		
			Scanner s=new Scanner(System.in);

			while(s.hasNext()){
			String infix=postfixtoinfix(s.nextLine());
			System.out.println(infix);
			}
	}
}