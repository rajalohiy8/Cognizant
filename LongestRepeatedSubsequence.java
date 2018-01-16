package intermediate.cognizant;
import java.util.Arrays;
import java.util.Scanner;
public class LongestRepeatedSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
int[] arr=new int[26];
for(int i=0;i<str.length();i++)
{
	arr[(int)str.charAt(i)-97]++;
}
int[] arr2=new int[26];
arr2=arr.clone();
Arrays.sort(arr2);
int max=arr2[25];
for(int i=0;i<26;i++)
{
	if(arr[i]==max && max>1)
		System.out.print((char)(i+97));
}
	}

}
