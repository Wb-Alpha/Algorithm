package a2019����;

import java.util.Scanner;

public class _01 {
	static int ans = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[][] map =  new char[2][4];
		for (int i = 0; i < map.length; i++) {
			String temp = in.nextLine();
			char[] arr = temp.toCharArray();
			for (int j = 0; j < arr.length; j++) {
				map[i][j] = arr[j];
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				char temp = map[i][j];
				int temp_i = i;
				for (int p = i+1; p < map.length; p++) {
					if (temp < map[p][j]) {
						ans++;
					}
				}
				for (int p = j+1; p < map[0].length; p++) {
					if (temp < map[i][p]) {
						ans++;
					}
				}
				for (int p = j+1; p < map[0].length; p++) {
					if (temp_i >= map.length-1) {
						break;
					}
					temp_i++;
					if (temp < map[temp_i][p]) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}


//���� A: �������У�5�֣�
//������������
//
//����һ����ĸ�������ǳƾ����е�һ������������ָ�ھ������ҵ�������ĸ��������ͬһ�У�ͬһ�У�������ͬһ 45 �ȵ�б���ϣ���������ĸ�������ҿ������ߴ������¿��ǵ����ġ�
//
//���磬���¾�����
//
//LANN
//QIAO
//
//��LN��LN��AN��AN��IO��AO��LQ��AI��NO��NO��AQ��IN��AN �� 13 ���������С�ע�⵱������ĸ�Ǵ����µ���������ʱ���������ҿ��ʹ������¿��ǲ�ͬ��˳��
//
//��������� 30 �� 50 �еľ��������ܹ��ж��ٸ��������У���������
//�������ָ��Ƶ��ı��ļ��У�����ؼ�鸴�Ƶ������Ƿ����ĵ��е�һ�¡�������Ŀ¼����һ���ļ� inc.txt��������������ı���ͬ��