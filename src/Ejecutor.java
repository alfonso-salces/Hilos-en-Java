public class Ejecutor implements Runnable {
	public void run() {
		int i = 0;
			do {
				
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}while(true);
	}
	
	
	public void eco() {
		System.out.println("Soy eco.");
	}
	
}
