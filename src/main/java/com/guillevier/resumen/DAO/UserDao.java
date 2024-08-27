package com.guillevier.resumen.DAO;

import com.guillevier.resumen.clases.User;
import java.util.List;

public interface UserDao {
  void addUser(User user);
  User getUserById(int id);
  List<User> getAllUsers();
  void updateUser(User user);
  void deleteUser(int id);
}
