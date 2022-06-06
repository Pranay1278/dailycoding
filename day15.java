A builder is looking to build a row of N houses that can be of K different colors. He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color, return the minimum cost which achieves this goal.


import java.util.*;

public class Main
{
	public static void main(String[] args) throws ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		int n=3;
		List<List<Integer>> l = Arrays.asList(Arrays.asList(1, 2, 3),Arrays.asList(1, 5, 6),Arrays.asList(6, 7, 1));
		
		int s=0;
	    for(int i=0;i<n;i++)
	    {
	        List<Integer> ll=new ArrayList<>();
	        ll.addAll(l.get(i));
	        s=s+Collections.min(ll);
	    }
	    System.out.println(s);
	}
}
