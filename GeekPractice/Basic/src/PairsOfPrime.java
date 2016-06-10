import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by shub on 5/30/2016.
 */
public class PairsOfPrime {
    static int[] prime=new int[400];
    static int count;
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        prime[count++]=2;
        computePrime();
        while(t--!=0){
            int num=s.nextInt();
                computePairs(num);
            System.out.println();
        }
        //System.out.println(Arrays.toString(prime));
    }

    private static void computePairs(int num) {
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(prime[i]*prime[j] <= num) System.out.print(prime[i]+" "+prime[j]+" ");
                else
                    break;
            }
        }
    }


    private static void computePrime() {
        int c=0;
        for(int a=prime[count-1]+1;a<200;a++){
            for(int b=2;b<=a/2;b++){
                if(a%b==0) c++;
            }
            if(c==0) prime[count++]=a;
            c=0;
        }
    }
}
