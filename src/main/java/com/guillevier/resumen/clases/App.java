package com.guillevier.resumen.clases;



import com.guillevier.resumen.DAO.UserDao;
import com.guillevier.resumen.IMPL.UserDaoImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
  public static void main(String[] args) {
    Connection connection = null;

    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/resumen", "user", "password");
      UserDao userDao = new UserDaoImpl(connection);
      // Uso de métodos de userDao para acceder a los datos.
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
