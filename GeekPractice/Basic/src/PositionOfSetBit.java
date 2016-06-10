import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class PositionOfSetBit {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        while(t--!=0){
        int num=s.nextInt();
            computePosition(num);
        }
    }

    private static void computePosition(int num) {
            int pos=1,count=0,one_pos=-1;
        while(num!=0) {
            if ((num & 1) == 1) {
                count++;
                one_pos=pos;
            }
                num = num >> 1;
            pos++;
        }
        if(count==1)
        System.out.println(one_pos);
        else
            System.out.println(-1);
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//        int t=2147483647;
//        System.out.println(t);
//        char[] arr=new char[1000000000];
    }
}
