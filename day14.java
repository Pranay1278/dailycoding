

Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)
Do this in O(n) time and O(k) space. You can modify the input array in-place and you do not need to store the results. You can simply print them out as you compute them.


import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<k+1;i++)
		{
		        if(a[i]>a[i+1] && a[i]>a[i+2])
		        {
		            l.add(a[i]);
		        }
		       if(a[i+1]>a[i] && a[i+1]>a[i+2])
		       {
		           l.add(a[i+1]);
		       }
		       if(a[i+1]<a[i+2] && a[i]<a[i+2])
		       {
		           l.add(a[i+2]);
		       }
		}
		System.out.println(l);
	}
}
