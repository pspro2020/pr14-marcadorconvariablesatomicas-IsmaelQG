package code;

public class Dice implements Runnable {
	
	Marcador marcador;
	
	public Dice(Marcador marcador) {
		this.marcador = marcador;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10000; i++) {
			marcador.increment();
		}
	}

}
