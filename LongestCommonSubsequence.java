package intermediate.cognizant;

import java.util.Scanner;

public class LongestCommonSubsequence {
static int common(char[] str11,char[] str21,int len1,int len2)
{int[][] lcs=new int[len1+1][len2+1];
for(int i=0;i<=len1;i++)
{
	for(int j=0;j<=len2;j++)
	{
		if(i==0||j==0)
			lcs[i][j]=0;
		else if(str11[i-1]==str21[j-1])
			lcs[i][j]=1+lcs[i-1][j-1];
		else
			lcs[i][j]=max(lcs[i][j-1],lcs[i-1][j]);
	}
}
	
	return lcs[len1][len2];
}
//return maximum value

static int max(int a,int b)
{
	return a>b?a:b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//2 string input
String str1=scan.nextLine();
String str2=scan.nextLine();

// convert string to char array

char[] str11=str1.toCharArray();
char[]  str22=str2.toCharArray();
//take length of the string

int len1=str1.length();
int len2=str2.length();
System.out.println("Length of lcs is "+common(str11,str22,len1,len2));
	}

}
