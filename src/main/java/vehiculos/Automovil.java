package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos=puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	public void setPuestos(int p) {
		this.puestos=p;
	}
	public static int getCantidadAutomoviles() {
		return Automovil.cantidadAutomoviles;
	}
	public void setCantidadAutomoviles(int n) {
		Automovil.cantidadAutomoviles=n;
	}
}
