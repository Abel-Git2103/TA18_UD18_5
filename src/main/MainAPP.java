/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainAPP {

	public static void main(String[] args) {

		Mysql.openConnection();		
		System.out.println("");
		
		Mysql.createDB("Directores");
		
		Mysql.createTable("Directores", "Despachos", Inserciones.tablaDespachosCampos);
		Mysql.createTable("Directores", "Directores", Inserciones.tablaDirectoresCampos);
		
		Mysql.insertData("Directores", "Despachos", Inserciones.insercionTablaDespachos);
		Mysql.insertData("Directores", "Directores", Inserciones.insercionTablaDirectores);
		
		Mysql.getValues("Directores", "Directores");
		
		Mysql.deleteRecord("Directores", "Directores", 2);
		
		Mysql.getValues("Directores", "Directores");
		
		System.out.println("");
		Mysql.closeConnection();
	}

}
