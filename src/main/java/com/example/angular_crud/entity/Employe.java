package com.example.angular_crud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "employe")
@Data
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String firstName;

    private  String lastName;

    private String phone;


}
