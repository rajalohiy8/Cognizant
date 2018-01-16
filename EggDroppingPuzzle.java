package intermediate.cognizant;

import java.util.Scanner;

public class EggDroppingPuzzle {

    // A utility function to get maximum of two integers
	static int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	/* Function to get minimum number of trials needed in worst
    case with n eggs and k floors */
	static int eggDrop(int n,int k)
	{
		
		 /* A 2D table where entery eggFloor[i][j] will represent minimum
	       number of trials needed for i eggs and j floors. */
		
		int[][] arr=new int[n+1][k+1];
		int res;
	
	// We need one trial for one floor and0 trials for 0 floors
		
		for(int i=1;i<=n;i++)
		{
			arr[i][0]=0;
			arr[i][1]=1;
		}
		// We always need j trials for one egg and j floors.
	     
		for(int i=1;i<=k;i++)
		{
			arr[1][i]=i;
		}
		
		  // Fill rest of the entries in table using optimal substructure
        // property
		for(int i=2;i<=n;i++)
		{
			for(int j=2;j<=k;j++)	
			{
				arr[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++)
                {
				res=1+max(arr[i-1][x-1],arr[i][j-x]);
				if (res < arr[i][j])
                    arr[i][j] = res;
			}
		}
		
		}
		
		
		return arr[n][k];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
System.out.println(eggDrop(n,k));
	}

}
