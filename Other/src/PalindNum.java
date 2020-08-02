
public class PalindNum {
	public static void main(String[] args) {
		for (int i=1000; i<10000; i++) {
			String temp = Integer.toString(i);
			String[] tempArr = temp.split("");
			if (tempArr[0].equals(tempArr[3]) && tempArr[1].equals(tempArr[2])) {
				System.out.println(temp);
			}
		}
	}
}
