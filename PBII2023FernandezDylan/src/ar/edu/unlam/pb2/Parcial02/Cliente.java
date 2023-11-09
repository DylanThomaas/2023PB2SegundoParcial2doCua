package ar.edu.unlam.pb2.Parcial02;

public class Cliente {

	private String cuit;
	private String nombre;

	public Cliente(String cuit, String nombre) {
		this.setCuit(cuit);
		this.setNombre(nombre);
		
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
