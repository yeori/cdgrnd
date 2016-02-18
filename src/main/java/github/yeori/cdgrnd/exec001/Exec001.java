package github.yeori.cdgrnd.exec001;

import java.io.InputStream;
import java.io.PrintStream;

public class Exec001 {
	private static final String IN_FILE = "in000.txt";

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		PrintStream out = System.out;
		
		
		System.setIn(Exec001.class.getResourceAsStream(IN_FILE));
		Solution.main(new String[]{});
		
	}
}
