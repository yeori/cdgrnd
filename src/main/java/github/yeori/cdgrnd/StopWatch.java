package github.yeori.cdgrnd;

public class StopWatch {

	private long elapsed = 0;
	
	private long s ;
	public void start() {
		s = System.nanoTime();
	}
	
	public String stop() {
		elapsed += (System.nanoTime() -s );
		return String.format("%f", elapsed / 1000000000.0);
	}
}
