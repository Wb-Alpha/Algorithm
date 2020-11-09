package a2018决赛;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _C04J约瑟夫环 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + k) % i;
        }
        System.out.println(p + 1);
	}
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int k = in.nextInt();
//		int index = 0;
//		ArrayList<Integer> l = new ArrayList<Integer>();
//		
//		for (int i = 0; i < n; i++) {
//			l.add(i);
//		}
//		
//		while(true) {
//			if (l.size() == 1) {
//				show(l);
//				break;
//			}
//			index += k;
//			while (index >= l.size()) {
//				index -= l.size();
//			}
//			
//			l.remove(index);
//			
//		}
//		//System.out.println(l.indexOf(0));
//		in.close();
//	}
//	
//	public static void show(ArrayList a) {
//		for (int i = 0; i < a.size(); i++) {
//			System.out.print(a.get(i)+" ");
//		}
//		System.out.println();
//	}
}
