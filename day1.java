1)Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.






import java.util.*;
class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int s=1;
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                {
                    s=s*a[j];
                    
                }
            }
            l.add(s);
        }
        System.out.println(l);
    }
}
