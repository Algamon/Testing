package otherUtil;

import java.util.*;

public class CurrencyTest {

	public static void main(String[] args) {
		System.out.println(Currency.getAvailableCurrencies());
		System.out.println((Currency.getInstance(Locale.US)).getSymbol());
		
	}

}
