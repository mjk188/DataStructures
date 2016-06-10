import java.util.Scanner;

/**
 * Created by shub on 6/1/2016.
 */
public class perfectCube {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while(t--!=0){
            int c=0;
            int st=s.nextInt();
            int en=s.nextInt();
                for(int a=st;a<=en;a++){
                    int cubeRoot=(int)Math.cbrt(a);
                    int power=(int)Math.pow(cubeRoot,3);
                      if(power==a) {System.out.print(a+" "); c++;}

                }
            if (c==0) System.out.println("No");
            else
            System.out.println();
        }
    }
}
