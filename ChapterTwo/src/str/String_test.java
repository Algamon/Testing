package str;

class Stringer{
	Stringer(){
		
	}
	public String toString(){
		return "Override method toString()";
	}
}

public class String_test {
	public static void main(String... args){
		{	//test override toString()
			Stringer stger = new Stringer();
			System.out.println(stger.toString());
		}
		{	//test Search in String
			String str = "Testing text one: Children of Bodom - Hate Me, In Flames - Take this life, Marilyn Manson - Warship my wreck ";
			int find = str.indexOf("Bodom");
			char a[] = new char[10];
			str.getChars(find, find+5, a, 0);
			for (int x=0;x<a.length;x++){
				System.out.print(a[x]);
			}
		}
		
	}
}
