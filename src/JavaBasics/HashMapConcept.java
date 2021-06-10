package JavaBasics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("firstName", "Ali");
		hm.put("lastName", "Kali");

		System.out.println(hm.containsKey("firstName"));
		System.out.println(hm.containsValue("lastName"));

	}

}
