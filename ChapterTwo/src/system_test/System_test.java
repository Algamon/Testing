package system_test;

public class System_test implements Cloneable {
	int x = 15;
	public static void main(String[] args) throws CloneNotSupportedException {
		long start = System.nanoTime();
		for(long i=0; i<100000000L; i++);
		long end = System.nanoTime();
		System.out.println(end-start);
		System_test tst = new System_test();
		System_test tst2 = (System_test) tst.clone();
		System.out.println(tst2.x);
	}

}
