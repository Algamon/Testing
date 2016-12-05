package otherUtil;

import java.util.*;

class SampleRB extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		Object[][] obj = new Object[1][1];
		obj[0][0]="���";
		obj[0][1]="��������";
		obj[1][0]="��������";
		obj[1][1]="������� �����������-47";
		return obj;
	}
	
}
class SampleRB_en extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		Object[][] obj = new Object[1][1];
		obj[0][0]="knife";
		obj[0][1]="Cerambit";
		obj[1][0]="Rifles";
		obj[1][1]="Ak-47";
		return obj;
	}
	
}
public class ResourceBundleTest {

	public static void main(String[] args) {
		
		ResourceBundle res = ResourceBundle.getBundle("SampleRB");
		System.out.println(res.getString("���"));
		System.out.println(res.getString("��������"));
		
		res = ResourceBundle.getBundle("SampleRB", Locale.ENGLISH);
		System.out.println(res.getString("���"));
		System.out.println(res.getString("��������"));
	}

}
