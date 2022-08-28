package actividad2;

public abstract class BDatos {
	
	protected String peticion;
	protected String nombreBD;
	protected String idiomaProcedimiento;
	
	public BDatos(String peticion, String nombreBD, String idiomaProcedimiento) {
		this.peticion = peticion;
		this.nombreBD = nombreBD;
		this.idiomaProcedimiento = idiomaProcedimiento;
	}
	
	

	public String getPeticion() {
		return peticion;
	}

	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}

	public String getNombreBD() {
		return nombreBD;
	}

	public void setNombreBD(String nombreBD) {
		this.nombreBD = nombreBD;
	}

	public String getIdiomaProcedimiento() {
		return idiomaProcedimiento;
	}

	public void setIdiomaProcedimiento(String idiomaProcedimiento) {
		this.idiomaProcedimiento = idiomaProcedimiento;
	}
	
	public String MostrarDatos() {
		
		return "peticion: "+peticion+"\nnombre"+nombreBD+
				"\nIdiomas para escribir procedimientos almacenados"+idiomaProcedimiento;
		
	}
	
	
	

}
