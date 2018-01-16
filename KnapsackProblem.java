package intermediate.cognizant;
import java.util.Scanner;
public class KnapsackProblem {
static int max(int a,int b)
{
	return a>b?a:b;
}
static int knapsack(int[] vall,int[] wt,int wtt,int val)
{int[][] knap=new int[val+1][wtt+1];
for(int i=0;i<=val;i++)

{
	for(int W=0;W<=wtt;W++)
	{
		if(i==0 || wtt==0)
		{
			knap[i][W]=0;
		}
		 else if (wt[i-1] <= W)
             knap[i][W] = max(vall[i-1] + knap[i-1][W-wt[i-1]],  knap[i-1][W]);
       else
             knap[i][W] = knap[i-1][W];
	}
}
	
	
	return knap[val][wtt];
}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
int val=scan.nextInt();
int[] vall=new int[val];

int[] wt=new int[val];
for(int i=0;i<val;i++)
{
	vall[i]=scan.nextInt();
}
for(int i=0;i<val;i++)
{
	wt[i]=scan.nextInt();
}
int wtt=scan.nextInt();
System.out.println(knapsack(vall,wt,wtt,val));
	}

}
