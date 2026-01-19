/*Q8. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
   arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]

Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.*/


public class Arrayf8 
{
    public static void main(String x[])
    {
        // Given example arrays
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4, 5};

        // Union array size = arr1.length + arr2.length
        int union[] = new int[arr1.length + arr2.length];

        int k = 0; // k will store index for union array

        // ---------------- STEP 1: Copy arr1 elements into union ----------------
        for(int i = 0; i < arr1.length; i++)
        {
            // Iteration working:
            // i=0 → union[0] = 1
            // i=1 → union[1] = 2
            // i=2 → union[2] = 3

            union[k] = arr1[i];
            k++;
        }

        // After step 1:
        // union = [1, 2, 3, _, _, _, _]
        // k = 3 (next free position)

        // ---------------- STEP 2: Check arr2 elements and add if not duplicate ----------------
        for(int i = 0; i < arr2.length; i++)
        {
            boolean found = false;  // assume element is not present

            for(int j = 0; j < k; j++)
            {
                // Compare arr2[i] with each element of union

                if(arr2[i] == union[j])
                {
                    found = true;   // duplicate found
                    break;          // stop checking
                }
            }

            // If element not found, add it to union
            if(found == false)
            {
                union[k] = arr2[i];
                k++;
            }

            /*
            Iteration explanation:

            i = 0 → arr2[0] = 2
                   Compare with union → [1, 2, 3]
                   2 found → skip

            i = 1 → arr2[1] = 3
                   Compare with union → [1, 2, 3]
                   3 found → skip

            i = 2 → arr2[2] = 4
                   Compare with union → [1, 2, 3]
                   4 not found → add → union[3] = 4

            i = 3 → arr2[3] = 5
                   Compare with union → [1, 2, 3, 4]
                   5 not found → add → union[4] = 5
            */
        }

        // ---------------- STEP 3: Print union array ----------------
        System.out.println("Union Array:");

        for(int i = 0; i < k; i++)
        {
            // Prints only filled elements
            System.out.print(union[i] + " ");
        }

}
}
        

