/**
 * Created by shub on 5/25/2016.
 */
import java.util.*;
public class NextGreater {
    public static void main(String ar[]){

        int[] arr={13,7,6,12};//{4,5,2,25};

        Stack<Integer> st=new Stack<Integer>();
        nextGreater(arr,st);
        System.out.println(st.toString());

    }

    private static void nextGreater(int[] arr, Stack<Integer> st) {
        int[] x=new int[arr.length];
        st.push(0);
        for(int a=1;a<arr.length;a++){

            while(!st.empty() && arr[a]>=arr[st.peek()]){

                x[st.pop()]=arr[a];
            }
            st.push(a);

        }
        while(!st.empty())
            x[st.pop()]=-1;
System.out.println(Arrays.toString(x));
    }
}
