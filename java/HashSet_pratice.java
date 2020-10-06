import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class HashSet_pratice {

	public static void add(HashSet set,Object o){
		set.add(o);
	}
	
	public static void remove(HashSet set,Object o){
		set.remove(o);
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(3);
		set.add(1);
		set.add("banana");
		set.add("apple");
		System.out.println(set);
		
		add(set,"a");
		add(set,7);
		add(set,1);
		System.out.println(set);
		
		List rem = new ArrayList();
		rem.add(7);
		rem.add(1);
		
		set.removeAll(rem);
		
		System.out.println(set);
	}

}
