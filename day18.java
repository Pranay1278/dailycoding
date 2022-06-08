
Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".



import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		List<Character> l=new ArrayList<>();
		int c;
		char s,d;
		int n=str.length();
		for(int i=0;i<n;i++)
		{
		    c=1;
		    s=str.charAt(i);
		    for(int j=1+i;j<n;j++)
		    {
		        d=str.charAt(j);
		        if(s==d)
		        {
		            c++;
		            i=j;
		        }
		        else
		        {
		            break;
		        }
		    }
		    System.out.print(c+""+s);
		}
	}
}
