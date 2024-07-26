package me.dio.springBoot_project.service;

import me.dio.springBoot_project.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
