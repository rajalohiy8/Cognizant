package basic.DP;

import java.util.Scanner;
public class Fibonici
{

 static int fib(int n){
	 int[] dp=new int[n+1];
	 dp[0]=0;
	 dp[1]=1;
	for(int i=2;i<=n;i++)
	{
	dp[i]=dp[i-1]+dp[i-2];
	}	
	return dp[n];
}
	public static void main(String[] args) {
int num;
Scanner scan=new Scanner(System.in);
num =scan.nextInt();
System.out.println(fib(num));
	}
}
