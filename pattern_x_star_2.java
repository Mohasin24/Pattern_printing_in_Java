/* 
  
    1 - - - - - - - 1
    - 2 - - - - - 2 -
    - - 3 - - - 3 - -
    - - - 4 - 4 - - -
    - - - - 5 - - - -
    - - - 6 - 6 - - -
    - - 7 - - - 7 - -
    - 8 - - - - - 8 -
    9 - - - - - - - 9


  
*/
import java.lang.*;
import java.util.*;

public class pattern_x_star_2 
{   
    public static Scanner sc = new Scanner(System.in);
    public static void main(String arg[]) 
    {
        int N = 0;

        System.out.print("Enter the number :- ");
        N = sc.nextInt();

        print_X_star(N);
    }

    public static void print_X_star(int n)
    {   
        for(int i = 1; i<n*2; i++)
        {   
            for(int j = 1; j<(n*2); j++)
            {
                if(j==i || j==((n*2)-i))
                {
                    System.out.print(i+" ");
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
