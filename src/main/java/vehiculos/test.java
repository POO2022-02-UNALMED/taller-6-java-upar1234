package vehiculos;

public class test {

	public static void main(String[] args) {
		Vehiculo ve = new Automovil("AA", "Carro", 100, 20, f, 4);
		System.out.println(ve);
		
		}
	public static Pais p = new Pais("Colombia");
	
	public static Fabricante f = new Fabricante("Renault", p);
	}
    
