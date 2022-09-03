/*
Print the following pattern
    * * * * *
    * * * * *
    * * * * *
    * * * * *

*/

import java.lang.*;

class pattern1
{
    public static void main(String arg[])
    {
        int num = 5;

        for(int i=0; i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}