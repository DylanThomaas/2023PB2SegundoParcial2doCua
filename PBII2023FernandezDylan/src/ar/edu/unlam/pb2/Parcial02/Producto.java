package ar.edu.unlam.pb2.Parcial02;

public class Producto implements Vendible{

	private String codigo;
	private Object nombre;
	private Double precio;
	private Integer cantidadInicial = 0;
	private Integer stock = 0;

	public Producto(String codigo, String nombre, Double precio) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String getNombre() {
		return (String) nombre;
	}
	
	@Override
	public Double getPrecio() {
		return precio;
	}
	
	@Override
	public String getCodigo() {
		return codigo;
	}

	public void agregarCantidad(Integer cantidad) {
		 stock = cantidadInicial + cantidad;
	}

	public Integer getCantidad() {
		return stock;
	}
	public void actualizarStock(String codigo,Integer cantidad) throws StockInsuficienteException{
		if(stock >=0) {
			if ((stock-cantidad)>=0) {
				stock = stock-cantidad;
			}else {
				throw new StockInsuficienteException();
			}
		}
	}
}
