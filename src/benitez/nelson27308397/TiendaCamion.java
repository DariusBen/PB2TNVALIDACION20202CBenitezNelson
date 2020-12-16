package benitez.nelson27308397;

import java.util.ArrayList;
import java.util.List;


/*
 * La clase tiendaCamion pertenece a la familia de los camiones y tambien se comporta como una tienda
 * 
 * Desarrolle  e implemente los metodos pedido para que la clase cumpla con sus funcionalidades
 */
public class TiendaCamion  implements ITienda {
	private List<Producto> ventas;
	private Boolean estadoDeCaja; // True Abierta - False Cerrada
	String patente = "";
	
	public TiendaCamion(String Patente) {
		
		this.patente = Patente;
		
		
	}

	
	

	public void abrirCaja() {
		// Al Inicicio del dia limpia todas las ventas
		// y abre la caja diaria
		
			if (!estadoDeCaja)
			{
				estadoDeCaja = true;
				
				ventas= new ArrayList<Producto>();
				
			}
			
			
	}




	@Override
	public void vender(Integer idProducto) {
		// TODO Auto-generated method stub
		
	}


	public int cantidadVentasCamionTienda()
	{
		int cantidad = 0;
		
		if (ventas != null)
		{
			cantidad = ventas.size() + 1;
		}	
		return cantidad;
		
	}
	


	@Override
	public Reporte cierreZ() {
		
		// TODO Auto-generated method stub
		
		estadoDeCaja = false;
		return null;
	}


}
