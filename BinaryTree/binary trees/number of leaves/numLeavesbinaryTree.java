class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class numLeavesbinaryTree{
	static int count=0;
	public static void preorder(Node root){
		if(root!=null) {
			  System.out.print(root.data+" ");
			  preorder(root.left);
			  preorder(root.right);
		}
	}
	public static void inorder(Node root){
		if(root.left==null && root.right==null) count++;
		else {
			if(root.left!=null)
			  inorder(root.left);
			if(root.right!=null)
			   inorder(root.right);
		}
			}
	public static void postorder(Node root){
		if(root!=null) {
			  
			  postorder(root.left);
			  postorder(root.right);
			  System.out.print(root.data+" ");
		}
	}
	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        root.left.right.right = new Node(6);
	        root.left.right.left = new Node(7);
	       
	        inorder(root);
	        System.out.println(count);
	       
	}
}