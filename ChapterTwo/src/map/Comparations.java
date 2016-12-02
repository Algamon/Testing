package map;

import java.util.*;

public class Comparations {

	public static void main(String[] args) {
		Comparator<String> cc = (one,two) ->{int x,y;
		x = one.lastIndexOf(" ");
		y = two.lastIndexOf(" ");
		return one.substring(x).compareToIgnoreCase(two.substring(y));};
		Comparator<String> xcl = (a,b) -> a.compareTo(b); 
		TreeMap<String,Double> map = new TreeMap<>(cc.thenComparing(xcl));
		map.put("Valentin Barsukov", 60000.0);
		map.put("Ilya Bro", 90000.0);
		map.put("Dmitriy Goblin", 30000.0);
		map.put("Alexey Such", 18000.0);
		map.put("Konstantin Eblo", -500.0);
		Set<Map.Entry<String, Double>> mapSet = map.entrySet();
		for(Map.Entry<String, Double>xx: mapSet)
			System.out.println(xx.getKey()+" "+xx.getValue());
		}

}
