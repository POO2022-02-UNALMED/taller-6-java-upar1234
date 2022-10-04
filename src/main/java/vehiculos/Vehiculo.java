package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	protected static int cantidadVehiculos=Automovil.getCantidadAutomoviles()+Camion.getCantidadCamiones()+Camioneta.getCantidadCamionetas();
	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,String traccion, Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		
		if (Pais.ventasPorPais.containsKey(fabricante.getPais())) {
			Pais.ventasPorPais.put(fabricante.getPais(), Pais.ventasPorPais.get(fabricante.getPais())+1);
		}else {
			Pais.ventasPorPais.put(fabricante.getPais(), 1);
		}
		if	(Fabricante.ventasPorFabrica.containsKey(fabricante)){
			Fabricante.ventasPorFabrica.put(fabricante, Fabricante.ventasPorFabrica.get(fabricante)+1);
		}else {
			Fabricante.ventasPorFabrica.put(fabricante, 1);
		}
		cantidadVehiculos++;	
	}

	public static String vehiculosPorTipo() {
		return ("Automoviles: "+Automovil.getCantidadAutomoviles()+"\nCamionetas: "+Camioneta.getCantidadCamionetas()+"\nCamiones: "+Camion.getCantidadCamiones());
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
