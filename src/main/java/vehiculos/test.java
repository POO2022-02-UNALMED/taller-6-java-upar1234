package vehiculos;

public class test {

	public static void main(String[] args) {
	
		System.out.println(p);
	}
	public static Pais p = new Pais("Colombia");
	
	public static Fabricante f = new Fabricante("Renault", p);
	public void testAutomovil(){
		
		Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);
		
		boolean ok = false;
		if(ve.getPuertas() == 4 && ve.getTraccion().equals("FWD")
				&& ve.getVelocidadMaxima() ==  100) {
			ok = true;
		}
    }
}
