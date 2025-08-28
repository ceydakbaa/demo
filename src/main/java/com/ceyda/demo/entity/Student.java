package com.ceyda.demo.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(mappedBy = "student"   ,cascade = CascadeType.ALL , fetch = FetchType.LAZY )
    @JsonManagedReference //--- bu kısım ticket [SP-09] için sonsuz döngüyü kırmak için kullanıyoruz.
    private List<Book> books;

}
