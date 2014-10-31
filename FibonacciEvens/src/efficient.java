public class efficient 
{

	public static void main(String[] args) {
		int firstNum = 1;
		int seqNum = 0;
		int secNum = 1;
		long length = 1000 * 4000;
		int sumEvenNum = 0;
		System.out.println("length " + length);

		while (seqNum < length) {
			seqNum += firstNum;

			if (seqNum % 2 == 0) 
			{
				sumEvenNum += seqNum;	
			}
			
			firstNum = secNum;
			secNum = seqNum;
		}
		System.out.println("even number: " + sumEvenNum);
	}
}