public class ClaseString {
	
	public static void main (String[] args){

		String texto="Buenos dias asitentes de Java básico!";

		String texto2="Buenos dias asitentes de Java básico!";

		System.out.println(texto.length());

		System.out.println(texto.substring(1,4));

		System.out.println(texto.toLowerCase());

		System.out.println(texto.toUpperCase());

		System.out.println(texto.equals(texto2));

		System.out.println(texto.replaceAll("Buenos","Malos"));

	}
}