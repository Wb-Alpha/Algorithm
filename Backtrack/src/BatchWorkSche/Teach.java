package BatchWorkSche;
import java.util.*;
/*
 * 如何判断时长：
 * 由于作业需要再机器1上处理过后再在机器2上处理，故机器2的运行时间一定比机器1长，故机器2的运行时间就是总事件
 * f1,f2,f3,....,fn是作业的序号
 * f(i,n) i为机器号，n为作业号  f为完成时间
 * 
 * 需要使用到java中的三元运算符
 * a>b?a:b  若a>b成立则返回a，反之返回b。返回a和b中比较大的值
 * 	   ↑ ↑
 *     T F       
 */

public class Teach {
	static int mis,//作业数
			f1, //机器1完成处理的时间
			f,//完成时间和
			bestf,//当前最优值
			mac;
	static int[][] m;//各个作业所需的处理时间
	static int[] x; //当前作业调度
	static int[] bestx;//当前最优作业调度
	static int[] f2;  //机器2完成处理的时间
	
	//i为现已执行的任务数，j为执行的作业编号
	public static void backtrack(int i) {
		if(i>mis) {//如果所有作业都已经完成
			for(int j = 1; j<=mis; j++)
				bestx[j]=x[j];
			bestf = f;
		}
		else {
			for (int j=i; j <= mis; j++) {
				f1+=m[x[j]][1];//计算机器1的运行时间
				f2[i] = ((f2[i-1]>f1)?f2[i-1]:f1) + m[x[j]][2];//计算机器2的运行时间
				f += f2[i];//计算总运行时间
				if (f < bestf) {//如果时间比之前的最佳时间短
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
		System.out.println("请输入有多少个机器");
		mac = reader.nextInt();
		System.out.println("请输入有多少个任务");
		mis = reader.nextInt();
		m = new int[mis+1][mac+1];
		for(int i=1; i < mac+1; i++) {
			for(int j=1; j < mis+1; j++) {
				System.out.println("请输入第"+j+"任务在第"+i+"个机器上的执行时间");
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

		
		System.out.println("最佳序列为");
		for(int i = 0; i < mis; i++)
			System.out.print(bestx[i]+" ");
		System.out.println("最少用时为："+bestf);
		
	}
	
	
	
	public static void main(String[] args) {
		index();	
	}
}
