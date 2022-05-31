package new_package;

public class staticnonstatic {

	/**
	 * @param args
	 */
	static double a=9.6,b=3.3,sum=23;
	public static double sum(double a, double b){
		double sum;
		return sum=a+b;
	}
	public void main() {
		// TODO Auto-generated method stub
		/*calc sum1= new calc();
		sum1.sum(12.4,12.5);
		sum1.sub(12.9,12.4);
		*/	
		//double sum;
		sum=a+b;
		System.out.println(sum);
		calc.sub(12.6,11.3);
		//calc.sum(12.6,11.3);
		sum(21.2,12.3);
		System.out.println(" sum main "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*calc sum1= new calc();
		sum1.sum(12.4,12.5);
		sum1.sub(12.9,12.4);
		*/	
		//double sum;
		sum=a+b;
		System.out.println("Sum static " + sum);
		calc.sub(12.6,11.3);
		//calc.sum(12.6,11.3);
		sum(21.2,12.3);
		System.out.println(" sum "+sum);//static
		staticnonstatic obj2= new staticnonstatic();
		System.out.println("using object "+obj2.sum(4, 7.5));//non static
	}
	
//static method can call static variable directly.
//static method,variable can be called without creating object.
}
