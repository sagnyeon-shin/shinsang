import java.util.ArrayList;

public class test1 {

	public static int getSurvivingIndex(int n, int k) {
		ArrayList<String> name = new ArrayList<String>();
		for(int num = 0; num<n; num++) {
			name.add(num,String.valueOf(num));
		}
		
		
		
		
		
		
		
		System.out.println(name);
		return name.size();
	}

	public static void main(String[] args) {
		System.out.println("����� " + getSurvivingIndex(10, 5) + "�� �ڸ��� �������� �˴ϴ�.");
	}
}