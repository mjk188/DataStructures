class node{
	int data;
	node next;
	public node(int data){
		this.data=data;
		next=null;
	}
}

class stack{
	node top=null;
	public void push(int data){
		node temp=new node(data);
			if(top==null) top=temp;
			else{
				temp.next=top;
				top=temp;
			}

			print();

	}

	public void pop(){
		if(top==null) {System.out.println("Stack empty");
			return;}
		System.out.println(top.data);
			top=top.next;

		print();
	
	}

	public int peek(){
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

class stackCreation{
	public static void main(String ar[]){
			stack s=new stack();
			s.pop();
			s.push(-13);
			s.push(10); 
			s.pop();


	}
}