package github.yeori.cdgrnd.exec001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			int N = sc.nextInt();
			int [] nums = new int[N];
			read ( nums, sc );
			
			List<Integer> odds = findOddNums ( nums );

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(xor(odds));
			
		}
	}

	static List<Integer> findOddNums(int[] nums) {
		Arrays.sort(nums); // asceding
		ArrayList<Integer> oddNums = new ArrayList<>();
		int targetNum = nums[0];
		int cnt = 0;
		for ( int i = 0 ; i < nums.length; i++) {
			if ( nums[i] == targetNum ) {
				cnt ++ ;
				continue;
			}
			if ( cnt % 2 != 0){
				oddNums.add(targetNum);
			}
			
			targetNum = nums[i];
			cnt =1 ;
			
		}
		if ( cnt % 2 != 0) {
			oddNums.add(targetNum);
		}
		return oddNums;
	}
	
	static int xor( List<Integer> nums) {
		int v = 0;
		for (Integer n : nums) {
			v ^= n;
		}
		return v;
	}

	public static void read(int[] nums, Scanner sc) {
		for ( int i = 0 ; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
	}
}
