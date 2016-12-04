package otherUtil;

import java.util.*;

public class RandomTest {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		double sum=0;
		for(int i=0;i<1000000;i++){
			sum += rand.nextGaussian();
		}
		System.out.println(sum/1000000);
	}

}
