package intermediate.cognizant;
import java.util.Arrays;
import java.util.Scanner;
public class AndrewAndCodeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
String str=scan.nextLine();

int[] arr=new int[7];
for(int i=0;i<num;i++)
{
	if(str.charAt(i)=='c')
	{
		arr[0]++;
	}else if(str.charAt(i)=='o')
	{
		arr[1]++;
	}else if(str.charAt(i)=='d')
	{
		arr[2]++;
	}
	else if(str.charAt(i)=='e')
	{
		arr[3]++;
	}
	else if(str.charAt(i)==' ')
	{
		arr[6]++;
	}
	else if(str.charAt(i)=='u')
	{
		arr[4]++;
	}
	else if(str.charAt(i)=='t')
	{
		arr[5]++;
	}
}
arr[1]=arr[1]/2;
Arrays.sort(arr);
System.out.println(arr[0]);
	}

}
