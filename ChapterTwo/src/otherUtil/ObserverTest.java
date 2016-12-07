package otherUtil;

import java.util.*;

class Watcher implements Observer{

	@Override
    public void update(Observable a, Object b){
		System.out.println(((Integer) b).intValue());
	}
}
class BeingWatcher extends Observable{
	void meth(){
		for(int i=0;i<100;i++){
			if(i%2==0){
				setChanged();
				notifyObservers(new Integer(i));
			}
			
		}
	}
}
public class ObserverTest {

	public static void main(String[] args) {
		BeingWatcher bg = new BeingWatcher();
		Watcher wt = new Watcher();
		bg.addObserver(wt);
		bg.meth();
		System.out.println('\7');
	}

}
