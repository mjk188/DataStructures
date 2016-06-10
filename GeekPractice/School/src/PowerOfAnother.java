import java.util.Scanner;

/**
 * Created by shub on 5/29/2016.
 */
public class PowerOfAnother {
    public static void main(String ar[]) {

        Scanner s=new Scanner(System.in);

        int t =s.nextInt();
        s.nextLine();
        while(t--!=0){
            int x=s.nextInt();
            int y=s.nextInt();
            if(x==1 ) System.out.println(0);
            else {
                while (y%x==0) y=y/x;
                if(y==1) System.out.println(1);
                else
                    System.out.println(0);

            }
        }}

}


