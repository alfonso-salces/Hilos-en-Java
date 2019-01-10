
public class HiloTic extends Thread {
	public void run() {
		do {
			System.out.println("Tic");
			try {
				this.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while(true);
	}
}
