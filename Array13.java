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


  /* import java .util.Scanner ;      // scanner class taking inut from user 
    public class Array4                 // class name 
	{
		public static void main (String x[])    //main method
		{
			Scanner sc = new Scanner (System.in);   // create scanner 
			int arr[] = new int [6];                // declear array of size 6 
			
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
			 {    if(i %2 == 0)     //  cleck weather the index is even 
				 
				 {
					 System.out.println(arr[i] + " ");
				 }
				 
			 }
			 System.out.println();
			 System.out.println("Display the odd values in ");
			for(int i= 0 ; i < arr.length ; i++)
			{
			     if(i % 2 != 0)   // cleck weather index is odd 
			{
				System.out.println(arr[i] + " ");
			}
			}
		}
	}
	
	
	 Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.*/

  /* import java .util.Scanner ;
   public class Array5
   {
	   public static void main (String x[])
	   {
		   Scanner sc = new Scanner (System.in);
		   int  arr[] = new int [7];
		   System.out.println("Enter the element in the array");
		   for (int i =0 ; i < arr.length ; i++)
		   {
			   arr[i] = sc.nextInt();
		   }
		   System.out.println("Display the element ");
		   for(int i = 0 ;i < arr.length ; i++)
		   {
			   System.out.print(arr[i]+ " ");
		   }
		   System.out.print("the evencount is");
		   int evencount = 0;
		   int oddcount = 0 ;
		   
		   for (int i= 0 ; i < arr.length ; i++)
		   {
			   if(arr[i] % 2 == 0 )
			   {
				   evencount++;
			   }
			   else
				   oddcount++;
		   }
		   System.out.println( evencount+ " ");
		   System.out.println( oddcount + " ");
	   }	   
   }*/
    /*  import java.util.Scanner;

public class Array5
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];

        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Display the elements:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int evencount = 0;
        int oddcount = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }

        System.out.println("Count of Even Values = " + evencount);
        System.out.println("Count of Odd Values = " + oddcount);
    }
}
     Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print
 "found" with index; otherwise print "not found".*/

 /*  import java.util.Scanner;
   public class Array6
   {
	   public static void main (String x[])
	   {
		   Scanner sc = new Scanner (System.in);
		   int arr[] = new int [5];
		   
		   System.out.println("Enter the element ");
		   for(int i=0 ; i < arr.length ; i++)
		   {
			   arr[i] = sc.nextInt();
		   }
		   System.out.println("Display the number ");
		   for(int i=0 ; i< arr.length ;i++)
		   {
			   System.out.println(arr[i]+" ");
		   }
		   boolean  found = false;
		   int skey ;
		   System.out.println("Enter the search key");
		    skey = sc.nextInt();
		   
		   for(int i=0 ;i<arr.length ; i++)
		   {
			  if( arr[i] == skey) 
			  {  
		         
				  System.out.println("found skey" + skey + i );
				  found = true;
				  break;
			  }
		   }
			  if (found == false )
			  {
				  System.out.println("not found");
			  }
			   
		   
			   
	   }
   }
    

   Q7. Write a java program to display the reverse array.

Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end to the start.   */

 /* import java.util.Scanner ;
  public class Array7
  {
	  public static void main (String x[])
	  {
		  Scanner sc = new Scanner (System.in);
		  int arr[] = new int [5];
		  System.out.println("Enter the Element ");
		  for(int i = 0 ; i< arr.length ; i++)
		  {
		  arr[i] = sc.nextInt();
		  }
		  
		  System.out.println("Display the Element ");
		  for (int i = 0 ; i < arr.length ; i++)
		  
	     {
			 System.out.print( arr[i] + "  ");
		 }
		 System.out.print("reverse array is ");
		 
		 for(int i = arr.length-1 ; i>=0 ; i--)
			 
		 {
			 System.out.print(arr[i]+ " ");
		 }
		  
	  }
	  
  }
  
   Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.*/
    /* import java.util.Scanner ;
	 public class Array8
	 {
		 public static void main (String x[])
		 {
			 Scanner sc = new Scanner (System.in);
			 int arr[] = new int [5];
			 
			 System.out.println("Enter the element in the ");
			 for(int i=0 ; i<arr.length ; i++)
			 {
				 arr[i] = sc.nextInt();
			 }
			 System.out.print("Display the array element ");
			 for (int i= 0 ; i< arr.length ; i++)
			 {
				 System.out.println(arr[i]  + "   ");
			 }
			 System.out.println();
			 
			 System.out.print("findin the missing elment ");
			 int max = 7;
			 for (int i = 1 ; i <= max ; i++)
			 {
				 boolean found = false ;
				 for(int j=0 ; j < arr.length ; j++)
				 {
					 if (arr[j] == i)
					 {
						 found= true;
						 break;
					 }
				 }
				 if (found == false)
				 {
					 System.out.print(i+ " ");
				 }
			 }
		 }
	 }
   Q9. Write a java program to copy one array to another array.
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.*/

  /* import java.util.Scanner;
   public class Array9
   {
	   public static void main (String x[])
	   {
		   Scanner sc = new Scanner (System.in);
		   int arr1[] = new int [4] ;
		   int arr2[]= new int [4];
		   
		   System.out.println("Enter the element in array");
		   for(int i= 0 ; i < arr1.length ; i++)
		   {
			   arr1[i] =sc.nextInt();
			   
		   }
		   System.out.print("display the element ");
		   for(int i= 0 ;i < arr1.length ; i++)
		   {
			   System.out.print(arr1[i] + " ");
		   }
		   System.out.println();
		   for(int i=0 ; i< arr1.length ; i++ )
		   {
			   arr2[i] = arr1[i];
		   }
		   for(int i=0 ; i < arr2.length ; i++)
		   {
		   System.out.print(arr2[i] + " arr2[]");
		   }
		   
		   
	   }
   }
   Q10. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5*/
	
	 /*import java.util.Scanner;
	 public class Array10
	 {
		 public static void main (String x[])
		 {
			 Scanner sc = new Scanner (System.in);
			 int arr[] = new int [5];
			 
			 System.out.println("Enter the element in array");
			 for(int i=0 ; i< arr.length ; i++)
			 {
			 arr[i] = sc.nextInt();
			 }
			 System.out.println("Display the element in  array ");
			 for(int i=0 ; i< arr.length ; i++)
			 {
				 System.out.println(arr[i]+ "  ");
			 }
			 System.out.println();
			 int dele = sc.nextInt();
			 for(int i= dele-1 ; i< arr.length-1 ;i++)
			 {
				 arr[i]= arr[i+1];
			 }
			 System.out.println("Enter the sholisted ");
			 for (int i=0 ; i < arr.length-1; i++)
			 {
				 System.out.println(arr[i]);
			 }
			 
			 
		 }
	 }
            Q11. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).*/

  /*   import java.util.Scanner ;
	 public class Array11
	 {
		 public static void main (String x[])
		 {
			 Scanner sc = new Scanner (System.in);
			int  arr[] = new int [6];
			 System.out.print("Enter the element ");
			 for(int i = 0 ; i < arr.length ; i++)
			 {
				 arr[i] = sc.nextInt();
				 
			 }
			 System.out.println("Display the element of array ");
			 for (int i = 0 ; i < arr.length ; i++ )
			 {
				 System.out.println(arr[i] + " ");
			 }
			 System.out.println();
			 int max = arr[0] , second = arr[0];
			 
			 for(int i=0 ; i<arr.length ; i++)
			 {
				 if (arr[i]> max)
				 {
				   second = max ;
				   max = arr[i];
				 }
				 else if(arr[i] > second && arr[i]!= max)
				 {
					second = arr[i]; 
				 }
				
			 }
			  System.out.println( second +" ");
		 }
	 }

       Q12. Write a program in java to insert an element at desired position from an array.
	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value :      200

	Expected Output : The new list is : 1 2 200 3 4 5  */
	
	/*import java.util.Scanner;
	public class Array12
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner (System.in);
			int arr[]= new int [6];
			System.out.print("Enter the element in the array ");
			for(int i=0 ; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
			System.out.println("Display the  element ");
			for(int i=0 ; i<arr.length ; i++)
			{
				Syatem.out.println(arr[i]+" ");
			}*/
			/*import java.util.*;
public class Array12
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
      int a[]=new int[6];
	  System.out.println("Enter values in array");
	  for(int i=0; i<(a.length-1);i++)
	  { a[i]=xyz.nextInt();
	  }
	  System.out.println("Enter index and value");
	  int index=xyz.nextInt();
	  int value=xyz.nextInt();
	  System.out.println("Array before insert \n");
	  for(int i=0; i<a.length;i++)
	  { System.out.printf("a[%d]---->%d\n",i,a[i]);
	  }
	  //index shifting logics 
	  for(int i=(a.length-2); i>=index;i--)
	  {  
	     a[i+1]=a[i];
	  }
	  a[index]=value;
	   System.out.println("Array after insert \n");
	  for(int i=0; i<a.length;i++)
	  { System.out.printf("a[%d]---->%d\n",i,a[i]);
	  }

			
			
		}
	}*/
	/*Q13. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.*/

 /* import java.util.Scanner ;
  public class Array13
  {
	  public static void main (String x[])
	  {
		  Scanner sc =new Scanner (System.in);
		  int arr[] = new int[7];
		  System.out.println("Enter the element in array ");
		  for(int i=0 ; i < arr.length ;i++)
		  {
			  arr[i]= sc.nextInt();
		  }
		  System.out.println("Display the array element ");
		  for(int i = 0 ; i < arr.length ; i++)
		  {
			  System.out.println(arr[i]+ " ");
			  
		  }
		     System.out.println();
			 int count = 0 ;
			 for(int i=0 ; i<arr.length ; i++)
			 {
				 if(arr[i]!= 0)
				 {
					 count++;
					 
				 }
				
			 }
			 int newarr[] = new int [count];
			 int index =0;
			 for(int i=0 ; i< arr.length ; i++)
			 {
				 if (arr[i] != 0)
				 {
					 newarr[index]= arr[i];
					 index++;
				 }
			 }
			 for (int i=0 ; i < newarr.length ;i++)
			 {
			 System.out.print(newarr[i]+" ");
			 }
	  }
  }*/
  
 /* import java.util.Scanner;
  public class Array13
  {
	  public static void main (String x[])
	  {
		  Scanner sc = new Scanner (System.in);
		  int arr[] = new int[7];
		  System.out.print("Enter the element in array ");
		  for(int  i=0 ; i< arr.length ; i++)
		  {
			  arr[i]= sc.nextInt();
		  }
		  System.out.println("display the element in array");
		  for(int i =0 ; i < arr.length ; i++)
		  {
			  System.out.println( arr[i] + " " );
		  }
		  System.out.println();
		  int count = 0 ;
		  for(int i =0 ; i< arr.length ; i++)
		  {
			  if(arr[i]!= 0)
				  count++;
		  }
		  int index =0;
		  int newarr[] = new int [count];
		  for(int i =0 ; i< arr.length ; i++)
		  {
			  if(arr[i]!= 0)
			  {
				  newarr[index]= arr[i];
				  index++;
			  }
		  }
		  
		  for(int i=0 ; i < newarr.length ; i++)
		  {
			  System.out.print(newarr[i]+ " ");
		  }
		 
	  }
  }*/
  
 /* Q14.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if an element already exists before adding to the result, thus avoiding duplicates.*/

   import java.util.Scanner;
   public class Array14
   {
	   public static void main (String x[])
	   {
		   Scanner sc = new Scanner (System.in);
		   int arr[] = new int [7];
		   System.out.println("Enter the element in array");
		   for(int i= 0 i <  arr.length ; i++)
		   {
			   arr[i]= sc.nextInt();
		   }
		   System.out.println("Display the element in array");
		   for(int i =0 ; i < arr.length ; i++)
		   {
			   System.out.println(arr[i]+"");
			   
		   }
		   System.out.println("identyfy the unique elemennt ");
		   for(int i=0 ; i< arr.length ; i++){
		    boolean duplicate= false ;
			for(int j =0 ; j < i ; j++)
			{
				if(arr[i]== arr[j])
				{
					duplicate = true;
					break;
				}
			}
		     if(!duplicate )
			{
				System.out.print(arr[i]+"  ");
			}
		   }
	   }
   }


