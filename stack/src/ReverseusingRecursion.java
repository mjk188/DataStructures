import java.util.Collections;
import java.util.Comparator;
import java.util.*;

/**
 * Created by shub on 5/24/2016.
 */

public class ReverseusingRecursion {

    public static void main(String ar[]){
        Stack<Integer> st=new Stack<Integer>();

        st.push(1);
        st.push(5);
        st.push(2);
        st.push(-13);
        st.push(100);
        System.out.println(st.toString());
        System.out.println(st.peek());


       recursion(st);
        System.out.println(st.toString());
        System.out.println(st.peek());

    }

    private static void recursion(Stack<Integer> st) {
        if(!st.empty()){
            int temp=st.pop();
            recursion(st);

            insertAtBottom(temp,st);
        }
    }

    private static void insertAtBottom(int item, Stack<Integer> st) {
        if(st.empty())
            st.push(item);
        else
        {   int temp=st.pop();

            insertAtBottom(item,st);
            st.push(temp);
        }
    }


}
