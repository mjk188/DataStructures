class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class childrensum{

	public static int inorder(Node root){
		int sum_left=0;
		int sum_right=0;
		if(root.left==null && root.right==null) return root.data;
		
			  
				if(root.left!=null)	
			    sum_left=inorder(root.left);
			  if(root.right!=null)
			  sum_right=inorder(root.right);
			if(sum_right+sum_left== root.data) return root.data;
			else 
				return -1;

		
	}

	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(10);
	        root.left = new Node(8);
	        root.right = new Node(2);
	        root.right.right = new Node(2);
	        root.left.left = new Node(3);
	        root.left.right = new Node(5);

	        
	        int sum=inorder(root);
	        if(sum==root.data)
	        System.out.println("true");
	       else
	       	System.out.println("false");
	      
	}
}