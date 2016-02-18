package github.yeori.cdgrnd.exec002;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;

public class In004Creator {
	public static void main(String[] args) throws FileNotFoundException {
		In004Creator.class.getResourceAsStream("in005.txt");
		FileOutputStream fos = new FileOutputStream("src/main/java/github/yeori/cdgrnd/exec002/in005.txt");
		PrintStream out = new PrintStream(fos, true);
		
		out.println(1);
		out.println(30_0000);
		for ( int i = 0 ; i < 30_0000 ; i++) {
			out.println( (int) (Math.random()*200_0000) );
		}
		out.flush();
		out.close();
	}
}
