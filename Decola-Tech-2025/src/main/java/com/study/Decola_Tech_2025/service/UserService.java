package com.study.Decola_Tech_2025.service;

import com.study.Decola_Tech_2025.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
