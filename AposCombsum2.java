package org.DP;
import java.util.Scanner;
class State2
{		int[] dp=new int[100];
	void initialise(){

	for(int i=0;i<100;i++)
	{
		dp[i]=-1;
	}
}
	int Statee(int n)
	{if(n<0)
	{
		return 0;
	}else if(n==0)
	{
		return 1;
	}
	else if (dp[n]!=-1) {
    return dp[n];}
		return Statee(n-1)+Statee(n-3)+Statee(n-5);
		
	}
}
public class AposCombsum2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
State2 s=new State2();
s.initialise();
System.out.println(s.Statee(n));
	}

}
