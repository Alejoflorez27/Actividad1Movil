import javax.swing.JOptionPane;
public class Persona {
	
	//variables globales de la clase Persona
	private String nombre;
	private double peso,talla;	
	
	//Metodo construcctor
	public Persona(String nombre, double peso, double talla) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.talla = talla;
		
	}
	//Metodo constructor de Persona vacio
	public Persona() {

	}
	/*Metodos getters y setters*/
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
