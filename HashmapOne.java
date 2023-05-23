import java.util.HashMap;
import java.util.Set;

public class HashmapOne {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		System.out.println("Add elemet to Hashmap");
		map.put(1,"Apple");
		map.put(2,"Banana");
		map.put(3,"Orange");
		map.put(4,"Grape");
		map.put(5,"Mango");
		map.put(6,"Cherry");
		System.out.println(" Display all the element");
		Set<Integer> set = map.keySet();
		for( int a:set) {
			String st = map.get(a);
			System.out.println(a+" --> "+st);
		}
		System.out.println("Remove a element");
		map.remove(4);
		for( int a:set) {
			String st = map.get(a);
			System.out.println(a+" --> "+st);
		}
		
	}

}
