package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	
	public Fabricante (String nombre, Pais pais) {
	this.nombre=nombre;
	this.pais=pais;
	HashMap<Fabricante, Integer> ventasPorFabrica= new HashMap<Fabricante, Integer>();
	}
	public void paisMasVendedor() {
		
		
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setaPais(Pais p) {
		this.pais=p;
	}
}
