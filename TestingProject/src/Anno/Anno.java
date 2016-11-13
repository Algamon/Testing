package Anno;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String str() default "Testingmode";
}
@Test
class Anno {
	@Test(str="Method")
	public static void one(){
		Anno x = new Anno();
		System.out.println("One");
		Annotation one_anno[]=x.getClass().getAnnotations();
		for(Annotation a: one_anno){
			System.out.println(a);
		}
		try{
			Method one_meth=x.getClass().getMethod("one");
			System.out.println(one_meth);
		}
		catch(Throwable abc){
			System.out.println("Method not found "+ abc);
		}
	}



	public static void main(String[] args) throws Exception {
		//TestAnno x = new TestAnno();
		one();
		

	

}
}