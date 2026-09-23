package ejercicioPrueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class escrituraSecuencial {

	
	private static final String rutaArchivo = "src/recursos/misdatos.dat";	/*Ruta fichero*/
	private static final int tamRegistro = 36;								/*tamaño registro escritura*/
	
	
	public static void main(String[] argumentos){
		try {
			escribirSecuencial();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Escribe de manera secuencial el fichero
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static  void escribirSecuencial() throws IOException,FileNotFoundException {
			
		
		File fichero = new File(rutaArchivo);
		RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
		
		String apellido[]= {"FERNANDEZ", "GIL", "LOPEZ", "RAMOS", "SEVILLA",	"CASILLA", "REY"};
		
		int dep[]= {10,20,10,10,30,30,20};
		
		double salario[]= {1000.45, 2400.60, 3000.0, 1500.56, 2200.0, 1435.87, 2000-0};
		
		StringBuffer buffer = null;
		
		
		/*Longitud array apellidos*/
		int n= apellido.length;
		
		/*Recorro el array de apellidos*/
		for (int i = 0; i < n; i++) {
			raf.writeInt(i+1);  						/*identifico el empleado con i+1*/
			buffer = new StringBuffer(apellido[i]);		/*Almaceno el empleado seleccionado*/
			buffer.setLength(10);						/*10 caracteres para el apellido del empleado*/
			raf.writeChars(buffer.toString());			/*Le inserto el apellido a ese empleado almazenado*/
			raf.writeInt(dep[i]);						/*le inserto un departamento*/
			raf.writeDouble(salario[i]);				/*Le inserto un salairo*/
			
		}
	
		raf.close();
	}
	
	/**
	 * lee secuencialmente un fichero de datos
	 * @throws FileNotFoundException 
	 */
	public void lecturaSecuencial()  {
		
		File fichero = new File(rutaArchivo);
		
		try {
			RandomAccessFile raf= new RandomAccessFile(fichero, "r");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int id, dep, posicion;
		
		Double salario;
		char apellido[]=new char[10], aux;
		posicion =0;
		
		
		
		
	}
	
	
	
	
}
