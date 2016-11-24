package inicialization;

class Rod_test{
	{
		System.out.println("3");
	}
	static{
		System.out.println("1");
	}
	Rod_test(){
		System.out.println("4");
	}
}

public class Init_test extends Rod_test {
	Init_test(){
		System.out.println("6");
	}
	{
		System.out.println("5");
	}
	static{
		System.out.println("2");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Init_test Testing = new Init_test();

	}

}
