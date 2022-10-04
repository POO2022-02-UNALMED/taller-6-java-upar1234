package Vehiculos;

public class Vehiculo {
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,String traccion, Fabricante fabricante) {
		cantidadVehiculos++;
	}
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	protected static int cantidadAutomoviles;
	protected static int cantidadCamionetas;
	protected static int cantidadCamiones;
	protected static int cantidadVehiculos;
	
	public static String vehiculosPorTipo() {
		return ("Automoviles: "+cantidadAutomoviles+"\nCamionetas: "+cantidadCamionetas+"\nCamiones: "+cantidadCamiones);
	}
	
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String p) {
		this.placa=p;
	}
	public int getPuertas() {
		return this.puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas=puertas;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public void setVelocidadMaxima( int vm) {
		this.velocidadMaxima=vm;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int p) {
		this.precio=p;
	}
	public int getPeso() {
		return this.peso;
	}
	public void setPeso(int pe) {
		this.peso=pe;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setTraccion(String t) {
		this.traccion=t;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public void setFabricante(Fabricante f) {
		this.fabricante=f;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	static public void setCantidadVehiculos(int w) {
		Vehiculo.cantidadVehiculos=w;
	}
	
}
