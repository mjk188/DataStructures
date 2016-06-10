/**
 * Created by shub on 5/28/2016.
 */
import java.util.*;

public class MooreVoting {  ///////////////////////////// majority element best algorithm can be done by hashing also but uses extra space
    public static void main(String ar[]){
            List<Integer> x=new ArrayList<Integer>(Arrays.asList(2,2,3,5,2,2,6));
        // calculating the candidate for majority
        int maj_index = getMaj_index(x);
        System.out.println(x.get(maj_index));
        int count=0;
        // now check its majority
        for (Integer t:x             ) {
            if(t==x.get(maj_index)) count++;

        }

        if(count>x.size()/2) System.out.println(x.get(maj_index));
        else
            System.out.println("sorry");
    }

    private static int getMaj_index(List<Integer> x) {
        int maj_index=0,count=1;
        for(Integer num:x){
            if(num==x.get(maj_index)) count++;
            else
                count--;
            if(count==0) {
                maj_index=x.indexOf(num);
                count=1;
            }
        }
        return maj_index;
    }
}
