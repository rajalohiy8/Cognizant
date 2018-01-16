package intermediate.cognizant;
import java.util.Scanner;
public class NumberToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
String[] M=new String[]{"","M","MM","MMM"};
String[] D=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
String[] C=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String[] L=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};

String Thousand=M[num/1000];
String housand=D[(num%1000)/100];
String tens=C[(num%100)/10];
String ones=L[(num%10)];
System.out.println(Thousand+housand+tens+ones);

	}

}
