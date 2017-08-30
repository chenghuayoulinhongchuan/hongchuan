package Hanshu;

import java.util.HashMap;

public class Test03Map {
	public static void main(String[] args){
		HashMap map = new HashMap();
		map.put("s1", "a");
		map.put("s2", "b");
		System.out.println(map.get("s1"));
	}
}
