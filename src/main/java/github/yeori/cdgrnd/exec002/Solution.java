package github.yeori.cdgrnd.exec002;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
	
	static int N ;
	static int [] scores = new int[30_0000];
	static int [] next   = new int[30_0000];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
        
			System.out.println("Case #" + test_case);
			N = sc.nextInt();
			readScores(scores, N, sc);
			Arrays.sort(scores, 0, N);
			int bound = nextScore ( scores, next );
			
			int skipped = 0;
			for ( int i = 0 ; i < N ; i++) {
				if ( scores[i] + N < bound ) {
					skipped ++;
				} else {
					break;
				}
			}
			
			System.out.println( N - skipped);
		}
	}

	private static int nextScore(int[] scores, int [] next ) {
		int max = Integer.MIN_VALUE;
		int n = N;
		for ( int i = 0; i < N ; i++, n--) {
			next[i] = scores[i] + n ;
			if ( next[i] > max) {
				max = next[i];
			}
		}
		return max;
	}

	private static int [] readScores(int [] scores, int N, Scanner sc) {
		for ( int i = 0 ; i < N ; i++) {
			scores[i] = sc.nextInt();
		}
		return scores;
	}
}
