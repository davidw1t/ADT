package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setResizable(false);
		setTitle("TextoBinario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 456);
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
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.setBounds(21, 227, 89, 23);
		contentPane.add(btnAnadir);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargar.setBounds(153, 227, 89, 23);
		contentPane.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(283, 227, 89, 23);
		contentPane.add(btnGuardar);
		
		table = new JTable();
		table.setBounds(21, 278, 351, 128);
		contentPane.add(table);

	}
}
