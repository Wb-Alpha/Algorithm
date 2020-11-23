package a2014决赛;

public class B05J表格计算 {
	public static int n,m;
	public static double[][] value;
	
	public static double getSum(int x1, int y1, int x2, int y2) {
		double sum = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				sum = sum+value[i][j];
			}
		}
		return sum;
	}
	
	public static double getStd(int x1, int y1, int x2, int y2) {
		int count = Math.abs((x2-x1+1)*(y2-y1+1));
		double avg = getAvg(x1,y1,x2,y2);
		double result = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++)
				result = result + (value[i][j]-avg)*(value[i][j]-avg); 
		}
		result = Math.sqrt(result/count);
		return result;
	}

	private static double getAvg(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		int count = Math.abs((x2-x1+1)*(y2-y1+1));
		double avg = getSum(x1,y2,x2,y2)/count;
		return avg;
	}
	
	public boolean check(int x1, int y1, int x2, int y2) {
		boolean judge = true;
		for (int i = x1; i <= x2; i++) {
			if (!judge)
				break;
			for(int j = y2; j <= y2; j++) {
				if (value[i][j] == -1) {
					judge = false;
					break;
				}
			}
		}
		return judge;
	}
	
	public String[] getPoeraAndNum(String arrayA) {
		int p = arrayA.indexOf("(");
		int q = arrayA.indexOf(")");
		String opera = arrayA.substring(0,p);
		arrayA = arrayA.replace(':', ',');
		String[] num = arrayA.substring(p+1, q).split(",");
		String[] result = new String[5];
		result[0] = opera;
		for (int i = 0; i < 4; i++)
			result[i+1] = num[i];
		return result;
	}
	
	public void getResult(String[] A) {
		value = new double[n][m];
	}
}
