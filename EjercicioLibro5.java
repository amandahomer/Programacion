/*Este programa muestra mi horario de clase a color
@AmandaNR */

public class EjercicioLibro5 {

	public static void main (String[] args){
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String amarillo = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String cian = "\033[36m";
		String blanco = "\033[37m";
		
		
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n","","LUNES","MARTES","MIERCOLES","JUEVES","VIERNES");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"15:15/16:15",amarillo+"Sistemas",rojo+"Programación",amarillo+"Sistemas",rojo+"Programación","Programación");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"16:15/17:15",rojo+"Programación","Programación",verde+"Fol",rojo+"Programación","Programación");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"17:15/18:15",rojo+"Programación",azul+"Lenguaje",verde+"Fol",cian+"Base datos","Base datos");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"18:30/19:15",verde+"Fol",azul+"Lenguaje",morado+"Entorno",cian+"Base datos","Base datos");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"19:30/20:30",cian+"Base datos",amarillo+"Sistemas",morado+"Entorno",amarillo+"Sistemas",azul+"Lenguaje");
		System.out.printf("%-15s	%-15s	%-15s	%-15s	%-15s\n",blanco+"20:30/21:30",cian+"Base datos",amarillo+"Sistemas",morado+"Entorno",amarillo+"Sistemas",azul+"Lenguaje");
		System.out.println(blanco);
	}
}
