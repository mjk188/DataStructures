import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class Pallindrome {
    public static void main(String ar[]) {

        Scanner s=new Scanner(System.in);

        int t =s.nextInt();
        s.nextLine();
        while(t--!=0){
            String num=s.next();
            computePallindrome(num);
            s.nextLine();
        }
    }

    private static void computePallindrome(String num) {
        char[] x=num.toCharArray();
        int i=0,j=x.length-1;
        while(i<j){
            if(x[i]==x[j]){
                i++;
                j--;
            }
            else{
                System.out.println("No");
                break;
            }
        }
        if(i>=j)
        System.out.println("Yes");
    }

}
