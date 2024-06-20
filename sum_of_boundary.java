/* Calculating sum of boundary elements 
in a matrix
*/
import java.util.*;
class sum_of_boundary
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and column");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[100][100];
        int sum=0;
        System.out.println("Enter elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                if(i==0||i==(m-1)||j==0||j==(n-1))
                {
                    sum=sum+a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
