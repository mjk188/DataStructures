import java.util.Scanner;

/**
 * Created by shub on 6/3/2016.
 */
public class TrimSpaces {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- != 1) {
            String m = s.nextLine();
            //s.nextLine();
            //System.out.println(m);
            System.out.println(compute(m));


        }
        String m = s.nextLine();
        //System.out.println(m);
        System.out.println(compute(m));
    }

    private static String compute(String m) {
        String g= m.replace(" ","");
        return g;
    }

}