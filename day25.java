You are given an array of non-negative integers that represents a two-dimensional elevation map where each element is unit-width wall and the integer is the height. 
Suppose it will rain and all spots between two walls get filled up.

Compute how many units of water remain trapped on the map in O(N) time and O(1) space.

For example, given the input [2, 1, 2], we can hold 1 unit of water in the middle.

Given the input [3, 0, 1, 3, 0, 5], we can hold 3 units in the first index, 2 in the second,

and 3 in the fourth index (we cannot hold 5 since it would run off to the left), so we can trap 8 units of water.


import java.util.*;
class Main{
public static int maxWater(List<Integer> l, int n,int m)
{
	int res = 0;
	for(int i = 1; i < n - 1; i++)
	{
		int x = l.get(i);
		for(int j = 0; j < i; j++)
		{
			x = Math.max(x, l.get(j));
		}
		res += Math.min(x, m) - l.get(i);
	}
	return res;
}
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
	List<Integer> l=new ArrayList<>();
	for(int i=0;i<n;i++)
	{
	    l.add(sc.nextInt());
	}
    int m=Collections.max(l);
	System.out.print(maxWater(l,n,m));
}
}
