package a2013����;

public class B02J����������_�� {

	public static void main(String[] args) {
		int n = 111 * 111 * 111;
		int sum = 0;
		// ֱ�Ӵ�1��ʼ��ö��С�ڵ���n���������
		for (int i = 1; i <= n; i += 2) {
			sum = 0;
			for (int j = i; j <= n; j += 2) {
				sum += j;
				if (sum > n)
					break;
				if (sum == n) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}
		
		// ���ݵȲ����У�an=2*n-1,Sn=n*n,���������ö��
		for (int i = 1; i < 3000; i++) {
			for (int j = i; j < 3000; j++) {
				if (j * j - (i - 1) * (i - 1) == n) {
					System.out.println(2 * i - 1);
					System.exit(0);
				}
			}
		}
	}

}
