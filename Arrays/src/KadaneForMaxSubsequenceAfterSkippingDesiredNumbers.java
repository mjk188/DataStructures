import java.util.*;
class Solution{
	public static void main(String ar[]){

		Scanner s=new Scanner(System.in);

			// kadane's algorithm
		int[] q=new int[4];
		
		int t=s.nextInt();
		int[] arr;
		while(t--!=0){
			//int[] qpos=new [4];
			int len=s.nextInt();
			q[0]=s.nextInt();
			q[1]=s.nextInt();
			q[2]=s.nextInt();
			q[3]=s.nextInt();
			arr=new int[len];
			for(int a=0;a<len;a++) arr[a]=s.nextInt();
				int maxsofar=-1000000001,maxindex=-1000000001;
			for(int a=0;a<len;a++){
				if(findnum(arr[a],q))
					maxindex=-1000000001;
				else
				{
					maxindex+=arr[a];
					if(maxindex>maxsofar) maxsofar=maxindex;
					if(maxindex<arr[a]) maxindex=arr[a];
				}
			}

			System.out.println(maxsofar);

		}
	}
	private static boolean findnum(int num,int[] q){

			for (int x :q ) {
				if(x==num)
					return true;
			}
			return false;
	}
}