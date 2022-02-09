/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaDespachosCampos = "(Numero int unsigned NOT NULL,"
			+ "Capacidad int unsigned DEFAULT NULL,"
			+ "PRIMARY KEY (Numero));";

	public static String tablaDirectoresCampos = "(DNI varchar(8) NOT NULL,"
			+ "NomApels varchar(255) DEFAULT NULL,"
			+ "DNIJefe varchar(8) DEFAULT NULL,"
			+ "Despacho int unsigned DEFAULT NULL,"
			+ "PRIMARY KEY (DNI),"
			+ "KEY DNIJefe (DNIJefe),"
			+ "KEY Despacho (Despacho),"
			+ "CONSTRAINT Directores_ibfk_1 FOREIGN KEY (DNIJefe) REFERENCES Directores (DNI) ON DELETE CASCADE,"
			+ "CONSTRAINT Directores_ibfk_2 FOREIGN KEY (Despacho) REFERENCES Despachos (Numero) ON DELETE CASCADE);";
				
	public static String insercionTablaDespachos = "(Numero, Capacidad) values "
			+ "(01, 15),"
			+ "(02, 87),"
			+ "(03, 9),"
			+ "(04, 4),"
			+ "(05, 15);";
	
	public static String insercionTablaDirectores = "(DNI, NomApels, DNIJefe, Despacho) values "
			+ "('39999999', 'Raul Garrido', null, 5),"
			+ "('39934459', 'Edgar Fal', '39999999', 3),"
			+ "('39343658', 'Abel Nostara', '39999999', 4),"
			+ "('39967758', 'Ruben Garcia', '39999999', 2),"
			+ "('39917757', 'Pepe Navaroo', '39999999', 1);";
		
}
