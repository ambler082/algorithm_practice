import java.util.*;
public class ArrayList_example {

	public static void main(String[] args) {
		int size;
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		size = list.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.print("["+list.get(i)+"] ");
		}
			System.out.println();
			
		list.add("D");
		size = list.size();
		for(int i=0; i<size; i++)
		{
			System.out.print("["+list.get(i)+"] ");
		}
	}

}
