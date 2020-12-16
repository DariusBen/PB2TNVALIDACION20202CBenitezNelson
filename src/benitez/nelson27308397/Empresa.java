package benitez.nelson27308397;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


public class Empresa {

	// completar la clase Empresa

	// si es necesraio agregue los metodos atributos y clases que crea que sea
	// conveniente
	private String nombre;
	private HashMap<Integer, Camion> flota;
	private int cantidadDeCamiones = 0;
	

	public Empresa() {

	}

	public Empresa(String nombre) {

		this.nombre = nombre;
		flota = new HashMap<Integer,Camion>();
	}

	public void agregarCamion(Camion camion) {

		if(!flota.containsKey(camion)) {
			
			cantidadDeCamiones++;
			
			flota.put(cantidadDeCamiones, camion);

		}

	}

	public Integer cantidadDeCamiones() {

		return cantidadDeCamiones;
	}

	public TreeSet<Camion> obtenerTiendascamionOrdenadoPorPatente() {
		TreeSet<Camion> flotaTotal = new TreeSet<Camion>(new ordenarPorPatente());
	
		

		for (Map.Entry<Integer, Camion> camion : flota.entrySet()) {
			
			flotaTotal.add(camion.getValue());
		}
	
		return flotaTotal;
	}

}
