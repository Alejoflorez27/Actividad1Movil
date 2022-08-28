import javax.swing.JOptionPane;

public class Principal {
	
	
	public static void main(String[] args) {
		
		//Creo un objeto de la clase Persona
		Persona persona = new Persona();
		
		
		//Pedir datos de la persona por pantalla
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona"));
		double talla = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la talla de la persona"));
		
		//Se le establecen los datos a la persona
		persona.setNombre(nombre);
		persona.setPeso(peso);
		persona.setTalla(talla);
		
		//Se crea el objeto de la clase Operacion
		Operacion operaion = new Operacion();
		
		//Llamo el objeto y le indico el metodo de la clase Operacion y le mando por parametro la persona
		operaion.CalculoImc(persona);
		
	}

}
