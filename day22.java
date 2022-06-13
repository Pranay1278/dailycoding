

Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. 
If there is more than one possible reconstruction,
return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", 
you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond",
return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

import java.util.*;
public class Main
{
    static void split(String s,List<String> l)
    {
        int n=s.length();
        List<String> ll=new ArrayList<>();
        int[] f=new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0+i;j<=n;j++)
            {
                int m=0;
                String str=s.substring(i,j);
                while(m<l.size())
                {
                    // System.out.println(str+" "+l.get(m));
                    if((l.get(m)).equals(str))
                    {
                        ll.add(str);
                        i=j;
                    }
                    m++;
                }
            }
            
        }
        System.out.println(ll);
    }    
	public static void main(String[] args) 
	{
		String s="thequickbrownfox";
	    String[] str={"quick", "brown", "the", "fox"};
	    List<String> l=new ArrayList<>();
	    for(String x:str)
	    {
	        l.add(x);
	    }
	    split(s,l);
	}
}
