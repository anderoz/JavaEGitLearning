
public class arrayTesting 
{
	public static void array1()
	{
		//Create Int array and create output to test
		int arr1[] = {10, 20, 30};
		System.out.println(arr1.length);
		System.out.println("Second element in the array is: " + arr1[2]);
	}
	public static void array2()
	{
		//Create String array and create output to test
		String arr2[] = {"Testing", "Hello", "World"};
		System.out.println(arr2.length);
	}
	public static void array3()
	{
		int[][] arr3 = 
		{
			{10, 20, 30}, {1, 3, 5}
		};
		System.out.println(arr3.length);//Apparently each element is the group of numbers, not the numbers themselves...
	}
	//Copied off website, prints "caffein"
	public static void ArrayCopyDemo() {
	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				    'i', 'n', 'a', 't', 'e', 'd' };
	        char[] copyTo = new char[7];

	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        System.out.println(new String(copyTo));
	}
	public static void array4()
	{
		//create the array
		String[] arr4 = {"arrays ", "are ", "weird ", "as ", "fuck "};
		//no idea what this does
		String[] test = new String[arr4.length];
		//set the range on the array. Attempting to grab "arrays are weird"
		System.arraycopy(arr4, 0, test, 0, arr4.length);
		//print something out to a string..? Print out a new string using the range of elements in the array?
		System.out.println();
	}
	public static void main(String[] args)
	{
		//Call the array methods to test the arrays
		array1();
		array2();
		array3();
		//Working copy from website:
		ArrayCopyDemo();
		//Broken self-written using strings instead of chars
		array4();
	}
}
