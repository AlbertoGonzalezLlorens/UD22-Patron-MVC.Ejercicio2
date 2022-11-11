package views;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class VistaVideos extends JFrame {

	private JPanel contentPane;
	public JLabel lblVerElementos;
	public JButton btnVerelementos;
	public JScrollPane scrollPane;
	public JTextField txtTitle;
	public JTextField txtDirector;
	public JTextField txtIdCliente;
	public JLabel lblNewLabel;
	public JLabel lblApellido;
	public JLabel lblIdCliente;
	public JButton btnInsertarValores;
	public JTextPane textPane;
	public JLabel lblEliminarConsulta;
	public JTextField txtEliminar;
	public JButton btnConexion;
	public JTextField textUpdate;
	public JButton btnUpdate;
	public JButton btnEliminar;

	/**
	 * Create the frame.
	 */
	public VistaVideos() {
		setTitle("Videos");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblVerElementos = new JLabel("Insertar elementos");
		lblVerElementos.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblVerElementos.setBounds(506, 21, 138, 35);
		contentPane.add(lblVerElementos);
		
		btnVerelementos = new JButton("Ver Elementos");
		btnVerelementos.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnVerelementos.setBounds(62, 10, 138, 35);
		contentPane.add(btnVerelementos);
		
		textPane = new JTextPane();
		
		scrollPane = new JScrollPane(textPane);
		scrollPane.setBounds(62, 73, 336, 386);
		contentPane.add(scrollPane);
		
		txtTitle = new JTextField();
		txtTitle.setToolTipText("");
		txtTitle.setBounds(526, 73, 86, 20);
		contentPane.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtDirector = new JTextField();
		txtDirector.setColumns(10);
		txtDirector.setBounds(526, 111, 86, 20);
		contentPane.add(txtDirector);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setColumns(10);
		txtIdCliente.setBounds(526, 147, 86, 20);
		contentPane.add(txtIdCliente);
		
		lblNewLabel = new JLabel("Title");
		lblNewLabel.setBounds(459, 75, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblApellido = new JLabel("Director");
		lblApellido.setBounds(459, 113, 46, 14);
		contentPane.add(lblApellido);
		
		lblIdCliente = new JLabel("Id Cliente");
		lblIdCliente.setBounds(459, 149, 46, 14);
		contentPane.add(lblIdCliente);
		
		btnInsertarValores = new JButton("Insertar Valores");
		btnInsertarValores.setBounds(485, 200, 138, 23);
		contentPane.add(btnInsertarValores);
		
		lblEliminarConsulta = new JLabel("Eliminar registro (id)");
		lblEliminarConsulta.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblEliminarConsulta.setBounds(506, 254, 138, 35);
		contentPane.add(lblEliminarConsulta);
		
		txtEliminar = new JTextField();
		txtEliminar.setBounds(506, 299, 128, 20);
		contentPane.add(txtEliminar);
		txtEliminar.setColumns(10);
		
		btnConexion = new JButton("Conexion segundo Jframe");
		btnConexion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConexion.setBounds(220, 14, 197, 31);
		contentPane.add(btnConexion);
		
		JLabel lblUpdateRegistroid = new JLabel("Update registro");
		lblUpdateRegistroid.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblUpdateRegistroid.setBounds(506, 371, 138, 35);
		contentPane.add(lblUpdateRegistroid);
		
		textUpdate = new JTextField();
		textUpdate.setColumns(10);
		textUpdate.setBounds(445, 406, 284, 20);
		contentPane.add(textUpdate);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(526, 436, 89, 23);
		contentPane.add(btnUpdate);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEliminar.setBounds(506, 329, 138, 23);
		contentPane.add(btnEliminar);
	}
}
