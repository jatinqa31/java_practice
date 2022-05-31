package java_collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author JATIN
 *
 */
public class arraylistexample {

	public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList();
	al.add("my");
	al.add("name");
	al.add("is");
	al.add("Jatin");
	System.out.println("value @ index 3 = "+al.get(3));
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		}
	

	HashSet hs= new HashSet<String>();
	hs.add("jack");
	hs.add("dawson");
	Iterator<String>   i   =  hs.iterator();
	System.out.println(" lets see " +i.next());
	
	}
}
