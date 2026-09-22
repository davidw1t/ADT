package controlador;

import javax.swing.JOptionPane;

import modelo.GestorPartidos;
import modelo.Partido;
import vista.VentanaPrincipal;

public class ControladorPartidos {

	private VentanaPrincipal vista;
	private GestorPartidos gestor;
	private static final String ruta="../Resultado.dat";
	
	
	public ControladorPartidos(VentanaPrincipal vista, GestorPartidos gestor) {
		this.vista = vista;
		this.gestor = gestor;
		
		vista.getBtnAnadir().addActionListener(e->anadirPartido());
		vista.getBtnCargar().addActionListener(e->cargarPartidos());
		vista.getBtnGuardar().addActionListener(e->guardarPartidos());
		
		
	}
	
	
	
	
	public void anadirPartido() {
		String equipoLoc=vista.getTextFieldLocal().getText();
		String equipoVis=vista.getTextFieldVisitante().getText();
		String golesLoc=vista.getTextFieldGolLocal().getText();
		String golesVis=vista.getTextFieldGolVisitante().getText();
		String lugar=vista.getTextFieldLugar().getText();
		String fecha=vista.getTextFieldFecha().getText();
		
		if(!validarTexto(equipoLoc)||!validarTexto(equipoVis)) {
			JOptionPane.showMessageDialog(vista, "Error, texto debe ser menos a 20 caracteres y mas de 0");
			return;
		}
		
		if(!validarGoles(golesLoc)||!validarGoles(golesVis)) {
			JOptionPane.showMessageDialog(vista,"Error, inserta numeros positivos menores a 20");
			return;
		} 
		
		
		if(!validarFecha(fecha)) {
			JOptionPane.showMessageDialog(vista, "Error, fecha erronea, formato dd/mm/aa");
			return;
		}
		
		int golesLocal = Integer.parseInt(golesLoc);
		
		int golesVisitante = Integer.parseInt(golesVis);
		
		Partido pNuevo = new Partido(equipoLoc, equipoVis, golesLocal, golesVisitante, lugar, fecha);
		gestor.getPartidos().add(pNuevo);
		vista.VaciarCampos();
		vista.refrescarTabla(gestor.getPartidos());
	}
	
	public void cargarPartidos() {
		try {
			int total= gestor.cargarPartidos(ruta);
			vista.refrescarTabla(gestor.getPartidos());
			JOptionPane.showMessageDialog(vista, "Se han cargado " + total+ " partidos");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(vista, "Error al cargar partidos " + e);
		}
	}
	
	public void guardarPartidos() {
		try {
			gestor.guardarPartidos(ruta);
			JOptionPane.showMessageDialog(vista, "Los partidos se han guardado correctamente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(vista, "Error al guardar partidos " + e);
		}
	}
	
	
	
	private boolean validarTexto(String txt) {
		
		return txt.matches("^[a-zA-Z0-9 ]{1,20}$");
	}
	
	private boolean validarGoles(String goles) {
		
		return goles.matches("^[0-9]{1,2}$");
	}
	
	
	private boolean validarFecha(String fecha) {
		return fecha.matches("^\\d{2}/\\d{2}/\\d{2}$");
	}
	
}
