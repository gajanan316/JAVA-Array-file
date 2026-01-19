/*Q7.Write a java program to count all pairs of elements in an array whose sum is equal to a given number.
	Input :- arr = [1, 5, 7, -1, 5]        sum = 6
Output :- 3
Explanation:
Pairs whose sum = 6 are:
(1, 5) → first occurrence
(7, -1)
(1, 5) → second occurrence (from the second 5)
Total pairs = 3*/

import java.util.Scanner;
public class Arrayf7
{
public static void main (String x[])
{
   Scanner sc = new Scanner (System.in);
   int arr[] = new int [5];
   System.out.println("Enter the array element ");
   for(int i=0 ; i< arr.length ; i++)
   {
	   arr[i] = sc.nextInt();
   }
   System.out.println("Display the element in java");
   for(int i=0 ; i<arr.length ; i++)
   {
	   System.out.println(arr[i] + " ");
   }
    System.out.println();
	int sum = 6;
	int count =0;
	for(int i=0 ; i<arr.length ; i++)
	{
		for(int j=i+1 ; j< arr.length ; j++)
		{
			if(arr[i]+arr[j]== sum)
			{
				count++;
			}
		}
		
	}
	System.out.println(count + " ");
}
}


