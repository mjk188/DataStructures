import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class LeaderinArray {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        int[] num;
        while(t--!=0){
                int len=s.nextInt();
                num=new int[len];
            for (int x=0;x<len;x++) {
                num[x]=s.nextInt();

            }
            computeLeaders(num);

        }
    }

    private static void computeLeaders(int[] num) {
        int max=num[num.length-1];
        String result=""+Integer.toString(max);
        for(int x=num.length-2;x>=0;x--){
            if(num[x]>max){
                max=num[x];
                result=max+" "+result;

            }
        }
        System.out.println(result);
    }

}
