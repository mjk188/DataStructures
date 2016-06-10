/**
 * Created by shub on 5/25/2016.
 */
import java.util.*;
public class ExpressionEvaluation {
public static void main(String ar[]){
    String x="1 * 5 + 2 * 6";

    evaluate(x.toCharArray());

}
private static void operation(Stack<String> ev,Character token){
    int y=Integer.parseInt(ev.pop());
    int x=Integer.parseInt(ev.pop());

    switch(token){
        case '+':
            x+=y;
            break;
        case '-':
            x-=y;
            break;
        case '*':
            x*=y;
            break;
        case '/':
            x/=y;
            break;


    }

    ev.push(Integer.toString(x));
}
    private static void evaluate(char[] tokens) {
        ArrayList<Character> postfix=toPostfix(tokens);
        System.out.println(postfix.toString());
        System.out.println("here");
        Stack<String> ev=new Stack<String>();
           for(Character token:postfix){
               if(token=='+' || token=='-' || token=='*' || token=='/' ){
                   operation(ev,token);
               }
               else
                   ev.push(token.toString());
           }
    System.out.println(ev.peek());
    }

    private static int checkPrecedence(char x){
        switch (x){
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;


        }
        return -1;
    }
    private static ArrayList<Character> toPostfix(char[] tokens) {
        ArrayList<Character> ch=new ArrayList<>(tokens.length);
        Stack<Character> st=new Stack<Character>();
        for (char token:tokens) {
            if(token==' ') continue;
            if(token=='+' || token=='-' || token=='*' || token=='/' ){
                if (st.empty()) st.push(token);
                else {
                    if(!st.empty() && checkPrecedence(token) > checkPrecedence(st.peek())) st.push(token);
                    else {
                        while (!st.empty() && checkPrecedence(token) <= checkPrecedence(st.peek())) {
                            ch.add(st.pop());
                            st.push(token);
                        }
                    }
                }

                }
            else
                ch.add(token);


        }
        while(!st.empty()) ch.add(st.pop());
    return ch;
    }
}
