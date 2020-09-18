import java.util.Arrays;
import java.util.Scanner;

public class 区间K大数查询 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int arr[] = new int[n];
    	
    	for (int i=0; i<arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	int time = sc.nextInt();
    	
    	for (int i=0; i<time; i++) {
    		int start = sc.nextInt();
    		int end = sc.nextInt();
    		int k = sc.nextInt();
    		
    		int temp[] = new int[end-start+1];
    		int index = 0;
    		
    		for (int j=start-1; j <= end-1; j++) {
    			temp[index++] = arr[j];
    		}
    		
    		Arrays.sort(temp);
    		int downsort[] = new int[temp.length];
    		int index2 = temp.length-1;
    		for (int j=0; j<downsort.length; j++) {
    			downsort[j] = temp[index2--];
    		}
    		System.out.println(downsort[k-1]);
    	}
    	sc.close();
    }
}
