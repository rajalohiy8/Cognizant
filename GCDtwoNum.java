package basic.DP;
import java.util.Scanner;
public class GCDtwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num1=scan.nextInt();
int num2=scan.nextInt();
System.out.println("GCD of two number is ="+GCD(num1,num2));

	}
	static int GCD(int n1,int n2)
	{int gcd=0;
	if(n1==0||n2==0)
	{
		return 0;
	}
	else if(n1==n2)
	{
		return n1;
	}else if(n1>n2){
		
	return GCD(n1-n2,n2);
	}
	return GCD(n1,n2-n1);
	}

}
