/**
 * Created by shub on 5/29/2016.
 */
import java.util.*;
public class MiddleOfThree {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int a,b,c;

        while (t-- != 0) {
            a = s.nextInt(); b = s.nextInt(); c = s.nextInt();

            if ((a > b && a < c) || (a<b && a>c)) System.out.println(a);
            else if ((b > a && b < c) || (b<a && b>c)) System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
