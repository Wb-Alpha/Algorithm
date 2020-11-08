package a2018¾öÈü;

public class _A02JÔÄ±ø·½Õó {
	public static void main(String[] args) {
//		int num = 1;
//		
//		while (true) {
//			num++;
//			int sqt = (int)Math.sqrt((double)num);
//			int count = 0;
////			OUT:
//			for (int i = sqt; i > 1; i--) {
//				for (int j = i-1; j > 0; j--) {
//					if (i*i+j*j == num) {
//						//System.out.println(i+" "+j);
//						count++;
//					}
////					else if (i*i+j*j < num) {
////						break OUT;
////					}
//				}
//			}
//			System.out.println(num+" "+count);
//			if (count == 12) {
//				break;
//			}
//		}
//		System.out.println(num);

		int num = 10001;
		while(true) {
			int sqt = (int)Math.sqrt((float)num);
			int mod = 0;
			int count = 0;
			System.out.println(num+" "+count);
			for (int i = sqt; i >0; i--) {
				mod = num - i*i;
				if (Math.sqrt((double)mod) % 1 == 0 && Math.sqrt((double)mod) != 0){
					System.out.println("mod "+Math.sqrt((double)mod)+" sqt "+i);
					count++;
				}
			}
			if (count == 24) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}
}
