package com.guillevier.resumen.dao;

import com.guillevier.resumen.clases.models.User;

import java.util.List;

// LISTO
public interface UserDao {
  void addUser(User user);

  User getUserById(int id);

  List<User> getAllUsers();

  void updateUser(User user);

  void deleteUser(int id);
}