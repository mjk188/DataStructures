import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shub on 6/1/2016.
 */
public class MaxSumAmazon {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- != 0) {
            int len=s.nextInt();
            ArrayList<Integer> x=new ArrayList<Integer>();
            for(int a=0;a<len;a++) x.add(s.nextInt());
            compute(x);


        }
    }

    private static void compute(ArrayList<Integer> x) {
        Stack<Integer> st=new Stack<Integer>();
        int sum=0;
        if(x.get(0)>x.get(1)) st.push(0);
        else
        st.push(1);

        sum=sum+x.get(st.peek());

        for(int a=st.get(0)+2;a<x.size()-1;a+=2){
            if( x.get(a)>x.get(a+1)) st.push(a);
            else
                st.push(a+1);
            //sum+=x.get(st.peek());
        }
    System.out.println(st.toString());
    }
}
