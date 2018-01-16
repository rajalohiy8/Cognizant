package basic.DP;

public class Overloading {
public int sum(int x,int y)
{
	return x+y;
	
}
public int sum(int x,int y,int z)
{
	return x+y+z;
}

public double sum(double x,double y)
{
	return x+y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading obj=new Overloading();
System.out.println(obj.sum(5, 5));
System.out.println(obj.sum(5, 6,9));
System.out.println(obj.sum(5.00, 6.00));

	}

}
