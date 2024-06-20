/*Stack implementation using java
*/
import java.util.*;
class stack
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of stack");
        int n=sc.nextInt();
        int i=0,num;
        int a[]=new int[n];
        int ch=0;
        do
        {
        System.out.println("Enter choice");
        System.out.println("1.to push");
        System.out.println("2.to pop");
        System.out.println("3.to display");
        System.out.println("4.to peek");
        System.out.println("5.to exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                if(i<n)
                {
                   System.out.println("Enter element to push");
                   num=sc.nextInt();
                   a[i]=num;
                   i++;
                   break;
                }
                else
                {
                    System.out.println("Stack overflow");
                    break;
                }
            case 2:
                if(i>0)
                {
                  System.out.println("Top element is poped "+a[i-1]);
                  i--;
                  break;
                }
                else
                {
                    System.out.println("Stack underflow");
                    break;
                }
            case 3:
                if(i>0)
                {
                    System.out.print("Current stack holds:");
                    for(int j=0;j<i;j++)
                    {
                        System.out.print(" "+a[j]);
                    }
                    System.out.println();
                    break;
                }
                else
                {
                    System.out.println("Stack is empty");
                    break;
                }
            case 4:
                if(i>0)
                {
                    System.out.println("Top element is "+a[i-1]);
                    break;
                }
                else
                {
                    System.out.println("Stack is empty");
                    break;
                }
            case 5:
                System.out.println("Stack closed");
            default:
                System.out.println("Wrong input");
                break;
            }
        }while(ch!=5);
    }
}
