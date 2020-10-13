package a2015年省赛;

public class _07牌型总数1 {
	public static void main(String[] args) {
		int ans = 0;
		for (int n1 = 0; n1 <= 4; n1++) {
			for(int n2 = 0; n2 <= 4; n2++) {
				for(int n3 = 0; n3 <= 4; n3++) {
					for(int n4 = 0; n4 <= 4; n4++) {
						for(int n5 = 0; n5 <= 4; n5++) {
							for(int n6 = 0; n6 <= 4; n6++) {
								for(int n7 = 0; n7 <= 4; n7++) {
									for(int n8 = 0; n8 <= 4; n8++) {
										for(int n9 = 0; n9 <= 4; n9++) {
											for(int n10 = 0; n10 <= 4; n10++) {
												for(int n11 = 0; n11 <= 4; n11++) {
													for(int n12 = 0; n12 <= 4; n12++) {
														for(int n13 = 0; n13 <= 4; n13++) {
															int num = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12+n13;
															if (num == 13)
																ans++;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
