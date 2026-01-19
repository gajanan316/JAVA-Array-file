
/*5Q6. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.*/





 import java.util.Scanner;
 public class Arrayf5
 {
    public static void main (String x[])
	{
		Scanner sc = new Scanner (System.in);
		int arr[]= new int[5];
		System.out.println("enter the element in Array");
		for(int i =0 ;i<arr.length ; i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Display the element in array ");
		for(int i=0 ; i< arr.length ; i++)
		{
			System.out.println(arr[i] + "  ");
		}
		
		System.out.println();
		int index =0;
		for(int i=0 ; i<arr.length ; i++)
		{
		if(arr[i]!= 0 ){
			arr [index]=arr[i];
			index++;
			
		}
		}
		if(index < arr.length)
		{
			arr[index]=0;
			index++;
		}
		for(int i=0 ; i < arr.length ; i++)
		{
			System.out.println(arr[i] + "");
		}
	
		
		
	}
 }