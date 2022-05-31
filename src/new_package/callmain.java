package new_package;


public class callmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		   for(int x = 1; x < 5; x = x + 1) 
		   {
		       System.out.print("value of x : " + x );
		       System.out.print("\n");
			   Encapsulation en = new Encapsulation();
			   en.setname("jatin");
			   System.out.println("Emp _ name " +en.getname());
		   }
			   overloading ovd1 = new overloading(5);	
			   overloading ovd2 = new overloading(5,5);
			   
			   ovd1.area(2, 2, 5);
			   Inheritence int1;//This declaration can be write with Classname obj = new classname
			   arithmatic_opertions ap = new arithmatic_opertions();
			   ap.pattern();
	}

}


//javac is a compiler,executes code and convert 2 class file
//class file executes on jvm.jvm converts 2 byte code.

//in jdk jre is included jre is subset of jdk + jvm is collection of jar files

//polymorphism means many forms

//Jre is a subset of jdk + Jvm is a collection of jar files