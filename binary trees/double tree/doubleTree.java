class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}


class doubleTree{
	public static void inorder(Node root){
		if(root!=null) {
			  
			  inorder(root.left);
			  System.out.print(root.data+" ");
			  inorder(root.right);
		}
	}
	public static Node doubleTheTree(Node root){
			if(root==null) return null;
			
			Node temp=new Node(root.data);
			
			temp.left=root.left;
			root.left=temp;

			temp.left=doubleTheTree(temp.left);
			root.right=doubleTheTree(root.right);

			return root;

	}
	public static void main(String ar[]){
			Node root=null;

			
			root = new Node(10);
	        root.left = new Node(8);
	        root.right = new Node(2);
	        root.right.right = new Node(2);
	        root.left.left = new Node(3);
	        root.left.right = new Node(5);
	        inorder(root);
	        root=doubleTheTree(root);
	        System.out.println();
			inorder(root);
	}
}