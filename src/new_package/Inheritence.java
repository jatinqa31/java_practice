package new_package;

public class Inheritence extends overloading {
	
	public Inheritence(int x, int y){
		super(x,y);
		// is used 2 initialize or call parent or super class constructor via sub class
		// one more thing is that super keyword is used within
		// constructor of sub class
		super.area(6, 7);
		super.j=66;
		System.out.println("Inheritence constructor =" +y);
	}
	
	Inheritence Ints1;
	
	public void div(){
		super.area(6, 7);
		System.out.println("We are in div");
	
	}
	public void area(int a){
		System.out.println("This is area method from inheritence class");
	}
}
//child classextends parent class
//sub class extends super class
//derived class extends base class
//types
//1. single level a>b
//2. multi level b>c
//3. multiple level A>b,c,d not possible in java available in c++
