import java.util.*;



public class HashSet_pratice {

	public static void add(HashSet set,Object o){
		set.add(o);
	}

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(1);
		
		System.out.println(set);
		
		add(set,"a");
		add(set,7);
		System.out.println(set);
	}

}
