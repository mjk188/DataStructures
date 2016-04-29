class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class binaryTree{
	public static void preorder(Node root){
		if(root!=null) {
			  System.out.print(root.data+" ");
			  preorder(root.left);
			  preorder(root.right);
		}
	}
	public static void inorder(Node root){
		if(root!=null) {
			  
			  inorder(root.left);
			  System.out.print(root.data+" ");
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

	        preorder(root);
	        System.out.println();
	        inorder(root);
	        System.out.println();
	        postorder(root);
	        System.out.println();
	}
}