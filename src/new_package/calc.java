package new_package;

public class calc {
static double a,b,sum,sub;
public void sum(double a, double b){//non static method
	sum=a+b;
	System.out.println("sum = "+sum);
}
public static double sub(double a, double b){//static method accepts only static variables
	return a-b;
	//System.out.println("sub = "+sub);
}
}
