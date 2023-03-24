package com.school.models.dto;

import com.school.models.dao.Address;
import com.school.models.dao.Roles;
import com.school.models.dao.School;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

@Data
@ToString
public class UsersDto {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String emailId;
    private String password;
    private String phoneNumber;
    private Roles roles;
    private School school;
    private Set<Address> addressSet;
}
