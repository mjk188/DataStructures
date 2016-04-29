import java.util.Arrays;
class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class pathToLeafbinaryTree{
	static int[] x=new int[5];
	static int ptr=0;


	public static void inorder(Node root){
			x[ptr++]=root.data;
			if(root.left==null && root.right==null)
			{
				for(int a=0;a<ptr;a++)
					System.out.print(x[a]+" ");
				ptr--;
				System.out.println();
			}
			else {

				 if(root.left!=null) inorder(root.left);
				  if(root.right!=null) inorder(root.right);
				  ptr--;
			}

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

	       
	        inorder(root);
	        
	}
}