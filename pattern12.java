/*
        - - - - 1
        - - - 2 1 2
        - - 3 2 1 2 3
        - 4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
*/

import java.lang.*;

class pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                int logic = i - k + 1;
                System.out.print(logic+" ");
            }

            for (int l = 1; l < i; l++) {
                int logic = l + 1;
                System.out.print(logic+" ");
            }
            System.out.println();
        }
    }
}
