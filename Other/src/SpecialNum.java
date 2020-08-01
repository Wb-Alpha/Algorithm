
public class SpecialNum {
	public static void main(String[] args) {
		for (int i=100; i<1000; i++) {
			String stri = Integer.toString(i);
			String[] strarr = stri.split("");
			int sum = 0;
			
			for (int j=0; j<strarr.length; j++) {
				int temp = Integer.parseInt(strarr[j]);
				sum = sum+temp*temp*temp;
				// System.out.println(sum);
			}
			
			if (sum == i) {
				System.out.println(i);
			}
		}
	}
}
