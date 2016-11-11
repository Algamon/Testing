package javaapp1;
import java.io.*;

class RandomAccess
{
public static void main (String args[])
{
	double data[]={19.4, 10.1, 123.53, 33.0, 87.9, 74.25};
	double d;
	try (RandomAccessFile raf = new RandomAccessFile("random.dat","rws"))
	{
		for(int i=0;i<data.length; i++)
		{
			raf.writeDouble(data[i]);
		}
		raf.seek(0);
		d=raf.readDouble();
		System.out.println("First value is " + d);
		raf.seek(8);
		d=raf.readDouble();
		System.out.println("Second value is " + d);
		raf.seek(8*3);
		d=raf.readDouble();
		System.out.println("Fourth value is " + d);
		
	}
	catch(IOException exc)
	{
		System.out.println("I/O Error: " + exc);
	}
}
}
//testjl