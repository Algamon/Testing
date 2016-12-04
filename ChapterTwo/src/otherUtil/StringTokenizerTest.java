package otherUtil;

import java.util.*;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "One, Two, Free, Four. It's numbers, in Java 1.8.";
		StringTokenizer token = new StringTokenizer(str,",");
		for (;token.hasMoreTokens();)
		System.out.println("Next token: \""+token.nextToken()+"\"");
	}

}
