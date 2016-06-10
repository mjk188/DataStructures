class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class mirrorBinaryTree{
	public static void  print(Node root){
		if(root!=null) {
			print(root.left);
			System.out.print(root.data+" ");
			print(root.right);
		}
	}
	public static Node inorder(Node root){
		if(root!=null) {
			  Node rt=root.right;
			  root.right=inorder(root.left);
			 // 
			  root.left=inorder(rt);
			  
		}
		
			return root;
		
	}

	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.right.left = new Node(4);
	        root.right.left.left = new Node(5);
	        root.right.left.right=new Node(6);
	        root.right.left.right.right =new Node(7);
	        print(root);
	        System.out.println();
	        root=inorder(root);
			print(root);
	        
	      
	}
}