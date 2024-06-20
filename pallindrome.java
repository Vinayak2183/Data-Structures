/* Palindrome Number
Given an integer x, return true if x is a 
palindrome, and false otherwise.
*/
class pallindrome {
    public boolean isPalindrome(int x) 
    {
        int n=x,a,rev=0;
        while(n>0)
        {
            a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }   
        if(rev==x)
        return true;
        else 
        return false;
    }
}