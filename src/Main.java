import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
		
		cargarVehiculos(vehiculos);		
	
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
		Collections.sort(vehiculos);
		System.out.println("=====================");
		System.out.println("Vehículo más caro: "+ vehiculos.get(0).getMarca() + " "+ vehiculos.get(0).getModelo());
		System.out.println("Vehículo más barato: "+ vehiculos.get(vehiculos.size()-1).getMarca()+" "+vehiculos.get(vehiculos.size()-1).getModelo());
		Vehiculo vehiculoY=obtenerVehiculoConY(vehiculos);
		try {
		System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculoY.getMarca()+ " " +vehiculoY.getModelo()+" "+vehiculoY.getPrecio() );
		
		}catch(Exception e) {
			System.out.println("no existe ningún vehículo que contiene en el modelo la letra 'Y'");
		}
		System.out.println("=====================\nVehículos ordenados por precio de mayor a menor:");
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo.getMarca()+ " "+ vehiculo.getModelo());
		}
	

	}
private static  Vehiculo obtenerVehiculoConY(List<Vehiculo> vehiculos) {
	 for (Vehiculo vehiculo : vehiculos) {
		if(vehiculo.getModelo().contains("y") || vehiculo.getModelo().contains("Y"))
			return vehiculo;
	}
	return null;	
}
private static void cargarVehiculos(List<Vehiculo> vehiculos) {
		
	vehiculos.add( new Auto(4,"Peugeot","206",200000.00));
	vehiculos.add( new Moto(125,"Honda","Titan",60000.00));
	vehiculos.add( new Auto(5,"Peugeot","208",250000.00));
	vehiculos.add( new Moto(160,"Yamaha","YBR",80500.50));
}
}
