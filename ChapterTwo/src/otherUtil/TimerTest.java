package otherUtil;

import java.util.*;

class MyTimer extends TimerTask{
	public void run(){
		System.out.println("One Two Free");
	}
}
public class TimerTest {

	public static void main(String[] args) {
		MyTimer myTimer = new MyTimer();
		Timer timer = new Timer();
		timer.schedule(myTimer, 3000);
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException exp){
			exp.printStackTrace();
		}
		timer.cancel();
	}

}
