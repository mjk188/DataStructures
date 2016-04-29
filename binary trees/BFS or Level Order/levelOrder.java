class Node{
	 int data;
	 Node left,right;

	 public Node(int data){
	 	this.data=data;
	 	left=right=null;
	 }
}



public class levelOrder{
	public static void level_print_dfs(Node root,int level){
		if(level==1 && root!=null)
			System.out.println(root.data);
		 else if(root!=null)
		 {	
		 	level_print_dfs(root.left,level-1);				// this is dfs approcah    time is O(n^2)
		 	level_print_dfs(root.right,level-1);
		 
		}
	}

public static void level_print_queue(Node root){
	Node[] queue=new Node[5];
	 int front=0;
	 int rear=0;
	 queue[front]=root;
	 while(front<=rear){							// this is queue based approach O(n) time
	 	System.out.print(queue[front].data+" ");
	 	if(queue[front].left!=null)
	 	queue[++rear]=queue[front].left;
	    if(queue[front].right!=null)
	 	queue[++rear]=queue[front].right;
	 ++front;

	 }
}

	// there is also queue based approach which is actual level order
	public static void main(String ar[]){

			Node root=null;

			
			root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        	int level=3;
	       level_print_dfs(root,level);

	       level_print_queue(root);
	}
}