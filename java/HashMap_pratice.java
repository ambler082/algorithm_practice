import java.util.HashMap;
import java.util.Map;

public class HashMap_pratice {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m = new HashMap<>();
		
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		System.out.println(m);
		
		m.remove(1);
		m.remove("b");
		System.out.println(m);
	}

}
