package benitez.nelson27308397;

public class Producto {

	private Integer id;
	private Double precio;
	private String descripcion;
	private Double peso;
	
	
	public Producto(Integer id, Double precio, String descripcion, Double peso) {
		super();
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
		this.peso = peso;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	} 
	

}
