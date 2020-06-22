package Example;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}

	
	public static int coinChange(int[] coins, int n) {
		//base case
		if (n == 0) return 0;
		if (n < 0) return -1;//�޽�
		//����Сֵ�����Գ�ʼ��������
		int res = Integer.MAX_VALUE;
		for (int coin : coins){
			int subproblem = coinChange(coins, n-coin);
			if (subproblem == -1) continue;
			res = (res < subproblem+1 ? res:subproblem+1);
		}
		 if (res != Integer.MAX_VALUE)
			 return res;
		 else
			 return -1;
	}
}
