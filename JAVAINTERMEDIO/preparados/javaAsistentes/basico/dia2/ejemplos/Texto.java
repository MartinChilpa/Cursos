public class Texto {
	
	public static void main (String[] args){

		String texto= "Buenos dias asistentes";

		String texto_= "Buenos dias asistent";

		System.out.println(texto.length());

		System.out.println(texto.substring(0,2));

		System.out.println(texto.toLowerCase());

		System.out.println(texto.toUpperCase());

		System.out.println(texto.equals(texto_));

		System.out.println(texto.replaceAll("Buenos","Malos"));

	}
}