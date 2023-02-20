public class Envolventes{
	public static void main(String[] args){

		//Primitivo
		int num = 20;

		//Objeto de clase envolvente
		Integer num2= 10;

		System.out.println( num+num);
		System.out.println( num2+num2);

		String numString=num.toString();
		String num2String=num2.toString();

		//====Boxing

		double x=23.90;
		Double y;

		y=x;

		//====Unboxing

		Double yU=23.90;
		double xu;

		xu=yU;
	}
}