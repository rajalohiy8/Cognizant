package basic.DP;

import java.util.ArrayList;
public class AllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String arr="wwfododqfhohzdwxtemd";
    ArrayList<String> tSet=new ArrayList<String>();
    for(int i=1;i<=arr.length();i++)
    {
        for(int j=0;j<=arr.length()-i;j++)
        {
            tSet.add((arr.substring(j,j+i)));
        }
    }
    System.out.println(tSet);
	}

}
 