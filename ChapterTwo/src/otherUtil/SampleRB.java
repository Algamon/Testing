package otherUtil;

import java.util.ListResourceBundle;

public class SampleRB extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		Object[][] obj = new Object[1][1];
		obj[0][0]="Нож";
		obj[0][1]="Керамбит";
		obj[1][0]="Винтовки";
		obj[1][1]="Автомат Калашникова-47";
		return obj;
	}
	
}
