package com.project.employee_management_system.DTO;

import com.project.employee_management_system.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}