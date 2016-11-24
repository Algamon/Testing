package lambda;
//тест лямбда-выражений
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
		String y = "Раз раз, раз два три четыре восемь!";
		System.out.println(lol(n -> Math.sqrt(n)));
		System.out.println(str(n -> n.toUpperCase()));
		y = funk_Op(Jazz_Funk::reverse_static,y);
		System.out.println(y);
		Jazz_Funk junk = new Jazz_Funk();
		y = funk_Op(junk::reverse, y);
		System.out.println(y);
	}
	static String funk_Op(Funk abc, String s){
		return abc.funk(s);
	}
}
interface Funk{
	String funk(String n);
}

class Jazz_Funk{
	static String reverse_static(String str){
		String result ="";
		for(int i=str.length()-1;i>=0;i--){
			result += str.charAt(i);
		}
		return result;
	}
	String reverse(String str)	{
		String result ="";
		for(int i=str.length()-1;i>=0;i--){
			result += str.charAt(i);
		}
		return result;
	}
	
}