

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
  
  
  import java.util.*;

class Main 
{
    static int numDecodings(String s) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        if(s.length() == 1 && s.charAt(0) == '0') { 
                return 0;
            }
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(0) == '0') { 
                return 0;
            }
            else if(s.charAt(i - 1) == '0' && s.charAt(i) == '0') { 
            } 
            else if(s.charAt(i - 1) == '0' && s.charAt(i) != '0') { 
                dp[i] = dp[i - 1];
            } 
            else if(s.charAt(i - 1) != '0' && s.charAt(i) == '0') { 
                if(s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = 0;
                }
            } 
            else {                                                   
                if(Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) {
                    dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
                } else {
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[s.length() - 1];
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=String.valueOf(111);
        int t=numDecodings(s);
        System.out.println(t);
        
    }
}
