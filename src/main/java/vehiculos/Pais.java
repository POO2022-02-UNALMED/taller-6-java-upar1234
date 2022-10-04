package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pais {
	private String nombre;
	static Map<Pais, Integer> ventasPorPais= new HashMap<Pais, Integer>();	
	
	
	public Pais(String nombre) {
		this.nombre=nombre;
	}
	public Pais paisMasVendedor() {
		
		int valorMax=-1;
		Pais paisMasVendedor=null;
		
		for(Entry<Pais, Integer> entry : ventasPorPais.entrySet()){
			final int valorActual = entry.getValue();
			
			if(valorActual>valorMax)
			{
				valorMax=valorActual;
				paisMasVendedor=entry.getKey();
			}
		}
		return paisMasVendedor;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
}
