package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento3;

public class Requerimiento_3Dao {
   
    public ArrayList <Requerimiento3> rankingRequerimiento3() throws SQLException {
        
            ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
            Connection conexion = JDBCUtilities.getConnection();
    
            try{       
    
                String consulta =   "SELECT ID_Proyecto, Constructora, Porcentaje_Cuota_Inicial, Acabados "+
                                    "FROM Proyecto "+
                                    "WHERE Ciudad = 'Quibdo' "+
                                    "AND Clasificacion = 'Apartaestudio' ";
    
    
                PreparedStatement statement = conexion.prepareStatement(consulta);
                ResultSet resultSet = statement.executeQuery();
    
                //Recorrer los registros en los VO específicos
                while(resultSet.next()){
                    Requerimiento3 requerimiento3 = new Requerimiento3();
                    requerimiento3.setID_Proyecto(resultSet.getInt("ID_Proyecto"));
                    requerimiento3.setConstructora(resultSet.getString("Constructora"));
                    requerimiento3.setPorcentaje_Cuota_Inicial(resultSet.getFloat("Porcentaje_Cuota_Inicial"));
                    requerimiento3.setAcabados(resultSet.getString("Acabados")); 
                    
    
                    //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                    respuesta.add(requerimiento3);
                }
    
                resultSet.close();
                statement.close();
    
            }catch(SQLException e){
                System.err.println("Error consultando los proyectos por estrato: "+e.getMessage());
            }finally{
                if(conexion != null){
                    conexion.close();
                }
            }
    
            //Retornar la colección de vo's
            return respuesta;
        }  
    }