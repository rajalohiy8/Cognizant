package intermediate.cognizant;
import java.util.Scanner;
public class PrintLongestCommonSubstring {
static String common(String s1,String s2)
{String finals="";
int[][] len=new int[s1.length()+1][s2.length()+1];
int result=0;
int row=0,col=0;
for(int i=0;i<=s1.length();i++)
{
	for(int j=0;j<=s2.length();j++)
	{
		if(i==0||j==0)
		{
			len[i][j]=0;
		}
		else if(s1.charAt(i-1)==s2.charAt(j-1))
		{
			len[i][j]=1+len[i-1][j-1];
			result=Integer.max(result,len[i][j]);
			row=i;
			col=j;
		}
		else
		{
			len[i][j]=0;
		}
	}
}

if(result==0)
{
	return finals;
}

while (len[row][col] != 0) {
    finals = s1.charAt(row - 1) + finals; 
   
     
    // move diagonally up to previous cell
    row--;
    col--;
}
	return finals;
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		System.out.println(common(str1,str2));
	}

}
