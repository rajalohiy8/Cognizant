package intermediate.cognizant;
import java.util.Scanner;
import java.lang.Math;
public class FindUglyNumber {
static int ugly(int num)
{
	int[] ugly=new int[num];
	int l2=0,l3=0,l5=0;
	int n2=2,n3=3,n5=5;
	ugly[0]=1;
int nextUgly=1;

for(int i=1;i<num;i++)
{nextUgly=Math.min(n2,Math.min(n3, n5));

	ugly[i]=nextUgly;
	if(nextUgly==n2)
	{
		
		l2=l2+1;
		n2=ugly[l2]*2;
	}if(nextUgly==n3)
	{
		
		l3=l3+1;
		n3=ugly[l3]*3;
	}
	if(nextUgly==n5)
	{
		
		l5=l5+1;
		n5=ugly[l5]*5;
	}
}	
	return ugly[num-1];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
System.out.println(ugly(num));
}

}
