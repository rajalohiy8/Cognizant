package basic.DP;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	  static int lis(int arr[],int n)
	    {
	          int lis[] = new int[n];
	          int i,j,max = 0;
	          
	 
	          /* Initialize LIS values for all indexes */
	           for ( i = 0; i < n; i++ )
	              lis[i] = 1;
	 
	           /* Compute optimized LIS values in bottom up manner */
	           for ( i = 1; i < n; i++ )
	              for ( j = 0; j < i; j++ ) 
	                         if ( arr[i] > arr[j] && lis[i] < lis[j] + 1)
	                         
	                    lis[i] = lis[j] + 1;
	                    
	                        
	           /* Pick maximum of all LIS values */
	           for ( i = 0; i < n; i++ )
	              if ( max < lis[i] )
	                 max = lis[i];
	
	            return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Length of lis is " + lis( arr, n ));
		/*Scanner scan=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int num=scan.nextInt();
		int max=0,count=0;
		
		for(int i=0;i<num;i++)
		{int temp=0;
			arr.add(scan.nextInt());
			temp=arr.get(i);
			if(max<temp)
			{
				max=temp;
				count=count+1;
			}
		}
		System.out.println(count);*/
		
			}

		}
