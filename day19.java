A builder is looking to build a row of N houses that can be of K different colors. 
He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, 
return the minimum cost which achieves this goal.




import java.util.*;
public class Main
{
    static void mincount(List<List<Integer>> l,int n)
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            List<Integer> l1=new ArrayList<>();
            l1.addAll(l.get(i));
            s=s+Collections.min(l1);
        }
        System.out.println(s);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		List<List<Integer>> l=new ArrayList<>();
		for(int i=0;i<3;i++)
		{
		    List<Integer> ll=new ArrayList<>();
		    for(int j=0;j<3;j++)
		    {
		        ll.add(sc.nextInt());
		    }
		    l.add(ll);
		}
		mincount(l,l.size());
	}
}
