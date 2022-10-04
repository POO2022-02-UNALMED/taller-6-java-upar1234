package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion (String placa, String nombre, int precio, int peso,  Fabricante fabricante, int ejes){	
		super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
		this.ejes=ejes;
		cantidadCamiones++;
		
	}
	public int getEjes() {
		return this.ejes;
	}
	public void setEjes(int e) {
		this.ejes=e;
	}
	public static int getCantidadCamiones() {
		return Camion.cantidadCamiones;
	}
	public void setCantidadCamiones(int s) {
		this.cantidadCamiones=s;
	}
}
