package com.nttdata.pe.customer.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "customers")
public class Customer {

    @Id
    @Indexed(unique = true)
    @NotEmpty(message = "{NotEmpty.customer.firstName}")
    @Pattern(regexp = "[1-9][0-9]{8}", message = "{Pattern.customer.firstName}")
    private String dni;

    @NotEmpty(message = "{NotEmpty.customer.firstName}")
    @Pattern(regexp = "[a-zA-Z]{2,20}", message = "{Pattern.customer.firstName}")
    private String firstName;

    @NotEmpty(message = "{NotEmpty.customer.lastName}")
    @Pattern(regexp = "[a-zA-Z]{2,20}", message = "{Pattern.customer.lastName}")
    private String lastName;

    @NotEmpty(message = "{NotEmpty.customer.email}")
    @Email(message = "{Email.customer.email}")
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birth;

    private Boolean isVIP;
    private Boolean isActive;


}
