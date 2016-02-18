package github.yeori.cdgrnd.exec001;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestExec001 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> odds = Solution.findOddNums(ints(2, 2, 3, 4, 5, 5));
		assertEquals ( list(3, 4), odds);
		
		odds = Solution.findOddNums(ints(2, 5, 3, 3, 2, 4, 5, 3));
		assertEquals ( list(3, 4), odds);

		odds = Solution.findOddNums(ints(2, 5, 3, 3));
		assertEquals ( list(2, 5), odds);
		
	}
	
	@Test
	public void xor(){
		int two = 2, three = 3, four = 4;
		
		assertEquals ( (two^three)^four, four^(two^three));
		assertEquals ( (two^three)^four, two^(three^four));
		assertEquals ( (two^four)^three, two^(three^four));
		
		assertEquals ( two^three, 0^two^three );
		System.out.println(2^5);
		System.out.println(3^4);
		
		
	}

	private List<Integer> list(Integer ... nums) {
		return Arrays.asList(nums);
	}

	private int[] ints(int ... vals) {
		return vals;
	}

}
