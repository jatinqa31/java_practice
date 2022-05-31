
public class callmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Learn_constructor lc = new Learn_constructor();
		Learn_constructor lc1 = new Learn_constructor(5,4);
		//Learn_constructor lc = new Learn_constructor();
		lc.a=10;
		lc.b=5;*///ctrl+shift+forward slash
		//System.out.print("sum ");
		//lc1.sum();
		/*overloading area = new overloading();
		area.area(5);
		area.area(3, 6);
		area.area(5, 6, 7);
		*/
		implement_interface intt = new implement_interface();
		intt.div();
		intt.mul();
		Inheritence in = new Inheritence(5,3);
		in.div();
		in.area(3);//method overriding possible only in case of inheritence//runtime polymorphism / dynamic binding
		in.area(3,5);
		in.area(3,6,7);
		//polymorphism can be achive with 2 ways overriding & overloading
		reference_instance obj1 = new reference_instance();
		
		System.out.println(obj1.sum(23, 45));
		System.out.println(obj1.sum());
		Extend_abstractclass abs = new Extend_abstractclass();
		abs.qtp();
		abs.selenium();
	}

}


//javac is a compiler,executes code and convert 2 class file
//class file executes on jvm.jvm converts 2 byte code.

//in jdk jre is incuded jre is subset of jdk + jvm is collection of jar files