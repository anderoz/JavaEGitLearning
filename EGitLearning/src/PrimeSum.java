import java.util.Arrays;
import java.util.List;

public class PrimeSum {
	private static Integer[] primeArray = 
	{
				2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,
				103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,
				199,211,223,227,229,233,239,241
	};
	
	private static List<Integer> primes = Arrays.asList(primeArray);
	
	
	
	private static boolean isPrime(int n)
	{
		return primes.contains(n);
	}
	
	
	/**
	 * Returns whether n can be represented as a sum of k primes.
	 * 
	 * @param n the number to check, 1 <= n <= 250
	 * @param k the number of primes n must be a sum of, 1 <= k <= 5
	 * @exception IllegalArgumentException thrown if k or n are outside of valid input ranges
	 * @return whether or not n can be represented as a sum of k primes
	 */
	public static boolean check(int n, int k)
	{
		if (k < 1 || k > 5)
			throw new IllegalArgumentException("k must be 1 <= k <= 5");
		if (n < 1 || n > 250)
			throw new IllegalArgumentException("n mubest be 1 <= n <= 250");
		
		return pcheck(n,k);
	}
	
	private static boolean pcheck(int n, int k)
	{
		if (k == 1)
			return isPrime(n);
		else
			for(int i : primes)
				return pcheck(n - i, k - 1);

		
		return false;
	}
}
