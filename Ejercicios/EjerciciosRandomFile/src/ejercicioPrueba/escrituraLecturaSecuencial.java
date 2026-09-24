package ejercicioPrueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class escrituraLecturaSecuencial {

	
	private static final String rutaArchivo = "src/recursos/misdatos.dat";	/*Ruta fichero*/
	private static final int tamRegistro = 36;								/*tamaño registro escritura*/
	
	
	public static void main(String[] argumentos){
		try {
			escribirSecuencial();
			lecturaSecuencial();
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
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void lecturaSecuencial() throws IOException  {
		
		File fichero = new File(rutaArchivo);
		
		RandomAccessFile raf=null;
		
		try {
			raf= new RandomAccessFile(fichero, "r");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int id, dep, posicion;
		
		Double salario;
		char apellido[]=new char[10];
		char aux;
		posicion =0;
		
		
		raf.seek(posicion);
		
		while(raf.getFilePointer()<raf.length()) {
			id=raf.readInt();
			
			for (int i = 0; i < apellido.length; i++) {
				aux=raf.readChar();
				apellido[i]=aux;
			}
			
			String apellidos=new String(apellido);
			dep=raf.readInt();
			salario=raf.readDouble();
			if(id>0) {
				System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f%n", id, apellidos.trim(), dep, salario);
				
			posicion=posicion+36;
			
			}
		}
		raf.close();
	}
	
	
	
	
}
