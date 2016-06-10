import java.util.Scanner;

/**
 * Created by shub on 6/8/2016.
 */
public class MaxProduct {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();


        while (t-- != 0) {
            int len=s.nextInt();
            int[] x=new int[len];
            for (int a=0;a<len;a++) x[a]=s.nextInt();

            System.out.println(compute(x));


        }

    }

    private static int compute(int[] x) {
        int m1=x[1],m2=x[0];
        if(m2<m1) {
            int temp=m2;
            m2=m1;
            m1=temp;
        }
        for(int a=2;a<x.length;a++){
            if (x[a]>m2){
                m1=m2;
                m2=x[a];
            }
            else if (x[a]>m1) m1=x[a];
        }
        return m1*m2;
    }
}
