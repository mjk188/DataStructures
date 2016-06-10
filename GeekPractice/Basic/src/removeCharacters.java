import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shub on 6/1/2016.
 */
public class removeCharacters {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while(t--!=1) {

            char test[]=(s.next()).toCharArray();
            s.nextLine();
            char[] mask=(s.next()).toCharArray();
            s.nextLine();
            compute(test,mask);
        }
        char test[]=(s.next()).toCharArray();
        s.nextLine();
        char[] mask=(s.next()).toCharArray();

        compute(test,mask);

    }

    private static void compute(char[] test, char[] mask) {
        HashMap<Character, Boolean> hm = new HashMap<Character, Boolean>();
        for (char x:mask) {
            hm.put(x,true);
        }
        for (char x:test) {
            if(hm.containsKey(x))
                continue;
            else
                System.out.print(x);

        }
    System.out.println();
    }
}
