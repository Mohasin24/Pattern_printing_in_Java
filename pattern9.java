/*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    
*/

import java.lang.*;

class pattern9 {
    public static void main(String arg[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
