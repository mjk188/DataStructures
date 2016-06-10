import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class RemoveRecurringDigits {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- != 0) {
            String num = s.next();
            s.nextLine();

            computeNonRecurredNumber(num);

        }
    }

    private static void computeNonRecurredNumber(String num) {
int[] x=new int[10];
        String result="";
        for(int a=0;a<num.length();a++)
        {
            if(x[Integer.parseInt(""+num.charAt(a))]==0){
                x[Integer.parseInt(""+num.charAt(a))]=1;
                result=result+num.charAt(a);

            }
        }
        System.out.println(result);
    }
}