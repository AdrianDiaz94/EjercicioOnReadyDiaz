
public class Moto extends Vehiculo {
private int cilindrada;
public Moto(int cilindrada,String marcaV, String modeloV, double precioV) {
		super(marcaV, modeloV, precioV);
		this.cilindrada=cilindrada;
	}
@Override
public String toString() {
	return "Marca: "+super.getMarca() + " // Modelo: "+
			super.getModelo()+" // Cilindradas: "+ this.cilindrada
			+ " // Precio: " + super.getPrecio();
}



}
