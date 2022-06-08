For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.


import java.util.*;
public class Main
{
    static boolean isvalid(String str)
    {
        Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
		    char x=str.charAt(i);
 
            if (x=='('||x=='['||x=='{')
            {
                s.push(x);
                continue;
            }
            char check;
	        switch(x)
	        {
	            case ')':check=s.pop();
    	                if (check=='{'||check=='['){
                            return false;
    	                }
                break;
                case '}':check=s.pop();
                    if(check=='('||check=='[')
                    {
                        return false;
                    }
                break;
                case ']':check=s.pop();
                        if(check=='('||check=='{')
                        {
                            return false;
                        }
                break;
	                    
	        }
		}
		
		return false;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(!isvalid(str)){
		    System.out.println("true");
		}
		else
		{
		    System.out.println("false");
		}
	}
}
