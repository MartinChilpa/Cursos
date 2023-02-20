public class Operadores{
	public static void main (String[] args){

		//Raiz cuadrada

		double raiz= Math.sqrt(16);

		System.out.println(raiz);


		//Cambio de tipo 

		int raizInt=(int)Math.sqrt(16);

		System.out.println(raizInt);


		//Exponente

		double base=5, exponente=2;
		double res= Math.pow(exponente,base);

		System.out.println(res);
	}
}