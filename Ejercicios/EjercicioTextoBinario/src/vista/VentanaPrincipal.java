package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Partido;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldLocal;
	private JTextField textFieldVisitante;
	private JTextField textFieldGolLocal;
	private JTextField textFieldGolVisitante;
	private JTextField textFieldLugar;
	private JTextField textFieldFecha;
	private JTable table;
	private DefaultTableModel modeloTabla;
	private JButton btnCargar;
	private JButton btnGuardar;
	private JButton btnAnadir;
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setResizable(false);
		setTitle("TextoBinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLocal = new JLabel("Equipo local");
		lblLocal.setBounds(21, 11, 76, 14);
		contentPane.add(lblLocal);
		
		JLabel lblVisitante = new JLabel("Equipo Visitante");
		lblVisitante.setBounds(21, 39, 76, 14);
		contentPane.add(lblVisitante);
		
		JLabel lblGolLocal = new JLabel("Goles local");
		lblGolLocal.setBounds(21, 73, 76, 14);
		contentPane.add(lblGolLocal);
		
		JLabel lblGolVisitante = new JLabel("Goles Visitante");
		lblGolVisitante.setBounds(21, 104, 76, 14);
		contentPane.add(lblGolVisitante);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(21, 140, 76, 14);
		contentPane.add(lblLugar);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(21, 175, 76, 14);
		contentPane.add(lblFecha);
		
		textFieldLocal = new JTextField();
		textFieldLocal.setBounds(129, 8, 86, 20);
		contentPane.add(textFieldLocal);
		textFieldLocal.setColumns(10);
		
		textFieldVisitante = new JTextField();
		textFieldVisitante.setBounds(129, 36, 86, 20);
		contentPane.add(textFieldVisitante);
		textFieldVisitante.setColumns(10);
		
		textFieldGolLocal = new JTextField();
		textFieldGolLocal.setBounds(129, 70, 86, 20);
		contentPane.add(textFieldGolLocal);
		textFieldGolLocal.setColumns(10);
		
		textFieldGolVisitante = new JTextField();
		textFieldGolVisitante.setBounds(129, 101, 86, 20);
		contentPane.add(textFieldGolVisitante);
		textFieldGolVisitante.setColumns(10);
		
		textFieldLugar = new JTextField();
		textFieldLugar.setBounds(129, 137, 86, 20);
		contentPane.add(textFieldLugar);
		textFieldLugar.setColumns(10);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(129, 172, 86, 20);
		contentPane.add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
		
		String [] col = {"Equipo Local", "Equipo Visitante","Goles Local","Goles Visitante","Lugar","Fecha"};
		modeloTabla = new DefaultTableModel(col, 0);
		
		table = new JTable(modeloTabla);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(21, 278, 583, 128);
		contentPane.add(scroll);
		
		
		btnAnadir = new JButton("Añadir");
		btnAnadir.setLocation(55, 235);
		btnAnadir.setSize(86, 32);
		getContentPane().add(btnAnadir);
		
		
		btnCargar = new JButton("Cargar");
		btnCargar.setLocation(221, 235);
		btnCargar.setSize(91, 32);
		getContentPane().add(btnCargar);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setLocation(415, 241);
		btnGuardar.setSize(91, 26);
		getContentPane().add(btnGuardar);
	}

	
	public JTextField getTextFieldLocal() {
		return textFieldLocal;
	}


	public JTextField getTextFieldVisitante() {
		return textFieldVisitante;
	}


	public JTextField getTextFieldGolLocal() {
		return textFieldGolLocal;
	}


	public JTextField getTextFieldGolVisitante() {
		return textFieldGolVisitante;
	}


	public JTextField getTextFieldLugar() {
		return textFieldLugar;
	}

	public JTextField getTextFieldFecha() {
		return textFieldFecha;
	}



	public JButton getBtnAnadir() {
		return btnAnadir;
	}
	public JButton getBtnCargar() {
		return btnCargar;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	
	
	public void VaciarCampos() {
		textFieldLocal.setText("");
		textFieldVisitante.setText("");
		textFieldGolLocal.setText("");
		textFieldGolVisitante.setText("");
		textFieldLugar.setText("");
		textFieldFecha.setText("");
	}
	
	
	public void refrescarTabla(ArrayList<Partido> partidos) {
		modeloTabla.setRowCount(0);
		
		for(Partido p: partidos) {
			Object[] row = {p.getEquipoLoc(),p.getEquipoVis(),p.getGolesLoc(),p.getGolesVis(),p.getLugar(),p.getFecha()};
			modeloTabla.addRow(row);
		}
		
	}
	
}
