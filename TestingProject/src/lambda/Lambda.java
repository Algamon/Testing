package lambda;

interface Lam<T>{
	T lam1(T n);
}

public class Lambda {
	static double lol (Lam<Double> sf ){
		return sf.lam1(4.0);
	}
	static String str (Lam<String> sf){
		return sf.lam1("Тестовая строка");
	}
	public static void main(String s[]) {
		System.out.println(lol(n -> Math.sqrt(n)));
		System.out.println(str(n -> n.toUpperCase()));
		//short b = 3;
	}

}
