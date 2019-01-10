public class Hiloejemplo2 extends Thread {

	public static void main(String[] args) {
		HiloTac htac = new HiloTac();
		HiloTic htic = new HiloTic();
		htac.start();
		htic.start();	
	}// Main
	
}// HiloEjemplo1