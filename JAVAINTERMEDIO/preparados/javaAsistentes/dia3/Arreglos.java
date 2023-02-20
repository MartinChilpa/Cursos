import java.util.Scanner;


public class Arreglos{
	public static void main (String[] args){


		
		//por valor
		int [] numeros= new int[3];
		numeros[0]=5;
		numeros[1]=10;
		numeros[2]=11;

		System.out.println(numeros);

		//Una sola linea

		int[] numeros_={1,2,3};


		for (int i=0; i<numeros.length;i++){
			System.out.println(i);
		}

		//Asignando valores

		Scanner entrada=new Scanner (System.in);

		int[] numeros2=new int[4];

		for(int j=0; j<numeros2.length; j++){

			System.out.print("Ingresa el valor"+(j+1)+": ");

			numeros2[j]= entrada.nextInt();
		}


		for(int j=0; j<numeros2.length; j++){

			System.out.println(numeros2[j]);

		}

		// Scanner entrada=new Scanner (System.in);

		// System.out.print("Ingresa nombre: ");

		// String nombre = entrada.nextLine();

		// System.out.println(nombre);

		//Matrices

		int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0; i<3; i++){
			for(int j=0;j<3;j++){

				System.out.println(matriz[i][j]);
			}
		}


		//Matriz llenada
		Scanner entrada=new Scanner (System.in);


		int matriz_[][],nFilas,nColumnas;


		System.out.print("Número de filas: ");
		nFilas= entrada.nextInt();

		System.out.print("Número de columnas: ");
		nColumnas= entrada.nextInt();

		matriz_=new int[nFilas][nColumnas];

		for(int m=0; m<nFilas; m++){
			for(int n=0; n<nColumnas; n++){

				System.out.print("Matriz ["+m+"]["+n+"]: ");
				matriz_[n][m]=entrada.nextInt();


			}
		}

		for(int m=0; m<nFilas; m++){
			for(int n=0; n<nColumnas; n++){

				System.out.print(matriz_[n][m]);
			
			}
		}


			}
}