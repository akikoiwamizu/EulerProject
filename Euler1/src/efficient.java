public class efficient
{
	public static void main(String args[])
	{
		System.out.println(SumDivisibleBy(3) + SumDivisibleBy(5) - SumDivisibleBy(15));
		// b/c you have counted #s div by 15 twice, you need to subtract the sum of the #s divisible by 15.
	}
	
	public static int SumDivisibleBy(int n)
	{
		// O(1)
		int target = 999;
		int p = (target/n);
		return(n * (p * (p + 1)/2)); 
		
		/* O(N)
		int sum = 0;
		for(int i = 0; i < 1000; i++)
		{
			if(i % n == 0) 
				sum += i;
		}	
		return(sum);
		*/
	}
}