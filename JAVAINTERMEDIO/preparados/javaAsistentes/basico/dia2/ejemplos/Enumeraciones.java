public class Enumeraciones {
	
	public static void main (String[] args){

		for(Asistentes asistente:Asistentes.values()){
			
			System.out.println(asistente+ asistente.apellido);
		}


	}
}