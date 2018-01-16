package basic.DP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class TwoUnsortedarray {

	public static void main(String[] args) {
		ArrayList<Integer> num1=new ArrayList<Integer>();
		
		ArrayList<Integer> num2=new ArrayList<Integer>();
		
num1.add(4);
num1.add(9);
num1.add(8);
num1.add(2);
num1.add(4);
num2.add(4);
num2.add(19);
num2.add(80);
num2.add(21);
num2.add(23);
num1.addAll(num2);
Collections.sort(num1);
System.out.println(num1);
	}

}
