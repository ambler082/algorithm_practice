import java.util.*;

public class Arraylist_pratice {

	public static void add(ArrayList list, String str) {
		list.add(str);
	}
	
	public static void remove(ArrayList list,String str){
		list.remove(str);
	}
	public static void remove_2(ArrayList list,int index){
		list.remove(index);
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		add(list,"a");
		System.out.println(list);
		
		remove(list,"a");
		System.out.println(list);
		
		remove_2(list,0);
		System.out.println(list);
	}

}
