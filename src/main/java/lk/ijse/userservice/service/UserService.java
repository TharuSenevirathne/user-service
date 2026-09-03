package lk.ijse.userservice.service;

import lk.ijse.userservice.entity.User;
import lk.ijse.userservice.dto.UserRequest;
import lk.ijse.userservice.dto.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponse createUser(UserRequest request);
    Optional<UserResponse> findById(Long id);
    List<UserResponse> getAllUsers();
    List<UserResponse> searchUsers(String keyword);
    UserResponse updateUser(Long id, UserRequest request);
    void deleteUser(Long id);
}
