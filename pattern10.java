/* 

                * * * * *
              * * * * *
            * * * * *
          * * * * *
        * * * * *
*/

import java.lang.*;

class pattern10 {

    public static void main(String arg[])
    {
        int n = 5;

        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<(n-1);j++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
