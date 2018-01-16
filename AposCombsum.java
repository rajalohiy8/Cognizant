package org.DP;
import java.util.Scanner;
class State
{
	int Statee(int n)
	{if(n<0)
	{
		return 0;
	}else if(n==0)
	{
		return 1;
	}
		return Statee(n-1)+Statee(n-3)+Statee(n-5);
		
	}
}
public class AposCombsum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
State s=new State();
System.out.println(s.Statee(n));
	}

}
