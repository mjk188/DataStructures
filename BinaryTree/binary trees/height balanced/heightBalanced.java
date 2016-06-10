class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class heightBalanced{
	static boolean isBalanced=true;
public static int max(int a, int b){
	if(a>b)
		return a;
	else
		return b;
}
	public static int hb(Node root){
		  if(root==null) return 0;
		   
		   	int h_right=hb(root.right);
		   	int h_left=hb(root.left);
		   		if(Math.abs(h_left- h_right)>1 ) 
		   			isBalanced=false;

		   			return 1+max(h_right,h_left);
		   	
	}

	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(10);
	        root.left = new Node(8);
	        root.right = new Node(2);
	        root.right.right = new Node(2);
	        root.left.left = new Node(3);
	        root.left.right = new Node(5);

	        
	     int height = hb(root);
			if(isBalanced==false)
			  System.out.println("unbalanced with height="+ height);
			  else
			        System.out.println("balanced with height="+ height);
	}
}