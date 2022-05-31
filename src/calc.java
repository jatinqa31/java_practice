
public class calc {
static double a,b,sum,sub;
public void sum(double a, double b){//non static method
	sum=a+b;
	System.out.println(sum);
}
public static void sub(double a, double b,int c){//static method accepts only static variables
	sub=a-b;
	System.out.println(" subtract= "+sub);
}
}
