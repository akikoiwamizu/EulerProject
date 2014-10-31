public class Fib
{
	
	public static void main(String arg[])
	{
		double n = 3999999;
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			int fib = fib(i);
			if(fib(i)%2 == 0)
				sum += i;
		}
		System.out.println(sum);

	}
	
// IMPLEMENT TAIL RECURSION!
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
			return 1;
		return fib(n-1) + fib(n-2);
	}	
}