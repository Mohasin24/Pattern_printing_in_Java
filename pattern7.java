/*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/
import java.lang.*;
class pattern7 
{
    public static void main(String arg[])
    {
        int n = 5;
         
        for(int i = 0; i<n; i++)
        {
            for(int j= 1;j<=n-i;j++ )
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
