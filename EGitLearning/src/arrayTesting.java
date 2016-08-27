
public class arrayTesting 
{
	public static void array1()
	{
		//Create Int array and create output to test
		int arr1[] = {10, 20, 30};
		System.out.println("The amount of elements in the array are: " + arr1.length);
		System.out.println("Third element in the array is: " + arr1[2]);
	}
	public static void array2()
	{
		//Create String array and create output to test
		String arr2[] = {"Testing", "Hello", "World"};
		System.out.println("The amount of elements in arr2 are: " + arr2.length);
	}
	public static void array3()
	{
		int[][] arr3 = 
		{
			{10, 20, 30}, {1, 3, 5}
		};
		System.out.println("Prints how many elements are in the array matrix: " + arr3.length);//Apparently each element is the group of numbers, not the numbers themselves...
		System.out.println("Prints 20 from the first element in the first array: " + arr3[0][1]);
	}
	//Copied off website, prints "caffein"
	public static void ArrayCopyDemo() {
	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
				    'i', 'n', 'a', 't', 'e', 'd' };
	        char[] copyTo = new char[7];

	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        System.out.println(copyTo);
	}
/*	public static void array4()
	{
		//create the array
		String[] arr4 = {"arrays ", "are ", "weird ", "as ", "fuck "};
		//no idea what this does
		String[] test = new String[arr4.length];
		//set the range on the array. Attempting to grab "arrays are weird"
		System.arraycopy(arr4, 0, test, 0, arr4.length);
		//print something out to a string..? Print out a new string using the range of elements in the array?
		System.out.println(test);
	}
*/
	public static void array4()
	{
		char[] arr4 = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] arrCopy = new char[3];
		System.arraycopy(arr4, 1, arrCopy, 0, 3);
		System.out.println(arrCopy);
	}
	public static void array5()
    {
        System.out.println("array5 test area...");
        int[][] arr3 = 
        {
            {10, 20, 30}, {1, 3, 5}
        };
        
        int[][] arr3c = new int[1][];
        System.arraycopy(arr3, 0, arr3c, 0, 1);

        System.out.println(arr3c[0][2]); // prints 30
        arr3[0][2] = 4321;
        System.out.println(arr3[0][2]); // prints 4321
        System.out.println(arr3c[0][2]); // prints 4321
        
        System.out.println("end array5 test area");
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
		array5();
	}
}
