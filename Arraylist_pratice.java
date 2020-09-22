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
	
	public static void update(ArrayList list,int index,String str){
		list.set(index, str);
	}
	
	public static void print(ArrayList list){
		int size= list.size();
		
		if(size == 0 ){
			System.out.println("none");
		}
		else{
			System.out.println(list);
		}
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList<String>();
		
		print(list);
		
		add(list,"a");
		add(list,"b");
		add(list,"c");
		print(list);
		
		remove(list,"a");
		print(list);
		
		remove_2(list,0);
		print(list);
		
		update(list,0,"d");
		System.out.println(list);
	}

}
