2)Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
  
  
  
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		List<Integer> ll=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
		    l.add(sc.nextInt());
		}
		
		for(int i=0;i<n;i++)
		{
		    int fact=1;
		    for(int j=0;j<n;j++)
		    {
		        if(i!=j)
		        {
		            fact=fact*l.get(j);
		        }
		    }
		    ll.add(fact);
		}
		System.out.println(ll);
	}
}
