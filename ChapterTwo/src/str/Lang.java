package str;

//import java.io.*;

public class Lang {

	public static void main(String[] args){
		System.out.println(System.currentTimeMillis());
		Double c = new Double(1);
		c = c/0;
		System.out.println(c);
		Runtime run = Runtime.getRuntime();
		System.out.println(run);
		System.out.println(run.freeMemory());
		System.out.println(run.maxMemory());
		System.out.println(Thread.currentThread().getName());
		/*Process x = null;
		try{
			x = run.exec("calc");
		}
		catch(Exception exp){
			exp.printStackTrace();
		}
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException exc){
			exc.printStackTrace();
			
		}

		if (!x.isAlive()) System.out.println("It's alive!!1");
		try {
			x.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println(System.currentTimeMillis());

		
	}

}
