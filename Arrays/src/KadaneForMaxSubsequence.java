/**
 * Created by shub on 5/28/2016.
 */
public class KadaneForMaxSubsequence {
    public static void main(String ar[]){
        int[] x={-2, -3, 4, -1, -2, 1, 5, -3};
        int max_index=0,max_so_far=0;
        for(int a=0;a<x.length;a++){
            max_index+=x[a];
            if(max_index<0) max_index=0;
            if(max_so_far<max_index) max_so_far=max_index;

        }
        System.out.println(max_so_far);
    }
}
