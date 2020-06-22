package Example;

import java.util.HashMap;
import java.util.Map;

public class CoinWithNote {
	
	public static void main(String[] args) {
		Map memo = new HashMap();
		int[] coins = {1,2,5};
		int amount = 11;
		System.out.println(coinChange(memo, coins, amount));
		
	}
	
	public static int coinChange(Map memo, int[] coins, int amount) {
		if (memo.containsKey(amount)) return (int) memo.get(amount);
		
		//--------------≤‚ ‘÷–--------------
		/*for(Object key : memo.keySet()){
		    int value = (int) memo.get(key);
		    System.out.println(key+":"+value);
		}*/
		//System.out.println(amount);
		
		if (amount == 0) return 0;
		if (amount < 0) return -1;
		int res = Integer.MAX_VALUE;
		for (int coin : coins) {
			int sub = coinChange(memo, coins, amount - coin);
			if (sub == -1) continue;
			res = (res < sub-1 ? res:sub-1);
		}
		
		if (res != Integer.MAX_VALUE)
			memo.put(amount, res);
		else
			memo.put(amount, -1);
		return (int)memo.get(amount);
	}
}
