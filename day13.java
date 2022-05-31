
select the randem number

import java.util.Random;

public class Main
{
	static int res = 0; 
	static int count = 0; 
	static int selectRandom(int x)
	{
		count++; 
		if (count == 0)
			res = x;
		else
		{
			Random r = new Random();
			int i = r.nextInt(count);
			if(i == count - 1)
				res = x;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int stream[] = {1, 2, 3, 4};
		int n = stream.length;
		for(int i = 0; i < n; i++)
			System.out.println(selectRandom(stream[i]));
	}
}
