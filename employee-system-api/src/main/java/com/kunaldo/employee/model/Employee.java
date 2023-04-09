package com.kunaldo.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


// To get constructor with all the arguments and with no arguments
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
