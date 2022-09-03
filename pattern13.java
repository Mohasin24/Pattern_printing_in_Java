/*
        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *
 */
import java.lang.*;

class pattern13 
{
    public static void main(String[] args) {
        int n = 4;

        // upper half
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }
            for(int j = i; j<(n-1);j++)
            {
                System.out.print("  ");
                System.out.print("  ");
            }
            for(int j = 0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower half
        for(int i = 0; i<n; i++)
        {
            for(int j = i; j<n; j++)
            {
                System.out.print("* ");
            }
            for(int j = 0; j<i;j++)
            {
                System.out.print("  ");
                System.out.print("  ");
            }
            for(int j = i; j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
}
