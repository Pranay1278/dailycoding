Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
  

  
  
import java.util.*;
public class Main
{
    static int fm(ArrayList<Integer> l,int n)
    {
        int s=separate(l,n);
        List<Integer> ll=new ArrayList<>();
        for(int i=s;i<(n);i++)
        {
            ll.add(l.get(i));
        }
        // System.out.println(ll);
        return fmp(ll,ll.size());
    }
    
    static int separate(ArrayList<Integer> ll,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(ll.get(i)<=0)
            {
                int t=0;
                t=ll.get(i);
                ll.set(i,ll.get(j));
                ll.set(j,t);
                j++;
            }
        }
        // System.out.println(j);
        return j;
    }
    
    
    static int fmp(List<Integer> ll,int n)
    {
        for(int i=0;i<n;i++)
        {
            int x=Math.abs(ll.get(i));
            if((x-1)<n && ll.get(x-1)>0)
            {
                ll.set(x-1,-ll.get(x-1));
            }
        }
        for(int i=0;i<n;i++)
        {
            if(ll.get(i)>0)
            {
                return i+1;
            }
        }
        return n+1;
    }
    
    
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    l.add(sc.nextInt());
		}
		int m=fm(l,n);
		System.out.println(m);
	}
}
