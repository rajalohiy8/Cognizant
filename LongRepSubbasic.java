package basic.DP;

import java.util.Arrays;
import java.util.Scanner;

public class LongRepSubbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str1=new String(scan.nextLine());
		int[] arr=new int[26];
		int[]  arr1;
		
		for(int i=0;i<str1.length();i++)
		{
			arr[(int)str1.charAt(i)-97]++;}
		arr1=arr.clone();
		StringBuffer str2=new StringBuffer();
		Arrays.sort(arr1);
		int max=arr1[25];
		for(int j=0;j<26;j++)
		{
			if(arr[j]==max && max>1)
			{int k=97+j;
				str2.append((char)k);	
			}
		}
		System.out.print(str2);
	}
}
