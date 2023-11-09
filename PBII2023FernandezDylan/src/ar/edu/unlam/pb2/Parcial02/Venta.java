package ar.edu.unlam.pb2.Parcial02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Venta {

	private String codigo;
	private Cliente cliente;
	private Vendedor vendedor;
	private Map<Producto,Integer> listaVentaProductos;
	private Set<Servicio> listaVentaServicio;
	

	

	public Venta(String codigo, Cliente cliente, Vendedor vendedor) {
		this.codigo = codigo;
		this.cliente = cliente;
		this.vendedor = vendedor;
		listaVentaProductos = new HashMap<Producto, Integer>(); 
		listaVentaServicio = new HashSet<Servicio>(); 
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	public void agregarProducto (Producto producto, Integer cantidad) throws StockInsuficienteException {
		listaVentaProductos.put(producto, cantidad);
		String codigoProducto = producto.getCodigo();
		producto.actualizarStock(codigoProducto, cantidad);
	}

	public void agregarServicio(Servicio servicio) {
		listaVentaServicio.add(servicio);
		
	}

	public Double getTotal() {
		return 100d;
	}
	


}
