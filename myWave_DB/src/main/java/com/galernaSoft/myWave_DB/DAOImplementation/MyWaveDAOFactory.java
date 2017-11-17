package com.galernaSoft.myWave_DB.DAOImplementation;

import java.sql.*;


/** Java class for setting up the database connection and calling the DAO interfaces
 * 
 * @author Jaione Arrizabalaga
 * @version 1.0, 09 March 2017
 */
public class MyWaveDAOFactory{
	
	/**
	 * WiBoltQBDAOFactory static instance to call the connection and DAO classes
	 */
	private static MyWaveDAOFactory instance = new MyWaveDAOFactory();
	
	/**
	 * Static variable indicating the path to the MySql driver
	 */
	public static final String DRIVER=
	 "com.mysql.jdbc.Driver";
	
	/**
	 * Static variable indicating the path to the database
	 */
	public static final String DBURL=
	 "jdbc:mysql://localhost/myWave?";
	
	
	public MyWaveDAOFactory(){}
	
	/** Method to create WiBoltQB connections
	 * @return Connection
	 */
	public Connection createConnection() {
		Connection conn = null;
		try {
            Class.forName(DRIVER).newInstance();
            
            conn = DriverManager.getConnection(DBURL +
                                                "user=mgm&password=ekiten*88&useSSL=false&allowMultiQueries=true");
        } catch (Exception ex) {
            // handle the error
        	System.out.println(ex.getMessage());
        }
		
		return conn;
	}
	
	/** Method that returns a newly created MySql connection
	 * @return Connection
	 */
	public static Connection getConnection() {
        return instance.createConnection();
    }
	
	/** Method to return a newly created DomainDAO
	 * @return DomainDAO
	 */
//	public DomainDAO getDomainDAO() {
//		return new WiBoltQBDomainDAO();
//	}
	

}