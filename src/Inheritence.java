
public class Inheritence extends overloading {
	public Inheritence(int x, int y){
		
		super(x,y);// is used 2 initialize or call parent constructor

		System.out.println("Inheritence constructor =" +y);
	}
	public void div(){
		super.area(6, 7);
		System.out.println("We are in div");
	
	}
	public void area(int a){
		System.out.println("This is area method from inheritence class");
	}
}


