package new_package;

public class polymorphism {

	public void sum(){
		System.out.println("this is only sum");
	}
	public void sum(int a,int b){
		System.out.println("this is only sum");
	}
	public void sum(int a,int b,int c){
		System.out.println("this is only sum");
	}
}


//1 form behaving differently in different cases is called as Polymorphism eg:- tv remote
//Two types of polymorphism 
//1. Runtime(overriding,run time,Dynamic Binding is used in concept of inheritence) 2.compilation time(overloading,static binding)
//runtime =parent & child have same method with different signature
// this is done by jvm not compiler this is why it is called runtime polymorphism