
public class Auto extends Vehiculo{
private int cantPuertas;

public Auto(int cantPuertas,String marcaV, String modeloV,double d) {
	super(marcaV,modeloV,d);
	this.cantPuertas = cantPuertas;
}

@Override
public String toString() {
	return "Marca: "+super.getMarca() + " // Modelo: "+
			super.getModelo()+" // Puertas: "+ this.cantPuertas
			+ " // Precio: " + super.getPrecio();
}


}
