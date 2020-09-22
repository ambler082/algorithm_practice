import java.util.*;


public class Vector_pratice {

	public static void add(Vector v, String str) {
		v.add(str);
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("a");
		v.add("b");
		v.add("c");	
		System.out.println(v);

		add(v,"d");
		System.out.println(v);
	}

}
