public class Hiloejemplo1 extends Thread {
	// constructor
	public Hiloejemplo1(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO:" + getName());
	}

	// metodo run
	public void run() {
		for (int i=0; i<5; i++) 
			System.out.println("Hilo:" + getName() + " C = " + i);
	}

	//
	public static void main(String[] args) {
		Hiloejemplo1 h1 = new Hiloejemplo1("Hilo 1");
		Hiloejemplo1 h2 = new Hiloejemplo1("Hilo 2");
		Hiloejemplo1 h3 = new Hiloejemplo1("Hilo 3");
			
		h1.start();
		h2.start();
		h3.start();
		
		System.out.println("3 HILOS INICIADOS...");
	}// main
	
}// HiloEjemplo1