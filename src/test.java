import java.util.Scanner;

public class test {
	
	public static void main(String [] args) {
		int opc = 0;
		dado uno = new dado();
		moneda dos = new moneda();
		Scanner t = new Scanner(System.in);
		do {
			try {
				System.out.println("-------------------");
				System.out.println("TESTEO CLASE SORTEO");
				System.out.println("-------------------");
				System.out.println("1.- DADO");
				System.out.println("2.- MONEDA");
				System.out.println("3.- SALIR");
				System.out.println();
				System.out.print("Introduzca una opción del menú:");
				opc = t.nextInt();
			}
			
			catch(Exception e) {
				t.next();
				opc = 4;
			}
			
			switch(opc) {
			
			case 1://DADO
				System.out.println("----");
				System.out.println("DADO");
				System.out.println("----");
				System.out.println("El número del dado es: "+ uno.lanzar());
			break;
			
			case 2://MONEDA
				System.out.println("------");
				System.out.println("MONEDA");
				System.out.println("------");
				if(dos.lanzar()==0) {
					System.out.println("CARA");
				}
				else {
					System.out.println("CRUZ");
				}
			break;
			
			case 3: 
				System.out.print("                               ");
				System.out.println("--------------------------------");
				System.out.print("                               ");
				System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
				System.out.print("                               ");
				System.out.println("  ESPERO QUE HAYAS APRENDIDO");
				System.out.print("                               ");
				System.out.println("--------------------------------");
			break;
			
			default:
				System.out.println("Opción incorrecta");
			break;
			
			}
		}while(opc!=3);
	}
}
