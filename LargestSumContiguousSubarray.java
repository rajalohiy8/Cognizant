package intermediate.cognizant;
import java.util.ArrayList;
import java.util.Scanner;
public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int T=scan.nextInt();
	for(int j=0;j<T;j++){		
	ArrayList<Integer> arr=new ArrayList<Integer>();

	int num=scan.nextInt();
	int max=Integer.MIN_VALUE,min=0;
	for(int i=0;i<num;i++)
	{
		arr.add(scan.nextInt());
		min=min+arr.get(i);
		if(min<0)
		{ max=max>min?max:min;
			min=0;
		}
		else if(max < min)
		{
	        max = min;
	}
	}
	System.out.println(max);
	}
		}

	}