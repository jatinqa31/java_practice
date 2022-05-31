package new_package;

public class Encapsulation {
private int b=5;
private String emp_name="jatin";
private int sal=1000;

public void setname(String name){
	this.emp_name=name;
}

public String getname(){
	return emp_name;
}
}
//raping/hiding the data into single unit
//all member varibales are set as private
//and use by getter & setter methods