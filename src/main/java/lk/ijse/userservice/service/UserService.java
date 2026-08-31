package lk.ijse.userservice.service;

import lk.ijse.userservice.entity.User;
import lk.ijse.userservice.dto.UserRequest;
import lk.ijse.userservice.dto.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponse register(User user);
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    UserResponse getUserByUsername(String username);
    UserResponse getUserById(Long id);
    List<UserResponse> getAllUsers();
    UserResponse updateUser(Long id, UserRequest request);
    void deleteUser(Long id);
}
