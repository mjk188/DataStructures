class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}

class cell{
	cell next;
	Node n;
	public cell(Node n){
			this.n=n;
			next=null;
	}
}


public class maximumWidth{
	static cell start=null,end=null;
	static int maxcount=0,count=0;
	public static void insert(Node x){
		cell c=new cell(x);

		if(start==null) {
			start=c;
			end=c;
			
		}
		else{
				end.next=c;
				end=end.next;
		}
		
	}
	public static void pop(){
		System.out.print(start.n.data+" ");
		start=start.next;
	}

	public static void calculateMaxWidth(Node root){
			int refer;
			insert(root);
			count++;

			if(count>maxcount) {maxcount=count; }
			
			while(start!=null){
				refer=count;
				count=0;
				do{if(start.n.left!=null) {insert(start.n.left); count++;}
				   if(start.n.right!=null) {insert(start.n.right); count++;}

					pop();
					refer--;
					

				}
				while(refer!=0);
				System.out.println();
				if(count>maxcount)
				{
					maxcount=count;
					
				}
				
			}
	}
	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(10);
	        root.left = new Node(8);
	        root.right = new Node(2);
	        root.right.right = new Node(2);
	        root.right.right.right = new Node(2);
	        root.left.left = new Node(3);
	        root.left.right = new Node(5);
	        
	        System.out.println("Level wise Traversal");
	        calculateMaxWidth(root);
	        
	    System.out.println("Width="+maxcount);
	}
}