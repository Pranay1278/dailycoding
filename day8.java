[2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.




import java.util.*;

class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        int a = arr[0];
        int b = 0;
        int n1;
        int i;
 
        for (i = 1; i < n; i++) {
           n1 = Math.max(a, b);
            a = b + arr[i];
            b = n1;
        }
        System.out.println(Math.max(a, b));
    
    }
}
