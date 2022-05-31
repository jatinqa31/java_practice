package new_package;

public class string_functions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Jatin is Bakshi";// string is a class in java
		String str2= "Your order number is 1234587456746 created successfully:";// string is a class in java
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.concat(" is a QA"));
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 5));
		System.out.println("character @ 7 "+ str.charAt(7));
		System.out.println("str2 length "+ str2.length());
		int len=str2.length();
		

		String str3=str2.substring(1, 22);
		System.out.println("your order no is length "+ str3.length());
		//System.out.println("difference in length "+ str3.length());
		int len3=str3.length();
		System.out.println("length "+len3);
		int lendiff = len-len3;
		System.out.println("lendiff "+lendiff);
		System.out.println("Lendiff "+ str2.substring(len3, lendiff));
		//System.out.println(str.equals(str2));
		String str1 ="jatin bakshi";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));//get difference of ascii values of strings which are compared
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.contains("Bakshi"));
		System.out.println(str.replace("Bakshi","qa"));
		String [] arr =str.split("");
		for (String i:arr){
			System.out.println(i);
		}
		//interview programs
		//how many times A is present in your name
		//convert jatin bakshi to bakshi jatin
		//reverse nitaj ishkab
		//convert capital to small & small 2 capital letters
		//replace b by x
		int sum=0;
		//how many times A is present in your name
		String avar ="a";	
		for (int j=0;j<=str.length()-1;j++){
				System.out.println(str.charAt(j));
				if(str.charAt(j)=='a'){
					sum = sum + 1;	
					//System.out.println("a is present "+ sum + " times");
				}
			}
			System.out.println("a is present "+ sum + " times");
			////convert jatin bakshi to bakshi jatin
			String s1="";
			String store1="Bakshi ";
			String store2="Jatin";
			for (int j=str.length()-1;j>=0;j--){
				
				s1=str.charAt(j)+s1;
				if(store1.equals(s1)){
					
				    store1=s1;
					s1="";}
					if(store2.equals(s1)){
						
						store2=s1;
					}
			}
			System.out.println(store1+""+store2);
		///*///reverse nitaj ihskab
			String s11="";
			for (int j=str.length()-1;j>=0;j--){
				s11= s11+str.charAt(j);
				}
				
			System.out.println(s11);
			///*///reverse nitaj ihskab
			String s12="";
			for (int j=0;j<=str.length()-1;j++){
				s12= s12+str.charAt(j);
				}
				
			System.out.println(s12);
	}
	}