
import java.util.*;

public class JudgeYears {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int y = in.nextInt();
		 String isYear = "no";
		 
		 if (y%4==0 && y%100!=0) {
			 isYear = "yes";
		 }
		 else if(y%100==0)
			 isYear = "yes";
		 System.out.println(isYear);
	}
}
