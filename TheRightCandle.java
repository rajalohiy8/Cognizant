package intermediate.cognizant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TheRightCandle {

	  public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int N=scan.nextInt();
	        ArrayList<Integer> cand=new ArrayList<Integer>();
	        for(int i=0;i<N;i++)
	        {
	            cand.add(scan.nextInt());
	            
	        }
	        Collections.sort(cand);
	        System.out.println(cand.get(1));
	       
	    }
	}