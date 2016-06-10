import java.util.Scanner;

/**
 * Created by shub on 6/2/2016.
 */
public class NumbersContainingZerosAsDigits {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- != 0) {
            int count=0;
        int num=s.nextInt();
            for(int a=1;a<=num;a++){
                if(String.valueOf(a).contains("0"))
                    count++;

            }
            System.out.println(count);


        }
    }
}
