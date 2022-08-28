package actividad2;

public class Postgres extends BDatos implements Operaciones{
	
	private String datosPropios;
	
	

	public Postgres(String peticion, String nombreBD, String idiomaProcedimiento, String datosPropios) {
		super(peticion, nombreBD, idiomaProcedimiento);
		this.datosPropios = datosPropios;
	}
	
	

	public String getDatosPropios() {
		return datosPropios;
	}



	public void setDatosPropios(String datosPropios) {
		this.datosPropios = datosPropios;
	}



	@Override
	public void conectarBD() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String MostrarDatos() {
		
		return "peticion: "+peticion+"\nnombre:"+nombreBD+
				"\nIdiomas para escribir procedimientos almacenados:"
				+idiomaProcedimiento+"\nPermiten datos propios:"+datosPropios;
		
	}
	
	
}



