package basic.DP;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LongestIncreSubseqSum {
	    static int maxSumIS( int arr[], int n )
	    {
	        int i, j, max = 0;
	        int msis[] = new int[n];
	 
	        /* Initialize msis values for all indexes */
	        for ( i = 0; i < n; i++ )
	            msis[i] = arr[i];
	 
	        /* Compute maximum sum values in bottom up manner */
	        for ( i = 1; i < n; i++ )
	            for ( j = 0; j < i; j++ )
	                if ( arr[i] > arr[j] &&
	                     msis[i] < msis[j] + arr[i])
	                    msis[i] = msis[j] + arr[i];
	 
	        /* Pick maximum of all msis values */
	        for ( i = 0; i < n; i++ )
	            if ( max < msis[i] )
	                max = msis[i];
	 
	        return max;
	    }
	 
	    public static void main(String[] args) {
	       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	   Scanner scan=new Scanner(System.in);
	        int num=scan.nextInt();
	        int[] num1=new int[num];
	        for(int i=0;i<num;i++)
	        {
	            num1[i]=scan.nextInt();
	        }
	       
	        System.out.println(maxSumIS(num1,num));
	    }
	}
