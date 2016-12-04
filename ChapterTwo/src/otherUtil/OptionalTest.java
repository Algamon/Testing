package otherUtil;

import java.util.*;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> hasValue = Optional.of("One, Two, Free");
		Optional<String> noValue = Optional.empty();
		System.out.println(hasValue.orElse("default"));
		System.out.println(noValue.orElse("default"));

	}

}
