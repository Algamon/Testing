package otherUtil;

import java.util.*;

public class FormatterTest {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		try(Formatter form = new Formatter()){
			form.format("It's test library %2$s. Current Java version %1$.1f. Today %3$td-%<tB-%<tY.", 1.8, "in Java", date);
			System.out.println(form);
		}
	}

}
