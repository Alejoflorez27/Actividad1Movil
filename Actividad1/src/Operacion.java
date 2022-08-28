import javax.swing.JOptionPane;
public class Operacion {
	
	//Resive como argumento el objeto de persona y se realiza el calculo del IMC
	public void CalculoImc(Persona per) {
		double result = per.getPeso()/(per.getTalla()*per.getTalla());
		JOptionPane.showMessageDialog(null, "El IMC de la persona "+ per.getNombre()+" es: "+result);
	}
	
	

}
