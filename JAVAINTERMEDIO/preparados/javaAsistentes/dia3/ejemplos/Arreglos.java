import java.util.Scanner;

public class Arreglos{

	public static void main (String[] args){



		// // Definición tipo 1

		// int [] numeros = new int[4];

		// numeros[0]=100;
		// numeros[1]=200;
		// numeros[2]=300;
		// numeros[3]=400;

		// System.out.println(numeros[0]);
		// System.out.println(numeros);

		// for ( int i=0; i<numeros.length;i++){
		// 	System.out.println(numeros[i]);
		// }

		// // Definición tipo 2

		// int [] numeros_={1,2,3,4,5,6};

		// for ( int i=0; i<numeros_.length;i++){
		// 	System.out.println(numeros_[i]);

		// }


		// Scanner entrada= new Scanner (System.in);

		// int [] numeros2=new int[4];

		// for (int j=0; j<numeros2.length;j++){

		// 	System.out.print("Ingresa el valor de la pos "+j+" :");

		// 	numeros2[j]=entrada.nextInt();
		// }

		// for (int j=0; j<numeros2.length;j++){

		// 	System.out.println(numeros2[j]);

		// }

		// int [][] matriz={{1,2,3},{4,5,6},{7,8,9}};

		// //  1  2  3
		// //  4  5  6
		// //  7  8  9

		// for(int i=0; i<3;i++){
		// 	for(int j=0; j<3;j++){

		// 		System.out.print(matriz[i][j]+"\t");
		// 	}
		// 	System.out.print("\n");
		// }

		Scanner entrada= new Scanner (System.in);

		int matriz_[][], nFilas, nColum;

		System.out.print("Número de filas: ");
		nFilas=entrada.nextInt();

		System.out.print("Número de columnas: ");
		nColum=entrada.nextInt();

		System.out.println(nFilas+" "+nColum);

		matriz_= new int[nFilas][nColum];

		// _ _ _
		// _ _ _
		// _ _ _

		for( int m=0; m<nFilas;m++){
			for(int n=0; n<nColum;n++){

				System.out.print("Matriz["+m+"]["+n+"]: ");
				matriz_[m][n]=entrada.nextInt();

			}
		}

		for( int m=0; m<nFilas;m++){
			for(int n=0; n<nColum;n++){

				System.out.print(matriz_[m][n]);
			}
		}


	}
}