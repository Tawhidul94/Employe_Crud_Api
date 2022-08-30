package com.example.angular_crud.service;

import com.example.angular_crud.entity.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeService {

    public Employe saveEmploye(Employe employe);

    public Employe updateEmploye(Employe employe,Long id);

    void deleteEmploye(Long id);

    public Optional<Employe> findById(Long id);

    public List<Employe> findAllEmploye();
}
