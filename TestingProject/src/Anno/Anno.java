package Anno;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String str() default "Testingmode";
}
@Test
class TestAnno{
	void One(){
		System.out.println("One");

	}
}
public class Anno {

	public static void main(String[] args) {
		TestAnno x = new TestAnno();
		x.One();
		Annotation one_anno[]=x.getClass().getAnnotations();
		for(Annotation a: one_anno){
			System.out.println(a);
		}
	}

}
