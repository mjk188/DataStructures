import java.util.*;

/**
 * Created by shub on 5/28/2016.
 */
public class OddElementusingXOR {
    public static void main(String ar[]){
        List<Integer> x=new ArrayList<Integer>(Arrays.asList(2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2));
        int result=0;
        for (Integer num:x             ) {
            result^= num;
        }
        System.out.println(result);
    }
}
