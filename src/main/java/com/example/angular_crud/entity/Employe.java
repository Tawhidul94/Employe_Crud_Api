package com.example.angular_crud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employe")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String firstName;

    private  String lastName;

    private String phone;


}
