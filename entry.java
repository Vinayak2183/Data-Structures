/* Two array given consist of number of exits and entry per hour indictated by the index of array in an hall
calculate the max number of entry at what number of hour
*/
import java.util.*;
class entry
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int en[]=new int[100];
        int ex[]=new int[100];
        int sum=0,sum1=0,sub=0,left=0,time=0;
        System.out.println("Enter number of hours");
        int n=sc.nextInt();
        System.out.println("Enter number of entry");
        for(int i=0;i<n;i++)
        {
            en[i]=sc.nextInt();
        }
        System.out.println("Enter number of exit");
        for(int i=0;i<n;i++)
        {
            ex[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum1=0;
            sub=0;
            for(int j=0;j<=i;j++)
            {
                sum1=sum1+en[i];
                sub=sub+ex[i];
            }
            left=sum1-sub;
            if(left>sum)
            {
                sum=left;
                time=i;
            }
        }
        System.out.println("Maximum Student left "+sum+" at hour "+time);
    }
}