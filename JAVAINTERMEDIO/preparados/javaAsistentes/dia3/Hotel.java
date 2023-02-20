public final class Hotel{

	//Atributos
	public int empleados;
	public int habitaciones;
	public String nombre;

	//Metodo por defecto
	public Hotel(){
	}

	public Hotel(int empleados, int habitaciones, String nombre){
		this.empleados=empleados;
		this.numhabitaciones=habitaciones;
		this.nombrehot=nombre;
		
	}

	//Métodos
	public void abrir(){

		System.out.println("El hotel esta abierto");
	}
	public void abriir(){

		System.out.println("El hotel a cerrado");
	}


}