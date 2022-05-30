import java.util.*;

class Main {

	final static int max = 26;
        	static boolean isValid(int count[],	int k)
        	{
        		int val = 0;
        		for (int i = 0; i < max; i++)
        		{
        			if (count[i] > 0)
        			{
        				val++;
        			}
        		}
        		return (k >= val);
        	}
            	static void kUniques(String s, int k)
            	{
            		int u = 0;
            		int n = s.length();
            		int count[] = new int[max];
            		Arrays.fill(count, 0);
            		for (int i = 0; i < n; i++)
            		{
            			if (count[s.charAt(i) - 'a'] == 0)
            			{
            				u++;
            			}
            			count[s.charAt(i) - 'a']++;
            		}
            		if (u < k) {
            			System.out.print("Not enough unique characters");
            			return;
            		}
            		int curr_start = 0, curr_end = 0;
            		int max_window_size = 1;
            		int max_window_start = 0;
            		Arrays.fill(count, 0);
            		count[s.charAt(0) - 'a']++;
            		for (int i = 1; i < n; i++) {
            			count[s.charAt(i) - 'a']++;
            			curr_end++;
            			while (!isValid(count, k)) {
            				count[s.charAt(curr_start) - 'a']--;
            				curr_start++;
            			}
            			if (curr_end - curr_start + 1 > max_window_size)
            			{
            				max_window_size = curr_end - curr_start + 1;
            				max_window_start = curr_start;
            			}
            		}
            		System.out.println( s.substring(max_window_start,max_window_start + max_window_size));
            	}
	static public void main(String[] args) {
		String s = "abcba";
		int k = 2;
		kUniques(s, k);
	}
}
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".
  
  
