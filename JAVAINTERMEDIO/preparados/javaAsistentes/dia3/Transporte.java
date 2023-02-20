public class Transporte{

	public String matricula;
	public String marca;
	public String modelo;

	public Transporte(String matricula, String marca, String modelo){

		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}

	// public String getMatricula(){
	// 	return matricula;
	// }

	// public String getMarca(){
	// 	return marca;
	// }

	// public String getModelo(){
	// 	return modelo;
	// }
	public String mostrarDatos(){
		return  "Matricula "+matricula+"\n"+"Marca "+marca+"\n"+"Modelo "+modelo;
	}

}