import java.io.*;
import java.util.*;

class temp
{
	
	public temp() {
		Scanner s, ls;
        int L, listNum = 1;
		System.out.println("Enter the list:");
        s = new Scanner(System.in);

        ls = new Scanner(s.nextLine());
        L = ls.nextInt();

        while(L > 0)
           {
              int nums[] = new int[L];

              ls = new Scanner(s.nextLine());
              for (int j = 0; j < L; j++)
                    nums[j] = ls.nextInt();

              System.out.print( "List " + listNum + " has " );
              System.out.println ( countSignificantInversions(nums) + " Significant Inversions.");
              
              listNum++;
              ls = new Scanner(s.nextLine());
              L = ls.nextInt();
           }

		
	}


         public static int countSignificantInversions(int nums[])
         {  
             int mid = nums.length/2, k;
             int countLeft, countRight, countMerge;
            
             if (nums.length <= 1) 
                return 0;

             int left[] = new int[mid];
             int right[] = new int[nums.length - mid];

             for (k = 0; k < mid; k++)
                 left[k] = nums[k];
             for (k = 0; k < nums.length - mid; k++)
                 right[k] = nums[mid+k];

             countLeft = countSignificantInversions (left);
             countRight = countSignificantInversions (right);

             int result[] = new int[nums.length];
             countMerge = mergeAndCount (left, right, result);
  
             for (k = 0; k < nums.length; k++)
                 nums[k] = result[k];

             return (countLeft + countRight + countMerge);  

         } 


        public static int mergeAndCount (int left[], int right[], int result[])
        {
            int a = 0, b = 0, count = 0, i, k=0;

            while ( ( a < left.length) && (b < right.length) )
              {
                 if ( left[a] <= right[b] )
                       result [k] = left[a++];
                 else    
                    {
                       result [k] = right[b++];
                       count += left.length - a;
                    }
                 k++;
              }

            if ( a == left.length )
               for ( i = b; i < right.length; i++)
                   result [k++] = right[i];
            else
               for ( i = a; i < left.length; i++)
                   result [k++] = left[i];

            return count;
        } 
		
		    public static void main (String args[]) 
    {
			temp SignificantInversions = new temp();
   }


} 