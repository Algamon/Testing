package obs;

import java.util.*;

class Testobs <T extends Double> {
	T sqr;
	Testobs (T x){
		sqr = x;
	}
	double meth(){
		return(Math.sqrt(sqr));
	}
}

public class Obs_one {
	
		public static void main(String[] args) {
		try(Scanner abc = new Scanner(System.in)){;
			System.out.print("Нахождение квардатного корня числа. Введите число: ");
			double x = abc.nextDouble();
			Testobs<Double> ts = new Testobs<Double>(x);
			System.out.println("sqrt("+x +") = " +ts.meth());
		}
		catch(Exception exp){
			exp.printStackTrace();
		}


	}

}
