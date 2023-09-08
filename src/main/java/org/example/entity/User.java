package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.converter.BirthdayConverter;

import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    private String username;
    private String firstname;
    private String lastname;
//    @Convert(converter = BirthdayConverter.class)
    private Birthday birthDate;
}
