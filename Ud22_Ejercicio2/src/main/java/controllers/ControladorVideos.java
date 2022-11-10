package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.sql.Connection;


import models.Modelo;
import models.ModeloConexion;
import views.VistaVideos;

public class ControladorVideos implements ActionListener {
	
	private ModeloConexion modeloconexion;
	private VistaVideos vista;
	private Connection conexion;

	public ControladorVideos (Connection conexion, ModeloConexion modeloconexion, VistaVideos vista) {
		this.modeloconexion=modeloconexion;
		this.vista = vista;
		this.conexion = modeloconexion.createConexion();
		this.vista.btnInsertarValores.addActionListener(this);
		this.vista.btnVerelementos.addActionListener(this);
		this.vista.btnConsulta.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnUpdate.addActionListener(this);

		
	}
	
	public void iniciarVista() {
		vista.setTitle("Vista principal");
		vista.pack();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setBounds(500, 500, 800, 600);
		vista.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		if(vista.btnInsertarValores==event.getSource()) {
			modeloconexion.insertDataVideos(conexion, "ejercicio2","videos", vista.txtTitle.getText(), vista.txtDirector.getText(),Integer.parseInt(vista.txtIdCliente.getText()));
			
		}
		else if(vista.btnVerelementos==event.getSource()) {
			vista.textPane.setText(modeloconexion.getValues(conexion, "ejercicio2", "video"));
		}
		else if(vista.btnConsulta==event.getSource()) {
			vista.textPane.setText(modeloconexion.consulta(conexion, "ejercicio2", vista.txtConsulta.getText()));
		}
		else if(vista.btnEliminar==event.getSource()) {
			modeloconexion.deleteRecord(conexion, "ejercicio2", "cliente", vista.txtEliminar.getText());
		}
		else if(vista.btnUpdate==event.getSource()) {
			modeloconexion.updateRecord(conexion, "ejercicio2", "cliente", vista.textUpdate.getText());
		}
	}

}
