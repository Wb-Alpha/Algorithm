package a2016��ʡ��;

public class _02�������� {
	public static void main(String[] args) {
		int num;
		int st = 0;
		
		for(int i = 1; i < 110; i++) {
			num = 0;
			for (int j = i; j < 110; j++) {
				num += j;
				if (num == 236) {
					st = i;
					break;
				}
				else if(num > 236) {
					break;
				}
			}
		}
		
		System.out.println(st);
	}
}
