package a2013��ʡ��B��;

// dfs�������������
// �������������������
// �߽�
// �ظ�
// �仯

public class _03�����л� {
	public static void main(String[] args) {
		System.out.println(f(0, 0));
	}
	
	private static int f(int i, int j) {
		if (i == 3 || j == 4) return 1;
		return f(i+1, j)+f(i, j+1);
	}
}
