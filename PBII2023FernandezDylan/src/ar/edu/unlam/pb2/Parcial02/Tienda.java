package ar.edu.unlam.pb2.Parcial02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tienda {

	private String codigo;
	private String nombre;

	private Set<Cliente> listaClientes;
	private Set<Vendedor> listaVendedores;
	private Set<Venta> listaDeVentas;
	private Set<Producto> listaProductos;
	private Set<Servicio> listaServicios;
	

	public Tienda(String codigo, String nombre) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		listaProductos = new HashSet<Producto>();
		listaClientes = new HashSet<Cliente>();
		listaVendedores = new HashSet<Vendedor>();
		listaDeVentas = new HashSet<Venta>(); 
		listaServicios = new HashSet<Servicio>(); 
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

	public void agregarProducto(Producto producto, Integer cantidad) {
		listaProductos.add(producto);
		producto.agregarCantidad(cantidad);
	}

	public Producto getVendible(String codigoProducto) throws VendibleInexistenteException {
    	for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigoProducto)) {
                return producto;
            }
        }
		 throw new VendibleInexistenteException();
	}

	public Integer getStock(String codigoProducto)throws VendibleInexistenteException {
    	for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigoProducto)) {
                return producto.getCantidad();
            }
        }
		 throw new VendibleInexistenteException();
	}

	public void agregarCliente(Cliente cliente) {
		listaClientes.add(cliente);		
	}

	public Cliente getCliente(String cuitCliente) throws ClienteInexistenteException {
    	for (Cliente cliente : listaClientes) {
            if (cliente.getCuit().equals(cuitCliente)) {
                return cliente;
            }
        }
		 throw new ClienteInexistenteException();
	}

	public void agregarVendedor(Vendedor vendedor) {
		listaVendedores.add(vendedor);	
	}

	public Vendedor getVendedor(String dniVendedor) throws VendedorInexistenteException {
    	for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getDni().equals(dniVendedor)) {
                return vendedor;
            }
        }
		 throw new VendedorInexistenteException();
	}

	public void agregarVenta(Venta ticket) {
		listaDeVentas.add(ticket);
	}


	public void agregarProductoAVenta(String ticket, Producto producto, Integer cantidadVendida) throws StockInsuficienteException {
    	for (Venta venta : listaDeVentas) {
            if (venta.getCodigo().equals(ticket)) {
            	venta.agregarProducto(producto, cantidadVendida);
            }
        }
		
	}

	public void agregarServicio(Servicio servicio) {
		listaServicios.add(servicio);
		
	}

	public void agregarServicioAVenta(String ticket, Servicio servicio) {

    	for (Venta venta : listaDeVentas) {
            if (venta.getCodigo().equals(ticket)) {
            	venta.agregarServicio(servicio);
            }
        }
	}
}

