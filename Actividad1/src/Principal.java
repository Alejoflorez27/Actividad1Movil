import javax.swing.JOptionPane;

public class Principal {
	
	public void pedirDatos() {
		
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso de la persona"));
		int talla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la talla de la persona"));
		
	}

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona"));
		double talla = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la talla de la persona"));
		
		persona.setNombre(nombre);
		persona.setPeso(peso);
		persona.setTalla(talla);
		
		Operacion operaion = new Operacion();
		operaion.CalculoImc(persona);
		
	}

}
