package intermediate.cognizant;
import java.util.Scanner;
public class PetyaAndDuckling {

	 static int getMissingNo(int a[])
	    {
	        int n = a.length;
	        for (int i=0; i<n; i++)        
	            if (a[i] != (i+1))
	                return (i+1);
	 
	        // If all numbers from 1 to n
	        // are present
	        return n+1;
	    }
	       
	    /* program to test above function */
	    public static void main(String args[])
	    {
	        Scanner scan=new Scanner(System.in);
	        int t=scan.nextInt();
	for(int i=0;i<t;i++)
	{
	 int num=scan.nextInt();
	    int[] a=new int[num-1];
	    for(int j=0;j<num-1;j++)
	    {a[j]=scan.nextInt();
	        
	    }
	    
	    

	        System.out.println(getMissingNo(a));
	}}}
