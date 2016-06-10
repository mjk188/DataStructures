import java.util.*;
/**
 * Created by shub on 5/24/2016.
 */
//http://www.javatpoint.com/Comparator-interface-in-collection-framework
//http://stackoverflow.com/questions/14154127/collections-sortlistt-comparator-super-t-method-example
class IntegComparator implements Comparator{
    @Override
    public int compare(Object x,Object y){
        return (Integer)x-(Integer)y;
    }
}

public class ReverseusingcollectionsSort {

    public static void main(String ar[]){
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(5);
        st.push(2);
        st.push(-13);
        st.push(100);
        System.out.println(st.toString());
        System.out.println(st.peek());


        Collections.sort(st,new IntegComparator());
//        Collections.sort(st, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
        System.out.println(st.toString());
        System.out.println(st.peek());

    }
}





