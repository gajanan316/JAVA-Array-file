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


 /*  import java.util.Scanner ;
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
   
   Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.*/

/*  import java.util.Scanner ;
  public class Array3   // class name 
  {
	  public static void main(String x[])  // main method 
	  {
		  Scanner sc = new Scanner (System.in);   // scanner is use to import 
		  int arr[] = new int [6];  // here we decclear array length 6 
		  System.out.println("Enter the element in array ");  // heere we enter the array 
		  for (int i= 0 ; i < arr.length ; i++)  // for loop is use for iteration 
		  {
			  arr[i] = sc.nextInt();
		  }
		  System.out.println("Display the element in array "); // here we display the array 
		   for (int i = 0 ; i< arr.length ; i++)
		   {
			   System.out.print(+arr[i]);
		   }
		   System.out.println("Display the even number");
		   for (int i = 0 ; i < arr.length ; i++)
		   {
			   if(arr[i] % 2 == 0)                    // this logic give even element 
			   {
				   System.out.print("even element  "+arr[i]);   // here we print even number 
			   }
			  
			   }
			   System.out.println();   // to come in next line 
			   
			   System.out.print("print odd values ");  // give massage to odd number 
			   
			   for(int i=0 ; i < arr.length ; i++)  // loop is work performing  iteration on it 
			   {
				   if(arr[i]% 2 != 0)
				   {
					   System.out.print(arr[i]+ " ");  // display the array of odd values 
				   }
			   }
			   
		   }
		  
	  }
	  Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.   */


   import java .util.Scanner ;
    public class Array4
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner (System.in);
			int arr[] = new int [6];
			
			System.out.println("Enter the element ");
			for(int i=0 ; i< arr.length ; i++)
			{
				arr[i]= sc.nextInt();
			}
			System.out.println("Display element ");
			for(int i=0 ;i < arr.length ; i++)
			{
				System.out.print( arr[i] + " ");
			}
			 System.out.println("Display the even element ");
			 for(int i=0 ; i < arr.length ; i++)
			 {    if(i %2 == 0) 
				 
				 {
					 System.out.println(arr[i] + " ");
				 }
				 
			 }
			 System.out.println();
			 System.out.println("Display the odd values in ");
			for(int i= 0 ; i < arr.length ; i++)
			{
			     if(i % 2 != 0)
			{
				System.out.println(arr[i] + " ");
			}
			}
		}
	}

  


