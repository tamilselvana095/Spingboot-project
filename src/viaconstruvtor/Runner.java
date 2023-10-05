package viaconstruvtor;

public class Runner {
	game1 g1;
	public Runner(game1 g1) {
		this.g1=g1;
		
	}

	public void run() {
		g1.up();
		g1.down();
		g1.left();
		g1.right();
	}

}
