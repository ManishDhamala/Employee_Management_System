package com.project.employee_management_system.service;

import com.project.employee_management_system.DTO.UserRegistrationDto;
import com.project.employee_management_system.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
