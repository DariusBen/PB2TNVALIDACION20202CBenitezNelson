package benitez.nelson27308397;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import benitez.nelson27308397.Camion;
import benitez.nelson27308397.Producto;
import benitez.nelson27308397.TiendaCamion;

public class TestCamion {
	

	//opcional
	@Test
	public void queSeAgregueUnProducto() {
	
		Camion miCamion = new Camion("ABC123");
		Producto producto1 = new Producto(1, 20.0, "Prodcuto1", 200.0);

		miCamion.cargarProducto(producto1);		
		
		
		
		assertEquals("Prodcuto1",miCamion.getListaProductos().get(0).getDescripcion());
	
	}
	
	//opcional
	@Test
	public void queSeDescargueUnProducto() throws ProductoInexistenteException {

		Camion miCamion = new Camion("ABC123");
		Producto producto1 = new Producto(1, 20.0, "Prodcuto1", 200.0);
		Producto producto2 = new Producto(2, 30.0, "Prodcuto3", 300.0);

		miCamion.cargarProducto(producto1);		
		miCamion.cargarProducto(producto2);		

		Producto productoDescargado = miCamion.descargarProducto(2);		
		
		
		
		assertEquals("Prodcuto3",productoDescargado.getDescripcion());
	
	}
	
	//obligatorio
	@Test (expected = ProductoInexistenteException.class)
	public void queDescargueUnProductoInexistenteLanceUnaException() throws ProductoInexistenteException {
	
		Camion miCamion = new Camion("ABC123");
		Producto producto1 = new Producto(1, 20.0, "Prodcuto1", 200.0);
		Producto producto2 = new Producto(2, 30.0, "Prodcuto3", 300.0);

		miCamion.cargarProducto(producto1);		
		miCamion.cargarProducto(producto2);		

		Producto productoDescargado = miCamion.descargarProducto(3);		
		
		
		
		assertEquals("Prodcuto3",productoDescargado.getDescripcion());
		
	}
	
}
