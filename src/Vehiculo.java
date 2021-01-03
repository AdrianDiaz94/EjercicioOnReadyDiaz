
public abstract class  Vehiculo implements Comparable {

private String marca;
private String modelo;
private double precio;
public Vehiculo(String marcaV, String modeloV, double precioV) {
	this.marca=marcaV;
	this.modelo=modeloV;
	this.precio=precioV;
}
@Override
public int compareTo(Object vehiculo) {
	return (int)(((Vehiculo) vehiculo).getPrecio()- this.precio);
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

}
