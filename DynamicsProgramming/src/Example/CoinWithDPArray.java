package Example;

public class CoinWithDPArray {
	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}
	
	public static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		for (int i=0; i<dp.length; i++)
			dp[i] = amount+1;
		
		dp[0] = 0;
		
		for (int i=0; i<dp.length; i++) {
			//�ڲ�for��������������+1����Сֵ
			for (int coin : coins ) {
				//����������޽�������
				if (i-coin < 0) continue;
				dp[i] = (dp[i]<dp[i-coin] ? dp[i]:dp[i-coin]);
			}
		}
		return (dp[amount] == amount+1) ? -1 :dp[amount];
	}
}
