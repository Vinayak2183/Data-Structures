/*Count total number of goat and duck have combine from given number of heads and 
number of total legs
*/
import java.util.*;
public class no._of_legs
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of legs");
        int leg=sc.nextInt();
        System.out.println("Enter number of heads");
        int head=sc.nextInt();
        int goat,duck;
        int head1=head*4;
        duck=(head1-leg)/2;
        goat=head-duck;
        System.out.println("Goat"+goat);
        System.out.println("Duck"+duck);
    }
}