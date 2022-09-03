/*
hollow square
    * * * * *
    *       *
    *       *
    * * * * * 
*/

import java.lang.*;

class pattern2 
{
    public static void main(String arg[])
    {
        int r = 4;
        int c = 5;

        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                if(i==0 || j==0 || i==r-1 || j==r)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }    
}
