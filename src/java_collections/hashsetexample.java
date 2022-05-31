package java_collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs= new HashSet<String>();
		hs.add("jack");
		hs.add("dawson");
		Iterator<String> i = hs.iterator();
		System.out.println(" next value " +i.next());
	}

}
