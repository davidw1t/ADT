package controlador;

import modelo.GestorPartidos;
import vista.VentanaPrincipal;

public class Main {

	
	
	public static void main(String[] args) {
		
		 GestorPartidos gestor= new GestorPartidos();
		 VentanaPrincipal vista = new VentanaPrincipal();
		
		 
		 new ControladorPartidos(vista, gestor);
		 
		 vista.setVisible(true);
	}

}
