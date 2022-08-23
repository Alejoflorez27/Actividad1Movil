import javax.swing.JOptionPane;
public class Operacion {
	
	public void CalculoImc(Persona per) {
		double result = per.getPeso()/(per.getTalla()*per.getTalla());
		JOptionPane.showMessageDialog(null, "El IMC de la persona "+ per.nombre+" es: "+result);
	}
	
	

}
