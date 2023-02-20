public class Vehiculo{

	public String matricula;
	public String marca;
	public String modelo;

	public Vehiculo(String matricula, String marca, String modelo){

		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}

	public String mostrarDatos(){
		return "Matricula: "+matricula+"\n"+"Marca: "+marca+"\n"+"Modelo: "+modelo+"\n==============";
	}
}