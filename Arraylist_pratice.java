import java.util.*;

public class Arraylist_pratice {

	public static void add(ArrayList list, String str) {
		list.add(str);
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		add(list,"a");
		System.out.println(list);
	}

}
