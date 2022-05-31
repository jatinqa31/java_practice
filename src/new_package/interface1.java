package new_package;

public interface interface1 extends interface2 {
//cannot declare private method
	 int Sum();
	 void Sub();
	//interface will always have unimplemented methods
	//it supports 100% implementation hide
}
/*difference interface & abstract class
1.starts with interface keyword
2.extends using interface keyword
3. always be public
4. have only unimplemented methods
5. can do multiple inheritence in interface
*/ //interface is 100% abstract