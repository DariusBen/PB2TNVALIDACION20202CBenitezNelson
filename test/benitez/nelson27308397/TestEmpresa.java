package benitez.nelson27308397;

import static org.junit.Assert.assertEquals;

import java.util.TreeSet;

import org.junit.Test;

import benitez.nelson27308397.Camion;
import benitez.nelson27308397.Empresa;
import benitez.nelson27308397.TiendaCamion;

public class TestEmpresa {
	
	
	//Opcional
	@Test
	public void queSeAgregueUnCamion() {
	
		Empresa empresa1 = new Empresa("MAxiconsumo");
		
		Camion camion1 = new Camion("999999");
		
		empresa1.agregarCamion(camion1);

		
		assertEquals("1",empresa1.cantidadDeCamiones().toString());
		
	}
	
	
//Obligatorio
	@Test
	public void QueSeObtengaUnaListaDeCaionesTiendaOrdenadosPorPatentes() {
		
		Empresa empresa1 = new Empresa("MAxiconsumo");
		
		Camion camion1 = new Camion("ZZZZZZ");
		Camion camion2 = new Camion("AAAAAA");
		Camion camion3 = new Camion("OOOOOO");
		
		empresa1.agregarCamion(camion1);
		empresa1.agregarCamion(camion2);
		empresa1.agregarCamion(camion3);

		
		TreeSet <Camion> camiones= empresa1.obtenerTiendascamionOrdenadoPorPatente();
		
		assertEquals(camion2,camiones.first());
		assertEquals(camion1,camiones.last());
		
	}


}
