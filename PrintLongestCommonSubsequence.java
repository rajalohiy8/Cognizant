package intermediate.cognizant;
import java.util.Scanner;
public class PrintLongestCommonSubsequence {
static int max(int a,int b)
{
	return a>b?a:b;
}

static void common(char[] str11,char[] str21,int l1,int l2)
{
	int[][] lcs=new int[l1+1][l2+1];
	for(int i=0;i<=l1;i++)
	{
		for(int j=0;j<=l2;j++)
		{
			if(i==0||j==0)
				lcs[i][j]=0;
			else if(str11[i-1]==str21[j-1])
				lcs[i][j]=1+lcs[i-1][j-1];
			else
				lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
		}
	}
	
	
	int index=lcs[l1][l2];
	int temp=index;
	char[] seq=new char[index+1];
	seq[index]='\0';
	int i=l1,j=l2; 	
	while(i>0 && j>0)
	{
	if(str11[i-1]==str21[j-1])
		{seq[index-1]=str11[i-1];
	i--;
	j--;
	index--;}
	else if(lcs[i-1][j]>lcs[i][j-1])
		i--;
	else
		j--;
	}
	System.out.print("Longest common subsequence string are ");
	 for(int k=0;k<temp;k++)
         System.out.print(seq[k]);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str1=scan.nextLine();
String str2=scan.nextLine();
char[] str11=str1.toCharArray();
char[] str21=str2.toCharArray();
int l1=str1.length();
int l2=str2.length();
common(str11,str21,l1,l2);

	}

}
