import java.util.*;


public class Vector_pratice {

	public static void add(Vector v, String str) {
		v.add(str);
	}
	
	public static void remove(Vector v,String str){
		v.remove(str);
	}
	
	public static void remove2(Vector v,int index){
		v.remove(index);
	}
	
	public static void update(Vector v,int index,String str){
		v.set(index, str);
	}
	
	public static void print(Vector v){
		int size= v.size();
		
		if(size == 0 ){
			System.out.println("none");
		}
		else{
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		print(v);
		
		v.add("a");
		v.add("b");
		v.add("c");	

		add(v,"d");
		print(v);
		
		remove(v,"b");
		remove2(v,2);
		print(v);
		
		update(v,1,"3");
		print(v);
	}

}
