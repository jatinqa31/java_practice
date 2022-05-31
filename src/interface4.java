// One interface an extend another.
public interface interface4 {
  void meth1();
  void meth2();
  
}
  
// B now includes meth1() and meth2() -- it adds meth3().
 interface B extends interface4 {
  void meth2();  //Overriding the method in A ??
  }
  
// This class must implement all of A and B
class MyClass implements B {
  
  public void meth1() {
    System.out.println("Implement meth1()");
  }
//[B]// Which method we are implementing from A or B interface (My doubt)??[/B]
  public void meth2() {
    System.out.println("Implement meth2()");
  }
  
  public void meth3() {
    System.out.println("Implement meth3()");
  }
}
  
class IFExtend {
  public static void main(String arg[]) {
    B ob = new MyClass(); // Interface refrence variable 
    ob.meth1();
    ob.meth2(); // [B]My doubt is here, [/B]  
 // ob.meth3(); 
// Not possible to access this meth()3 as we are using an interface 
//reference variable of type B
  }
}