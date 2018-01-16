package basic.DP;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LongRepSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> map =new TreeMap<String,Integer>();
		for (char ch = 'a'; ch <= 'z'; ++ch) {
			  map.put(String.valueOf(ch), 0); 
	}
		Scanner scan=new Scanner(System.in);
		StringBuffer str1=new StringBuffer(scan.nextLine());
		ArrayList<String> arr=new ArrayList<String>((Arrays.asList(str1.toString().split("(?!^)"))));
		for(int i=0;i<arr.size();i++)
		{String current = arr.get(i);
			if(map.containsKey(current)){
            map.put(current,map.get(current)+1);
        }
		}
		int maxValueInMap=(Collections.max(map.values()));
		for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
		    if (entry.getValue()==maxValueInMap) {
		        System.out.print(entry.getKey());   
		    }
		    }
	}
}


 
