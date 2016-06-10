import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shub on 6/3/2016.
 */
public class SwapTwoNibbles {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- != 0) {
            int num = s.nextInt();

            System.out.println(compute(num));


        }

    }
    private static int compute(int num) {
        int mask1=Integer.parseInt("00001111",2);
        int mask2=Integer.parseInt("11110000",2);
        int left=(num&mask1)<<4;
        int right=(num&mask2)>>4;
        return (left|right);

        //return (bits >>> k) | (bits << (Integer.SIZE - k));
    }
    }
