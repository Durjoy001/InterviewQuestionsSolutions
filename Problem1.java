package main;

import java.util.Scanner;

class Solution {
	int convertStringToInt(String args) {
		int v = 0;
		for (int i = 0; i < 3; i++) {
			if (args.charAt(i) == 'r') {
				v += 4;
			} else if (args.charAt(i) == 'w') {
				v += 2;
			} else if (args.charAt(i) == 'x') {
				v += 1;
			}
		} return v;
	}
	int decodeSymbolicNotation(String notation) {
		int ans = 0;
		ans = ans * 10 + convertStringToInt(notation.substring(0, 3));
		ans = ans * 10 + convertStringToInt(notation.substring(3, 6));
		ans = ans * 10 + convertStringToInt(notation.substring(6, 9));
		return ans;
	}
}
public class Main {

    public static void main(String[] args) {
       Solution sol = new Solution();
       Scanner sc = new Scanner(System.in);
       String notation = sc.nextLine();
       System.out.println(sol.decodeSymbolicNotation(notation));
    }
    
}
