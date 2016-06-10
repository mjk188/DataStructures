import java.util.*;

/**
 * Created by shub on 5/30/2016.
 */
public class KLargestinArray {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
      Integer arr[];
        while(t--!=0){
            int size=s.nextInt();
            int k=s.nextInt();
            arr=new Integer[size];
            for(int a=0;a<size;a++) arr[a]=new Integer(s.nextInt());

            computeKLargest(arr,k);
            System.out.println();
        }
    }

    private static void computeKLargest(Integer[] arr, int k) {


        Arrays.sort(arr, new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                return y-x;
            }
        });
        for (int i=0;i<k;i++) System.out.printf("%d ",arr[i]);
    }
}
