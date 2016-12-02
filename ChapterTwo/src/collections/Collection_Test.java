package collections;

import java.util.*;

public class Collection_Test {

	public static void main(String[] args) {
		//test ArrayList
		System.out.println("test ArrayList");
		List<Integer> dyn_mas = new ArrayList<>();
		dyn_mas.add(3);
		dyn_mas.add(1);
		dyn_mas.add(3);
		dyn_mas.add(1,4);
		System.out.println(dyn_mas.size());
		System.out.println(dyn_mas);
		dyn_mas.remove(1);
		System.out.println(dyn_mas);
		ArrayList<String> str = new ArrayList<>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("E");
		str.add("A");
		System.out.println(str);
		str.remove("A");
		str.remove("A");
		str.remove("A");
		System.out.println(str);
		System.out.println(str.listIterator());
		str.add("dfsad");
		System.out.println(str);
		//test LinkedList
		System.out.println("test LinkedList");
		LinkedList<String> links = new LinkedList<>();
		links.add("one");
		links.add("two");
		links.add("free");
		links.add("four");
		System.out.println(links);
		links.add(2,"new");
		System.out.println(links);
		String s = links.element();
		System.out.println(s);
		links.offerFirst("new2");
		System.out.println(links);
		links.set(3, "new3");
		System.out.println(links);
		//test HashSet
		System.out.println("test HashSet");
		HashSet<String> hash = new HashSet<>();
		System.out.println(hash.size());
		hash.add("one");
		hash.add("two");
		hash.add("free");
		hash.add("four");
		hash.add("four");
		hash.add("four");
		System.out.println(hash);
		//test LinkedHashSet
		System.out.println("test LinkedHashSet");
		LinkedHashSet<String> linkedhash = new LinkedHashSet<>();
		linkedhash.add("one");
		linkedhash.add("two");
		linkedhash.add("free");
		linkedhash.add("four");
		linkedhash.add("four");
		linkedhash.add("four");
		System.out.println(linkedhash);
		//test TreeSet
		System.out.println("test TreeSet");
		TreeSet<Double> tree = new TreeSet<>();
		tree.add(2.8);
		tree.add(1.3);
		tree.add(5.4);
		tree.add(3.2);
		tree.add(3.2);
		System.out.println(tree);
		//test PriorityQueue
		System.out.println("test PriorityQueue");
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println(pq.size());
		pq.add(4);
		pq.add(3);
		pq.add(1);
		pq.add(5);
		pq.add(7);
		System.out.println(pq);
		System.out.println(pq.size());
		//test ArrayDeque
		System.out.println("test ArrayDeque");
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		arr.add(4);
		arr.add(3);
		arr.add(1);
		arr.add(5);
		arr.add(7);
		System.out.println(arr);
		arr.addFirst(9);
		arr.addLast(0);
		System.out.println(arr);
		//test EnumSet
		System.out.println("test EnumSet");
		EnumSet<Num> en = EnumSet.allOf(Num.class); 
		System.out.println(en);
		//Iterator
		System.out.println("Iterator");
		Iterator<Num> it = en.iterator();
		for(;it.hasNext();){
			System.out.println(it.next());
		}
	}

}
enum Num{
	One(1), Two(2), Free(3), Four(4), Five(5);
	int i;
	Num(int i){
		this.i = i;		
	}
	Num(){
		
	}
}
