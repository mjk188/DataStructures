import java.util.Scanner;

/**
 * Created by shub on 6/1/2016.
 */
public class CountZero {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

            while(t--!=0){
                long count=0;
                int d=s.nextInt();
                    for(int a=d;a>=2;a--) {
                        long allPossibleNums = (long) Math.pow(10, a - 1) * 9;
                        long allPossibleNumsWithoutZeros = (long) Math.pow(9, a);
                        count+=(allPossibleNums-allPossibleNumsWithoutZeros);

                    }
               System.out.println(count);
            }

    }
}
