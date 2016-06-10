import java.util.*;
public class catalanNumbers{

	public static int catalan(int n){
	if(n<=1) return 1;
	int trees=0;
	    for(int i=0;i<n;i++)
	    		trees+=catalan(i) * catalan(n-i-1);
	    	return trees;
	}
	// public static int fact(int n){
	// 	if(n==1) return 1;
	// 	return n*fact(n-1);
	// }
	// public static int catalan(int n){
	// 	 int two_n=fact(2*n);
	// 	 int nplus1=fact(n+1);
	// 	 int nfact=fact(n);
	// 	 return two_n/(nplus1*nfact);

	// }
	public static void main(String ar[])
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter number of nodes to see different trees");
			int n=s.nextInt();
			
				int num_of_binarytrees_or_unlabeled_tress=catalan(n);
				System.out.println(num_of_binarytrees_or_unlabeled_tress);

	}
}