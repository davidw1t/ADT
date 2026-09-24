package ejercicioPrueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class escrituraLecturaAleatoria {

	private static final String rutaArchivo="src/recursos/misdatos2.dat";
	private static final int tamRegistro=36;
	
	
	public static void main(String[] args) {
		
	}
	
	
	public static void lecturaAleatoria() {
		File fichero = new File(rutaArchivo);
		
		RandomAccessFile raf=null;
		
		try {
			raf = new RandomAccessFile(fichero, "rw");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringBuffer buffer = null;
		String apellido= "SANCHEZ";
		Double salario=2400.45;
		int dep=10;
		
		
		
		
		
	}
	
	
	
	
}
