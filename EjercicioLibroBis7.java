/*Este programa muestra una pirámide a color por pantalla
@AmandaNR */

public class EjercicioLibroBis7 {

	public static void main (String[] args){
		String rosa = "\033[35m";
		String blanco = "\033[37m";
	
		System.out.println(rosa+"    *");
		System.out.println("   * *");
		System.out.println("  *   *");
		System.out.println(" *     *");
		System.out.println("*********");
		System.out.println(blanco+"");
		
	}
}
