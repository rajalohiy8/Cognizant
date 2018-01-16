package intermediate.cognizant;

import java.util.Scanner;

public class ShidantMoney {
	public static void main(String[] args) {
		   Scanner kb= new Scanner(System.in);
		    int n=kb.nextInt();
		    int k=kb.nextInt();int c=0;int s=0;
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=kb.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]==k)
		            c++;
		    }
		    for(int i=0;i<n;i++)
		    {
		        for(int j=i;j<n-1;j++)
		    {
		            if((i+1)==(j+1))
		            {
		            if(arr[i]+arr[j+1]==k)
		                s++; }
		        }
		    }
		    System.out.println(c+s);
		}
}