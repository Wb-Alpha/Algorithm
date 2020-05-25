package BackpackProblem;

/*
 * ��һ������Ϊ30�ı������Լ�����Ϊw={16��15��15}����ֵ�ֱ�Ϊp={45,25,25}������
 * ���������η��òſ����ñ����б�����Ʒ��ֵ�ﵽ���
 * 
 * mission:ʹ�ø����ʵ�����Գ���
 */

import java.util.*;

public class backtrack_1 {
	public static int n = 0;//�м�������
	static int[] value;//�����ֵ����
	static int[] weight;//������������
	static int[] x;//�����������
	static int load;//�������ɸ���
	static int best = 0;//������������ֵ
	static int tempW = 0;//��ǰ����
	static int tempV = 0;//��ǰ������ֵ
	static int[] bestx;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("�����뱳���ɸ�������");
		load = reader.nextInt();
		
		System.out.println("�������ж��ٸ�����");
		n = reader.nextInt();
		value = new int[n];
		weight = new int[n];	
		x = new int[n];
		bestx = new int[n];
		
		System.out.println("��������������");
		for (int i=0; i<n; i++) {
			weight[i] = reader.nextInt();
		}
		
		System.out.println("���������ļ�ֵ");
		for( int i=0; i<n; i++) {
			value[i] = reader.nextInt();
		}
		
		backtrack(0);
		System.out.println("������ֵ���Ϊ"+best);
		System.out.println("��������ΪΪ��");
		for(int i=0; i<n; i++) {
			System.out.print(bestx[i]+" ");
		}
	}

	

	
	static void backtrack(int t) {

		if(t>=n) output(x);
		else {
			for (int i=0; i<=1; i++) {
				x[t] = i;
				if (i==1) {
					tempW += weight[t];
					tempV += value[t];
				}
				if(legal(t))//�Ƿ�Ϸ�
					backtrack(t+1);
			}
			if (x[t] == 1) {
				tempW -= weight[t];
				tempV -= value[t];
			}
		}
	}
	
	
	static void output(int[] x) {
		if (tempV > best) {			
			best = tempV;
			bestx = x;
			System.out.println("bestx[]="+ bestx[0]+" "+bestx[1]+" "+bestx[2]);
		}
	}
	
	static boolean legal(int t) {
		if (tempW > load) {
			return false;
		}
		return true;
	}
}
