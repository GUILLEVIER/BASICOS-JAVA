package com.guillevier.resumen.clases;

import com.guillevier.resumen.clases.models.User;
import com.guillevier.resumen.dao.UserDao;
import com.guillevier.resumen.impl.UserDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// LISTO
public class App {
  public static void main(String[] args) {
    Connection connection = null;

    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName", "user", "password");
      UserDao userDao = new UserDaoImpl(connection);
      // Uso de métodos de userDao para acceder a los datos.
      userDao.addUser(new User());
      userDao.getAllUsers();
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