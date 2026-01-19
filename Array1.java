/* import java.util.Scanner;
 public class Array5
 {
   public static void main (String x[])
   {
      Scanner sc = new Scanner(System.in);
	  int arr[] = new int [5];
	  
	  System.out.println("Enter the element in array ");
	  for(int i= 0 ; i< arr.length ; i++)
	  {
	     arr[i]= sc.nextInt();
	  }
	  System.out.println("Print array before desplaying");
	  
	  for (int i=0 ; i< arr.length ; i++)
	  {
	     System.out.println(arr[i]);
	  }
   }
 }*/
 
 /*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.*/


   import java.util.Scanner ;
   public class Array2
   {
	   public static void main (String x[])
	   {
		   Scanner sc = new Scanner (System.in);
		   int arr[] =  new int[5];
		   System.out.println("Enter the element in Array");
		    for(int i=0 ; i<arr.length ; i++)
			{
				arr[i]= sc.nextInt();
				
			}
			System.out.println("Display the  element ");
			for(int i= 0 ; i <arr.length ; i++)
			{
				System.out.println(arr[i]);
			}
			int sum = 0 ; 
			for (int i=0 ; i < arr.length ; i++)
			{
				sum += arr[i];
			}
			System.out.println(+sum);
	   }
   }
