package new_package;

import java.util.Scanner;

public class Exception_handling {
	public static int a,b,c;
	public double div(int a, int b){
		this.a=a;
		this.b=b;
		//int c=1;
		
		try{
			 System.out.println("hjjhhhk");
			c=a/b;
			
		}
		catch(Exception e){
			System.out.println("kk"+e.getMessage());
	}
		finally{//Code in finally block will definately execute
			System.out.println("this finally");
			Scanner sc=new Scanner(System.in);
	 		System.out.println("Enter x");
			a=sc.nextInt();
			System.out.println("Enter y");
			b=sc.nextInt();
		}
		
		return c;
	}// this topic needs to be asked to rakesh sir
	public static void main(String[] args) {
		Exception_handling obj = new Exception_handling(); 

		//obj.div(5,5);
				System.out.println("division "+ (obj.div(a, b)));
				//System.out.println("addition");
	}

}
// there are 2 types of exception 
//runtime/unchecked and compile/checked time exception
