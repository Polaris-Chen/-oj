package acm1002;
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if(n==0){break;}
            n++;
            String[] a = new String[n];
            String[] b = new String[n];
            int[] c = new int[n];
            int max = 1;
            int end = 1;
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextLine();
                b[i] = a[i];
            }
            for (int j = 0; j < n; j++) {
                for (int i = j; i < n; i++) {
                    if (b[j].equals(a[i])) {
                        c[j]++;
                    }
                }
                if (c[j] > max) {
                    max = c[j];
                    end = j;
                }
            }
            System.out.println(a[end]);
            
        }
 cin.close();
    }
}
