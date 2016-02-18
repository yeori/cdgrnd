package github.yeori.cdgrnd.exec002;


import github.yeori.cdgrnd.StopWatch;

public class Exec002 {
	private static final String IN_FILE = "in002.txt";

	public static void main(String[] args) {
		StopWatch watch = new StopWatch();
		watch.start();
		for ( int i = 0 ; i < 5 ; i++) {
			System.setIn(Exec002.class.getResourceAsStream(IN_FILE));
			Solution.main(new String[]{});
		}
		System.out.println(watch.stop());
	}
}
