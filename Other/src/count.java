
public class count {
	public static void main(String[] args) {
		for (int i=0; i<32; i++) {
			String num = Integer.toString(i, 2);
			StringBuffer result = new StringBuffer();
			result.append(num);
			while (result.length() < 5) {
				result.insert(0, "0");
			}
			System.out.println(result);
		}
	}
}
