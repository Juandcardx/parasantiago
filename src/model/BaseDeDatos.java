package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDeDatos {
    // Se definen los métodos para las consultas de la base de datos planillas
    public static ResultSet getResultPlanilla(String query) {
        ResultSet miResultSet = null;
        try {
            Connection miConexion = DriverManager.getConnection(
                    "jdbc:h2:/home/juancard/Escritorio/Pooproyect/SistemaEmpleados/planillas",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miResultSet = miStatement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return miResultSet;
    }

    public static void setDataPlanilla(String query) {
        try {
            Connection miConexion = DriverManager.getConnection(
                    "jdbc:h2:/home/juancard/Escritorio/Pooproyect/SistemaEmpleados/planillas",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miStatement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Se definen los métodos para las consultas de la base de datos recibos
    public static ResultSet getResultRecibo(String query) {
        ResultSet miResultSet = null;
        try {
            Connection miConexion = DriverManager.getConnection(
                    "jdbc:h2:/home/juancard/Escritorio/Pooproyect/SistemaEmpleados/recibos",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miResultSet = miStatement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return miResultSet;
    }

    public static void setDataRecibo(String query) {
        try {
            Connection miConexion = DriverManager.getConnection(
                    "jdbc:h2:/home/juancard/Escritorio/Pooproyect/SistemaEmpleados/recibos",
                    "root", "");
            Statement miStatement = miConexion.createStatement();
            miStatement.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
