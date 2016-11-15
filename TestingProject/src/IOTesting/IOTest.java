package IOTesting;

import java.io.*;

public class IOTest {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out,true);
		BufferedReader fl = new BufferedReader(new InputStreamReader(new FileInputStream("Text.txt")));
		String c;
		//c = rd.readLine();
		//pw.println(c);
		for (int i=0;i<2;i++){
			c = fl.readLine();
			pw.println(c);
		}
		fl.close();
	}

}
