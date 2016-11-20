package IOTesting;

import java.io.*;

public class AnotherTest {

	public static void main(String[] args) {
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream("Test.txt")))){
			System.out.println("������ ����� Test.txt");
			String c="";
			while(true) {
				c=buf.readLine();
				if(c==null) break;
				System.out.println(c);
			};
		}
		catch(IOException exp){
			exp.printStackTrace();
		}
	}

}
