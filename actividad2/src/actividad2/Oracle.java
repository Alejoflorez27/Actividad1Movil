package actividad2;

public class Oracle extends BDatos implements Operaciones{
	
	private String convPaginas;
	

	public Oracle(String peticion, String nombreBD, String idiomaProcedimiento, String convPaginas) {
		super(peticion, nombreBD, idiomaProcedimiento);
		this.convPaginas = convPaginas;
	}
	

	public String getConvPaginas() {
		return convPaginas;
	}


	public void setConvPaginas(String convPaginas) {
		this.convPaginas = convPaginas;
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
				+idiomaProcedimiento+"\nPermite conversion de paginas: "+convPaginas;
		
	}
	
	
	
}


