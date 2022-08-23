import javax.swing.JOptionPane;
public class Persona {

	public String nombre;
	
	public double peso,talla;	

	public Persona(String nombre, double peso, double talla) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.talla = talla;
		
	}
	
	public Persona() {

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getTalla() {
		return talla;
	}



	public void setTalla(double talla) {
		this.talla = talla;
	}


}
