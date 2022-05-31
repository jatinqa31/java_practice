package new_package;

public class Learn_constructor {
	public int a=5;
	public int b=6;//also called compile time polymorphism or static binding
	public Learn_constructor(){// is a method with same name as classname but it donot have return type nor void
		System.out.println("This is default constructor");//call by default when class is initialize
	// there are 2 types of constructor default and parameterised constructor
		//int sum =12;
		
	}
	public Learn_constructor(int a, int b){// is a method with same name as classname but it donot have return type nor void
		this.a=a;//this is used when there is same name of global & local variable
		this.b=b;
		//a=10;
		//b=20;
		System.out.println("This is parameterised constructor with values "+a + " and " + b);
		// there are 2 types of constructor default and parameterised constructor
	}
	
	public void sum(){
		System.out.println("this is sum="+(a+b));
	}
}
