/**
 * Created by shub on 5/27/2016.
 */
import java.util.*;



//public class SumAsX {
//
//    public static void main(String ar[]){
//
//        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1, 4, 45, 6, 10, -8));
//        int num=17;
//
//
//        System.out.println(A.toString());
//        Collections.sort(A,new Comparator<Integer>(){
//           public int compare(Integer x,Integer y){
//                return x-y;
//            }
//        });
//
//        System.out.println(A.toString());
//        int a=0,b=A.size()-1;
//       while(a<b){
//           if(A.get(a) + A.get(b) == num) {
//               System.out.println(A.get(a) + " " + A.get(b));
//               break;
//           }
//           else if(A.get(a) + A.get(b) < num)
//               a++;
//           else
//               b--;
//       }
//        if(a>=b) System.out.println("Sorry");
//
//    }
//}

public class SumAsX{
    public static void main(String ar[]){
        HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
        ArrayList<Integer> A=new ArrayList<Integer>(Arrays.asList(1, -8, 45, 6, 10, 4 , 0 ,-4));
        int num=-4;

        for(Integer x:A){
            if(hm.containsKey(num-x) && hm.get(num - x) == true)
                System.out.println(x+" "+(num-x));
                hm.put(x,true);

        }

    }
}