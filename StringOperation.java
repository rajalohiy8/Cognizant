package intermediate.cognizant;
import java.util.*;
import java.lang.*;

public class StringOperation {

		public static void main(String args[])
		{
			StringBuffer s= new StringBuffer();
			Scanner in= new Scanner(System.in);
			s.append(in.nextLine());
			int q=in.nextInt();
			for(int i=1;i<=q;i++)
			{
				int ind=in.nextInt();
				char ch=in.next().charAt(0);
				s.setCharAt(ind-1,ch);
			}
			StringBuffer str=new StringBuffer(s);
			int m=in.nextInt();
			for(int i=1;i<=m;i++)
			{
				int a=in.nextInt(),b=in.nextInt(),ans=0;
				StringBuffer upd=new StringBuffer();
				upd.append(s.substring(a-1,b));
				upd.reverse();
				s.replace(a-1,b,upd.toString());
			}
			int ans=0;
			System.out.println(str);
			System.out.println(s);
			for(int i=0;i<s.length();i++)
			{
				if(str.charAt(i)==s.charAt(i))
					ans++;
			}
			System.out.println(ans);
		}
	}
