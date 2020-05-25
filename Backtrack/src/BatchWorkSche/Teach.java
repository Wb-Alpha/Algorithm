package BatchWorkSche;
import java.util.*;
/*
 * ����ж�ʱ����
 * ������ҵ��Ҫ�ٻ���1�ϴ���������ڻ���2�ϴ����ʻ���2������ʱ��һ���Ȼ���1�����ʻ���2������ʱ��������¼�
 * f1,f2,f3,....,fn����ҵ�����
 * f(i,n) iΪ�����ţ�nΪ��ҵ��  fΪ���ʱ��
 * 
 * ��Ҫʹ�õ�java�е���Ԫ�����
 * a>b?a:b  ��a>b�����򷵻�a����֮����b������a��b�бȽϴ��ֵ
 * 	   �� ��
 *     T F       
 */

public class Teach {
	static int mis,//��ҵ��
			f1, //����1��ɴ����ʱ��
			f,//���ʱ���
			bestf,//��ǰ����ֵ
			mac;
	static int[][] m;//������ҵ����Ĵ���ʱ��
	static int[] x; //��ǰ��ҵ����
	static int[] bestx;//��ǰ������ҵ����
	static int[] f2;  //����2��ɴ����ʱ��
	
	//iΪ����ִ�е���������jΪִ�е���ҵ���
	public static void backtrack(int i) {
		if(i>mis) {//���������ҵ���Ѿ����
			for(int j = 1; j<=mis; j++)
				bestx[j]=x[j];
			bestf = f;
		}
		else {
			for (int j=i; j <= mis; j++) {
				f1+=m[x[j]][1];//�������1������ʱ��
				f2[i] = ((f2[i-1]>f1)?f2[i-1]:f1) + m[x[j]][2];//�������2������ʱ��
				f += f2[i];//����������ʱ��
				if (f < bestf) {//���ʱ���֮ǰ�����ʱ���
					swap(i,j);
					backtrack(i+1);
					swap(i,j);
				}
				f1 -= m[x[j]][1];
				f-=f2[i];
			}
		}
	}
	
	
	public static void swap(int i, int j) {
		int index;
		index = i;
		i = j;
		j = index;
	}
	
	
	
	
	public static void index() {
	
		Scanner reader = new Scanner(System.in);
		System.out.println("�������ж��ٸ�����");
		mac = reader.nextInt();
		System.out.println("�������ж��ٸ�����");
		mis = reader.nextInt();
		m = new int[mis+1][mac+1];
		for(int i=1; i < mac+1; i++) {
			for(int j=1; j < mis+1; j++) {
				System.out.println("�������"+j+"�����ڵ�"+i+"�������ϵ�ִ��ʱ��");
				m[j][i] = reader.nextInt();
			}
		}
		
		
		f1 = 0;
		f = 0;
		bestf = Integer.MAX_VALUE;
		bestx = new int[mis+1];
		x = new int[mis+1];
		for(int i=1; i<=mis; i++)
			x[i] = i;
		f2 = new int[mis+1];
		backtrack(1);

		
		System.out.println("�������Ϊ");
		for(int i = 0; i < mis; i++)
			System.out.print(bestx[i]+" ");
		System.out.println("������ʱΪ��"+bestf);
		
	}
	
	
	
	public static void main(String[] args) {
		index();	
	}
}
