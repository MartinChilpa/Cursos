public enum Asistentes{
	NOM("Nom",1),
	NOM1("Nom2",2),
	NOM2("Nom3",3),
	NOM3("Nom4",4); 

	public String apellido;
	public int edad;

	private Asistentes(String a, int b){
		apellido=a;
		edad=b;
	}
}