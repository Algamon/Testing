package otherUtil;

import java.util.*;

public class BitsSetTest {

	public static void main(String[] args) {
		BitSet bit = new BitSet(50);
		BitSet bit2 = new BitSet(50);
		for(int i = 0; i<50;i++){
			if((i%2)==0) bit.set(i); 
			if((i%3)==0) bit2.set(i);
		}
		System.out.println(bit+"\n"+bit2);
		bit.and(bit2);
		System.out.println(bit);
		bit.or(bit2);
		System.out.println(bit);
		bit.andNot(bit2);
		System.out.println(bit);
	}

}
