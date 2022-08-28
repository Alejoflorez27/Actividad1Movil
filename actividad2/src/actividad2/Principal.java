package actividad2;

import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDatos baseD[] = new BDatos[2];
		
		baseD[0] = new Oracle("insertar","pepito","Pl/SQL","si");
		baseD[1] = new Postgres("consultar","pepito","Perl","si");
		
		for(BDatos bases: baseD) {
			System.out.println(bases.MostrarDatos());
			System.out.println("");
		}
		
	}

}
