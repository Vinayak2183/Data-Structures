/* finding the smallest Kth element in a 
array given by the user
*/
import java.util.*;
public class smallest
{
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of elemenst");
        int n=sc.nextInt();
        int a[]=new int[100];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                 int temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                }
            }
        }
        System.out.println("Enter kth smallest element");
        int k=sc.nextInt();
        System.out.println("Kth smallest element "+a[k-1]);
    }
}