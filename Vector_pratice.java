import java.util.*;

public class Vector_pratice {

	public static void main(String[] args) {
		int size;
		List<String> list = new Vector<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");

		size = list.size();
		for(int i=0; i<size; i++)
		{
			System.out.print("["+list.get(i)+"] ");
		}
			System.out.println();
			
		list.add(2,"D");
		list.add(3,"E");
		size = list.size();
		for(int i=0; i<size; i++)
		{
			System.out.print("["+list.get(i)+"] ");
		}
			System.out.println();
			
		list.remove(3);
		size = list.size();
		for(int i=0; i<size; i++)
		{
			System.out.print("["+list.get(i)+"] ");
		}
			System.out.println();
	}

}
