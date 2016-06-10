import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   	
   	Scanner s=new Scanner(System.in);
   		int n=s.nextInt();

   		String B=s.next();

   		char ch[]=B.toCharArray();
   		int c=0;
   		
   		for(int a=0;a<ch.length-2;a++){

   			String x="";
   			   x=x+ch[a]+ch[a+1]+ch[a+2];
   			   if(x.equals("010"))
   			   	{c++;
   			   		ch[a+2]=1;
   			   	}
   		}


   		System.out.println(c);




   		//System.out.println(Arrays.toString(ch));

   }
}