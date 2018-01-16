package basic.DP;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class LongComseqSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

//Input String

StringBuffer str1=new StringBuffer(scan.nextLine());
StringBuffer str2=new StringBuffer(scan.nextLine());

//remove duplicate character from string and converted into tree array

TreeSet<String> set=new TreeSet<String>((Arrays.asList(str1.toString().split("(?!^)"))));
TreeSet<String> set1=new TreeSet<String>((Arrays.asList(str2.toString().split("(?!^)"))));

//add length of both string after duplication delete
StringBuffer str3=new StringBuffer();
int len1=set.size()+set1.size();

// Store same character in str3
for (String element : set){
    str3.append((set1.contains(element) ?element:""));
 } 
//add both string in tree  and remove duplicate and check length

set1.addAll(set);
int len=set1.size();

System.out.println("Longest Common Sequence Length = "+(len1-len)+ " of seqence "+ str3);
	}

}
	