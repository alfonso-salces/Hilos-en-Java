
public class HiloTac extends Thread {
	public void run() {
		do {
			System.out.println("Tac");
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(true);
	}
}
