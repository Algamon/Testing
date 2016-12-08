package otherUtil;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = "";
			int value=0,k=0;
			while(sc.hasNext()){
				if(sc.hasNextInt()){
					value += sc.nextInt();
					k++;
				}
				else{
					str = sc.next();
					if(str.equalsIgnoreCase("end")) break;
					System.out.println("Error format");
				}
			}
			System.out.println("Avg value: "+value/k);
		}
		Formatter c = new Formatter();
		Integer i = 1;
		c.format("%1%b",i);
	}

}
