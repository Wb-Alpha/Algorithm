package a2013����;

public class B01J�µ��� {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j)
					continue;
				for (int p = 0; p < 10; p++) {
					if (j == p || p == i)
						continue;
					//System.out.println(i+" "+j+" "+p);
					int sum = i*100+j*10+p;
					if (sum*sum%10 == j && sum*sum/100000 == i)
						System.out.println(sum);
				}
			}
		}
	}
}


//A ���Ԫ���ڵƻ�����һ���⣺
//
//����� * ����� = ����͵Ʊ߲�
//
//С���룬һ����ÿ�����ִ���һ�����֣���ͬ�ĺ��ִ���ͬ�����֡�
//
//�����ü������С����˼·��һ�£�Ȼ���ύ������ա���������������������ɡ�
//
//���ϸ��ո�ʽ��ͨ��������ύ�𰸡�
//ע�⣺ֻ�ύһ��3λ����������Ҫд�����������ݣ����磺˵���Ե����֡�