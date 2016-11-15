package IOTesting;

import java.io.*;

public class IOTest {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out,true);
		BufferedReader fl = new BufferedReader(new InputStreamReader(new FileInputStream("Text.txt")));
		try(BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Text1.txt")))){
		FileOutputStream bite = new FileOutputStream("Text2.txt");
		String c;
		int x = 'f';
		bite.write(x);
		c = rd.readLine();
		
		pw.println("Zapis' v file Text1: "+c);
		fw.write(c);
		for (int i=0;i<2;i++){
			c = fl.readLine();

			pw.println(c);
		}
		fl.close();
		}
		catch(IOException abc){
			abc.printStackTrace();
		}
	}

}
