package ar.edu.unlam.pb2.Parcial02;

public class Servicio {

	private String codigo;
	private String nombre;
	private Double precio;
	private String fecha1;
	private String fecha2;

	public Servicio(String codigo, String nombre, Double precio, String fecha1, String fecha2) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setFecha1(fecha1);
		this.setFecha2(fecha2);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getFecha1() {
		return fecha1;
	}

	public void setFecha1(String fecha1) {
		this.fecha1 = fecha1;
	}

	public String getFecha2() {
		return fecha2;
	}

	public void setFecha2(String fecha2) {
		this.fecha2 = fecha2;
	}

	
}
