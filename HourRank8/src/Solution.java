import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> ar;

        int t=s.nextInt();
        while(t--!=0){
            int num=s.nextInt();
            ar=new ArrayList<Integer>(num);
            while(num--!=0) {
                ar.add(s.nextInt());

            }
            if (num==1) {
                System.out.println(ar.size());
                System.out.println(ar.get(0));
            }
            else if (num==2){
                System.out.println(ar.size());
                System.out.println(ar.get(0)+" "+ar.get(1));
            }
            else{

                int a=ar.size()-1;
                if (a%2!=0) a--;
                int w=ar.get(a-1)-1;
                int z=ar.get(a)-1;
                if(w!=0 && z!=0){
                    ar.set(a-1,w);
                    ar.add(a,1);
                    ar.add(a,1);
                    ar.set(a+2,z);
                }
                else if(w==0 && z==0){
                    int g=ar.get(a-2);
                   // g++;
                    ar.set(a-2,++g);
                    ar.remove(a);
                }
                else if(w==0 && z!=0){
                    int g=ar.get(a-2);
                    ar.set(a-2,++g);
                    ar.set(a,z);
                }
                else if(w!=0 && z==0){
                    ar.set(a-1,w);
                    ar.add(a,1);
                    ar.add(a,1);
                    ar.remove(a+1);
                }
                System.out.println(ar.size());
                for(int x:ar)
                System.out.print(x+" ");
                //System.out.println(ar.toString());
            }

        }

    }
}