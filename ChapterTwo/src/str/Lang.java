package str;

public class Lang {

	public static void main(String[] args) {
		Double c = new Double(1);
		c = c/0;
		System.out.println(c);
		Runtime run = Runtime.getRuntime();
		System.out.println(run);
		System.out.println(run.freeMemory());
		System.out.println(run.maxMemory());
		System.out.println(Thread.currentThread().getName());

	}

}
