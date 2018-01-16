package basic.DP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
ArrayList<String> str=new ArrayList<String>(Arrays.asList(scan.nextLine().split("(?!^)")));
char[] arr=new char[]{'a','e','i','o','u'};
for(int i=0;i<5;i++)
{
	str.remove(String.valueOf(arr[i]));
}
System.out.println(str);

	}

}
