import java.util.*;

public class HToO2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int n = Integer.parseInt(input);
		
		String[] nums = new String[n];
		for (int i=0; i<n; i++)
			nums[i] = in.nextLine();
		in.close();
		
		String[] HEXs = {
				"0","1","2","3","4","5","6","7","8","9","A","B",
				"C","D","E","F"
		};
		
		String[] BINs = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", 
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" 	
		};
		
		String[] OCTs = {
				"0", "1", "2", "3", "4", "5", "6", "7"	
		};
		
		for (int m=0; m<n; m++) {
			String hex = nums[m];
			StringBuffer sbBin = new StringBuffer();
			StringBuffer sbOct = new StringBuffer();
			
			
			for (int i=0; i<hex.length(); i++) {
				String c = Character.toString(hex.charAt(i));
				int index = Arrays.binarySearch(HEXs, c);
				sbBin.append(BINs[index]);
			}
			
			while (sbBin.length()%3 != 0)
				sbBin.insert(0, "0");
			
			int octLen = sbBin.length()/3;
			for (int i=0; i<octLen; i++) {
				String span = sbBin.substring(3*i,3*i+3);
				int index = Arrays.binarySearch(BINs, "0"+span);
				sbOct.append(OCTs[index]);
			}
			
			while (sbOct.charAt(0)=='0')
				sbOct.delete(0, 1);
			
			System.out.println(sbOct.toString());
		}
	}
}
