import java.util.ArrayList;

public class ArrayListM{
	public static void main(String[] args){

		ArrayList <String> listanombres= new ArrayList<String>();

		ArrayList <Integer> listanum= new ArrayList<Integer>();

		listanum.add(199);

		Transporte tra =new Transporte("2000","2","2");

		ArrayList <Transporte> listaTra=new ArrayList<Transporte>();

		listaTra.add(tra);

		for(Transporte e: listaTra){
			System.out.println(e.matricula);
		}

		for(Integer e: listanum){
			System.out.println(e);
		}


		listanombres.add("Daniela");
		listanombres.add("Ulises");

		listanombres.add("Martin");

		listanombres.set(0,"Yo");

		System.out.println(listanombres.size());

		for (String e: listanombres){
			System.out.println(e);
		}

		// System.out.println(listanombres[0]);

		System.out.println(listanombres.get(0));
		System.out.println(listanombres.indexOf("Martin"));
		listanombres.remove("Martin");

		for (String e: listanombres){
			System.out.println(e);
		}



	}
}