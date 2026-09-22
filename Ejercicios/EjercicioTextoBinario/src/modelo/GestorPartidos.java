package modelo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorPartidos {

	
	private ArrayList<Partido> partidos = new ArrayList<>();
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	
	public void guardarPartidos(String resultadoFichero) throws Exception {
		
		FileOutputStream fos = new FileOutputStream(resultadoFichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		for (Partido p : partidos) {
			oos.writeObject(p);
		}
		oos.close();
	}
	
	
	public int cargarPartidos(String resultadoFichero) throws Exception {
		partidos.clear();
		FileInputStream fis = new FileInputStream(resultadoFichero);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				Partido p = (Partido)ois.readObject();
				partidos.add(p);
			}
		
		}catch(EOFException e){
			
		}
		ois.close();
		return partidos.size();
	}
	
	
	
}
