import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opc;
		System.out.println("¿Qué quieres hacer?");
		System.out.println("1. Eco");
		System.out.println("2. Contador");
		System.out.println("3. Salir");
		opc = scanner.nextInt();
		
		switch(opc) {
		case 1:
			Ejecutor e = new Ejecutor();
			e.eco();
			break;
		case 2:
			Ejecutor e2 = new Ejecutor();
			new Thread(e2).start();
			break;
		case 3:
			System.exit(0);
			break;
		}
		
	}
	
}
