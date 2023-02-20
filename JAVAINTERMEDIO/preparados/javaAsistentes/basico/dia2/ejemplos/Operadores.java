public class Operadores {
	
	public static void main (String[] args){

		//retorna un double

		double raiz= Math.sqrt(9);

		System.out.println(raiz);

		//Cambiando el tipo de valor

		int raizInt= (int)Math.sqrt(9);

		System.out.println(raiz);

		//========Exponente

		double base=5, exponente=2;
		double resultado= Math.pow(base,exponente);

		System.out.println(resultado);

		//======= Round

		double num= 4.1654;

		long resultado_= Math.round(num);

		System.out.println(resultado_);

		//Random

		double numero= Math.random();
		System.out.println(numero);

		//Trigono

		double valorTan=0.4;
		double res= Math.tan(valorTan);

		System.out.println(res);

		//Decimlae

		double pr=3.1416;
		double res3= Math.round(pr*100.0)/100.0;

		System.out.println(res3);

	}
}