
public class overloading {
	public overloading(int x){
		System.out.println("Overloading constructor = " + x);
	}
	public overloading(int x,int y){
		System.out.println("Overloading constructor = "+ x +" y= " +y);
	}
	public void area(int a){
	int area=a*a;
	System.out.println("Area of square is "+area);
	}
public void area(int a,int b){
	int area=a*b;
	System.out.println("Area of rectangle is "+area);
	}
public void area(int a,int b, int c){
	int area=a*b*c;
	System.out.println("Volume of cube is "+area);
	}
//likewise we can overload a constructor
}


//1 form behaving differently in different cases is called as Polymorphism eg:- tv remote