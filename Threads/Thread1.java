package Threads;
public class Thread1{
	public static void main(String[] args)throws InterruptedException{
		Thread th1 = Thread.currentThread();
		System.out.println("Current thread: "+th1);
		th1.setName("New system Thread");
		System.out.println("Current thread: "+th1);
		
		Thread2 a1 = new Thread2();
		Thread2 a2 = new Thread2();
		for(int i=0;i<5;i++){
			System.out.println(i);
			th1.sleep(500);
		}
		a1.a.join();
		a2.a.join();
		System.out.println(th1.getName());	
	}
}
class Thread2 implements Runnable{
	Thread a;
	Thread2(){
		a = new Thread(this,"Demo");
		System.out.println(this);
		a.start();
	}
	public void run(){
		try{
			for(int i=0;i<5;i++){
				System.out.println(i+10);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException abc){
			System.out.println(abc);
		}
	}
}