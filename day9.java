
Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].




import java.util.*;

class Main 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
       List<String> l=new ArrayList<>();
       
       l.add("dog");
       l.add("deep");
       l.add("dep");
       
       for(int i=0;i<l.size();i++)
       {
           String str=l.get(i);
           String str1 =str.substring(0,2);
           if(s.equals(str1))
           {
               System.out.println(str);
           }
       }
       
        
        
        
    }
}
