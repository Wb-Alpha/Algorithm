package a2014ʡ��;

public class _05Բ���� {
	public static void main(String[] args) {
		double x = 11;
		for (int n = 10000; n >= 0; n--) {
			int i = 2*n+1;
			x = 2+(i*i/x);
		}
		
		System.out.println(String.format("%.4f", 4/(x-1)));
	}
	
}
