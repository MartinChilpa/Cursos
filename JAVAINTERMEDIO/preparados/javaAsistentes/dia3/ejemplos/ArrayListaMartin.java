import java.util.ArrayList;

public class ArrayListaMartin{
	public static void main(String[] args){

		ArrayList <String> listanombres= new ArrayList<String>();

		ArrayList <Integer> listanum= new ArrayList<Integer>();

		Vehiculo carro = new Vehiculo ("ABC-123","Nissan","Tsuru");

		Vehiculo camioneta = new Vehiculo ("WER-1","Audi","A3");

		Vehiculo moto = new Vehiculo ("FDA-2","Toyota","Yaris");

		Vehiculo camion = new Vehiculo ("IOD-20","BMW","Camion Bmw");


		ArrayList <Vehiculo> lisVehiculo= new ArrayList <Vehiculo>();

		lisVehiculo.add(carro);
		lisVehiculo.add(camioneta);
		lisVehiculo.add(moto);
		lisVehiculo.add(camion);

		for(Vehiculo v: lisVehiculo){
			System.out.println(v.mostrarDatos());	
		}




		// ArrayList <String> listVehiculo=

/*
		
		listanum.add(10);
		listanum.add(11);
		listanum.add(12);
		listanum.add(13);
		listanum.add(14);

		for (Integer num: listanum){
			System.out.println(num);
		}

		listanombres.add("Ulises");
		listanombres.add("Nat");
		listanombres.add("Oscar");
		listanombres.add("Alonso");
		listanombres.add("Joana");

		for (String e: listanombres){
			System.out.println(e);
		}

		System.out.println("======= Se elimina a Ulises y a Oscar");

		listanombres.remove("Ulises");
		listanombres.remove("Oscar");

		//System.out.println(listanombres[0]);

		for (String e: listanombres){
			System.out.println(e);
		}

		System.out.print("Se accede al segundo elemento: ");							

		System.out.println(listanombres.get(1));

		System.out.println(listanombres.indexOf("Joana"));

		listanombres.remove(2);

		for (String e: listanombres){
			System.out.println(e);
		}

		*/

	}
}