package otherUtil;

import java.util.ListResourceBundle;

public class SampleRB extends ListResourceBundle{

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
