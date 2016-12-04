package map;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		//test HashMap
		HashMap<String,Double> money = new HashMap<>();
		money.put("Anatol", 50.0);
		money.put("Vanadii", 100000.0);
		money.put("Osluha", -300.0);
		System.out.println(money);
		Double mmm = money.get("Vanadii");
		System.out.println("Vanadii having: "+mmm+"$ money");
		System.out.println();
		//test TreeMap
		TreeMap<Integer,String> db = new TreeMap<>(new MyComp());
		System.out.println("Test TreeMap with new Comparator");
		db.put(3, "Vanadii");
		db.put(1, "Osluha");
		db.put(2, "Anatol");
		System.out.println(db);
		System.out.println(db.lastEntry());
		System.out.println();
		//test LinkedHashMap
		LinkedHashMap<String,Double> moneyLinked = new LinkedHashMap<>();
		moneyLinked.put("Anatol", 50.0);
		moneyLinked.put("Vanadii", 100000.0);
		moneyLinked.put("Osluha", -300.0);
		System.out.println(moneyLinked);
		Double mmmLinked = money.get("Vanadii");
		System.out.println("Vanadii having: "+mmmLinked+"$ money");
		System.out.println();
		//testa IdentytyHashMap ne budet
		//test EnumMap
		EnumMap<Test,Double> enn = new EnumMap<>(Test.class);
		enn.put(Test.Anatol,50.0);
		System.out.println(enn);
		System.out.println();
		//test lambda comparator
		TreeMap<Integer,String> lam = new TreeMap<>((a,b)->a.compareTo(b));
		lam.putAll(db);
		System.out.println(lam);
		System.out.println(010);

	}
	
}
enum Test{
	Anatol(50.0),Vanadii(100000.0),Osluha(-300);
	double i;
	Test(double i){
		this.i=i;
	}
	
}
class MyComp implements Comparator<Integer>{
	public int compare(Integer a,Integer b){
		Integer x,y;
		x=a;y=b;
		return y.compareTo(x);
		
	}
}
