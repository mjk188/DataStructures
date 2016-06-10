import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class minPallindromicSubsequence {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        int len;
        //char[] arr=new char[1000000];
        String binary;
        while(t--!=0){

            len=s.nextInt();
            s.nextLine();
            binary=s.next();
            s.nextLine();

            //arr=binary.toCharArray();
            //System.out.println(Arrays.toString(arr));
            boolean b=checkPallindrome(binary,len);
            if(b) System.out.println(1);
            else
                System.out.println(2);
        }
    }

    private static boolean checkPallindrome(String arr, int len) {
        int i=0,j=len-1;
        while(i<j) {
            if(arr.charAt(i)==arr.charAt(j)) {
                i++;
                j--;
            }
            else
                break;
        }
        if (i<j) return false;
        else
            return true;
    }
}
