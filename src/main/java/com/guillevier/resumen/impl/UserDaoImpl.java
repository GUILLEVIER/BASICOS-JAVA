package com.guillevier.resumen.impl;

import com.guillevier.resumen.clases.models.User;
import com.guillevier.resumen.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

// LISTO
public class UserDaoImpl implements UserDao {
  private Connection connection;
  private PreparedStatement preparedStatement;
  private ResultSet resultSet;

  public UserDaoImpl(Connection connection) {
    this.connection = connection;
  }

  @Override
  public void addUser(User user) {
    // Implementación de método addUser utilizando una base de datos MySQL
  }

  @Override
  public User getUserById(int id) {
    // Implementación de método getUserById utilizando una base de datos MySQL
    return null;
  }

  @Override
  public List<User> getAllUsers() {
    // Implementación de método getAllUsers utilizando una base de datos MySQL
    return null;
  }

  @Override
  public void updateUser(User user) {
    // Implementación de método updateUser utilizando una base de datos MySQL
  }

  @Override
  public void deleteUser(int id) {
    // Implementación de método deleteUser utilizando una base de datos MySQL
  }
}