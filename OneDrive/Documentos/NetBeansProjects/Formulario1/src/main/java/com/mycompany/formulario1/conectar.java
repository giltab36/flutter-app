/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulario1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author snowr
 */
public class conectar {
    
    private static final String db = "sistema";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://167.0.0.1:3306/"+db;
 
    private static Connection conexion;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(conectar.class.getName()).log(Level.SERVER, null, ex);
        } catch(SQLException ex){
            Logger.getLogger(conectar.class.getName()).log(Level.SERVER, null, ex);
        }
    }
}
