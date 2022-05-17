
return a new sorted merged list from K sorted lists, each with size N. Before we move on any further, you should take some time to think about the solution!

First, go through an example. This buys time, makes sure you understand the problem, and lets you gain some intuition for the problem. For example, if we had [[10, 15, 30], [12, 15, 20], [17, 20, 32]], the result should be [10, 12, 15, 15, 17, 20, 20, 30, 32].

Next, give any solution you can think of (even if it's brute force). It seems obvious that if we just flattened the lists and sorted it, we would get the answer we want. The time complexity for that would be O(KN log KN), since we have K * N total elements.








import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<List<Integer>> ll=new ArrayList<>();
    	for(int i=0;i<3;i++)
    	{
    	    int n=sc.nextInt();
		    List<Integer> l=new ArrayList<>();
		    for(int j=0;j<n;j++)
		    {
		        l.add(sc.nextInt());
		    }
		    ll.add(l);
    	}
    	System.out.println(ll);
    // 	System.out.println(ll +" "+Math.max(ll.size())+" "+Math.min(ll.size()));
    	
        // int a[]=new int[3][3];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<ll.size();i++)
        {
            
            l.addAll(ll.get(i));
            Collections.sort(l);
        }
        System.out.println(l);
    	
	}
}
