package com.gustavo.project1.service;

import com.gustavo.project1.dtos.UserDTO;
import com.gustavo.project1.model.UserModel;
import com.gustavo.project1.reposytory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setName(userDTO.getName());
        userModel.setEmail(userDTO.getEmail());
        userModel.setPassword(userDTO.getPassword());
        userRepository.save(userModel);
    }

}
