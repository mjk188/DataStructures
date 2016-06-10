/**
 * Created by shub on 5/24/2016.
 */
import java.util.*;
public class StockSpan {
    public static void main(String ar[]){

        Stack<Integer> st=new Stack<Integer>();

        int price[]={10,4,5,90,120,80};
        stockSpan(st,price);
        //System.out.println(st.toString());
    }
// check for consecutive days ..... idea is to check for consecutive days
    // concept is i- previous longest
    private static void stockSpan(Stack<Integer> st,int[] price) {
        int[] span=new int[price.length];
        span[0]=1;
        st.push(0);
        for(int x=1;x<price.length;x++){
            while((!st.empty()) && price[st.peek()]<=price[x] ){
                st.pop();

            }
            if(st.empty()) span[x]=x+1;
            else
                span[x]=x-st.peek();

            st.push(x);

        }

        System.out.println(Arrays.toString(span));
    }
}
