package Training;
/*
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮����������(N��100)��
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰�
 * ���źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * 
 * �����Ŀ�Ĺػ�����������������ķ�Χ�㹻С������Ūһ����ֵ�������Դ������Ƿ��������ֹ�
 *Ҳ���Բ���Ͱ�������������ݷ�ΧС���Ҷ�����������
 */
import java.util.*;

public class RandomNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = N;
		int[] judge = new int[1000];
		for (int i=0; i<N; i++) {
			int temp = in.nextInt();
			if (judge[temp] == 1)
				count--;
			else 
				judge[temp] = 1;
		}
		
		System.out.println(count);
		for (int i=0; i<1000; i++) {
			if (judge[i] == 1)
				System.out.print(i+" ");
		}
		in.close();
	}
}
