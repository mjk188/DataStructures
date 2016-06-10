
import java.util.*;
import java.util.stream.*;

/**
 * Created by shub on 5/28/2016.
 */
public class ArraysSort {
    public static void main(String ar[]){
       sortingMethod1();
        sortingMethod2();
        sortingMethod3();



    }

    private static void sortingMethod3() {
        int[] data = {1,2,3,4,5,6,7,8,9,10};

// To boxed array
        Integer[] what = Arrays.stream( data ).boxed().toArray( Integer[]::new );
        Integer[] ever = IntStream.of( data ).boxed().toArray( Integer[]::new );

// To boxed list
        List<Integer> you  = Arrays.stream( data ).boxed().collect( Collectors.toList() );
        List<Integer> like = IntStream.of( data ).boxed().collect( Collectors.toList() );
        Collections.sort(you,new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                return y-x;
            }
        });
   System.out.println(you.toString());
    }

//###############################best one
    private static void sortingMethod2() {
        Integer arr[] = { 2,2,3,5,2,2,6};
        ArrayList<Integer> x=new ArrayList<Integer>(Arrays.asList(arr)); // usually takes integer as input not int
        Collections.sort(x,new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                return y-x;
            }
        });
        int k=0;
        for(Integer t:x){
            arr[k++]=t;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void sortingMethod1() {
        int oldArray[] = { 2,2,3,5,2,2,6};
        Integer[] newArray = new Integer[oldArray.length];
        int i = 0;
        for (int value : oldArray) {
            newArray[i++] = Integer.valueOf(value);
        }

        Arrays.sort(newArray,new Comparator(){
            public int compare(Object x,Object y){
                return (Integer)y-(Integer)x;
            }
        });
        System.out.println(Arrays.toString(newArray));

    }
}
