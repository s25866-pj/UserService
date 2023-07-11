package com.example.UserManagment.Repository;

import com.example.UserManagment.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}
