package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SampleMap {
	public static void main(String[] args) {
		String slog="Hello";
		System.out.print("Error:");
		for(int i=0;i<slog.length();i++) {
			System.out.print(slog.charAt(i) +" ");
		}
		
		
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(230676,"Mani");
		m.put(230677, "Gopal");
		m.put(230678, "Sam");
		m.put(230679, "Ap");
		m.put(230680, "Dinesh");
		
		Map<String,String> str2=Map.of("key1","value1", "key2", "value2");
				

		System.out.println(str2.get("key1"));		
		System.out.println(m.get(230676));
		m.remove(230680);
		
		if(m.containsValue("Gopal")) {
			m.remove(230677);
		}
		
		System.out.println(m.containsKey(230676));
		System.out.println(m);
		
		Set<Integer> k= m.keySet();
		for (int id:k) {
			System.out.println(id +"-" + m.get(id));
		}
		
		
		Collection<String> coll=m.values();
		for(String st:coll) {
			System.out.println(st);
			
		}
		
	}

}
