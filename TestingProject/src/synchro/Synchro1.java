package synchro;
class Synchro1{
	public static void main(String[] args){
		Abc x = new Abc();
		new Syn1(x);
		new Syn2(x);
		
	}
}
class Abc {
	//int mas[]=new int[11];
	int tic=5;
	boolean sost = false;
	synchronized void put(){
		while(sost){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}	
		if (tic == 10){
			System.out.println("Massive is full");
		}
		else {
			tic++;
			System.out.println(tic);

		}	
		sost = true;
		notify();
	}
	synchronized void get(){
		while (!sost){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}	
		if (tic == 0){
			System.out.println("Massive is empty");
		}
		else {
			tic--;
			System.out.println(tic);
			//tic--;
		}
		sost = false;
		notify();
	}
}
class Syn1 implements Runnable{
	private Abc x;
	Syn1(Abc x){
		this.x=x;
		new Thread(this,"Potrebitel").start();
	}
	public void run(){
		for(int i=0;i<10;i++)
			x.put();
	}
}
class Syn2 implements Runnable{
	private Abc x;
	Syn2 (Abc x){
		this.x=x;
		new Thread(this,"Postavshik").start();
	}
	public void run(){
		for(int i=0;i<10;i++)
			x.get();
	}
}