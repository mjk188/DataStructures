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

class stackInfixtoPostfix{

		static stack s=new stack();

	public static String infixtopostfix(String x){
		String postfix="";
		 for(int a=0;a<x.length();a++){

		 	  char character=x.charAt(a);
		 

		 	  if(isOperand(character)==true) postfix=postfix+character;
		 	  	   	else {

		 	  		if(character=='(') s.push(character);
		 	  			else if(character==')') {
		 	  				while(s.peek()!='(') postfix=postfix+s.pop();
		 	  					s.pop();
		 	  					//System.out.println(postfix);
		 	  			}
		 	  			 else{

					 	  		int priority = operatorPriority(character);
					 	  		if(s.isEmpty()==1){
					 	  			s.push(character);
					 	  		}
					 	  		else{
					 	  			char stackCharacter=s.peek();
					 	  			int stackCharacterPriority=operatorPriority(stackCharacter);
					 	  			while(stackCharacterPriority >= priority)
					 	  				{postfix=postfix+s.pop();
					 	  					if(s.top==null) break;
					 	  						stackCharacter=s.peek();
					 	  						stackCharacterPriority=operatorPriority(stackCharacter);
					 	  				}
					 	  				s.push(character);
					 	  		    }
					 	  		
		 	  			     }
		 	  		     }
		             }
		 while(s.isEmpty()!=1){
		 	postfix=postfix+ s.pop();
		 }
		 return postfix;
	}

	public static boolean isOperand(char c){
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			return true;
		else
			return false;
	}

	public static int operatorPriority(char ch){
	  switch(ch){
	  	case '+':
	  	case '-':
	  	return 1;
	  	case '*':
	  	case '/':
	  	return 2;
	  	case '^':
	  	return 3;
	  	default:
	  	return -1;
	  }
}
	public static void main(String ar[]){
		
			Scanner s=new Scanner(System.in);

while(s.hasNext()){
String postfix=infixtopostfix(s.nextLine());
System.out.println(postfix);
}
	}
}