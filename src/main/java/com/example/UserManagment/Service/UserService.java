package com.example.UserManagment.Service;

import com.example.UserManagment.Model.UserModel;
import com.example.UserManagment.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserModel> findById(Long id) {
        return userRepository.findById(id);
    }

    public List<UserModel> getAll() {
        List<UserModel> allUser = userRepository.findAll();
        return allUser;
    }
}
