package Training;
/*
 * ��������Ԫ 6036 �꣬ȫ����׼����ѡһ�������ܵ��˵���ͳ��
 * ���� nn ���Ƿ��μ���˾�ѡ��ͳ������Ʊ���Ѿ�ͳ����ϣ��������˭�ܹ�������ͳ��
 */

import java.util.*;

public class President {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String max = "0";
		String input;
		int id=0;
		int N = in.nextInt();
		
		for (int i=1; i<=N; i++) {
			input = in.next();
			int inSize = input.length();
			int maxSize = max.length();
			
			if (inSize > maxSize || (inSize >= maxSize && input.compareTo(max)>0)) {
				max = input;
				id = i;
			}
		}
		
		System.out.println(id);
		System.out.println(max);
	}
}
